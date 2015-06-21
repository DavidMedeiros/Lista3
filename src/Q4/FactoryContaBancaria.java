package Q4;

public class FactoryContaBancaria {

	private ContaBancaria criaContaElite(String nome, double rendaMensalTitular, double renda) {
		ContaBancaria contaElite = new ContaElite(nome, rendaMensalTitular, renda);
		return contaElite;
	}
	
	private ContaBancaria criaContaEstudante(String nome, double rendaMensalTitular, double renda) {
		ContaBancaria contaEstudante = new ContaEstudante(nome, rendaMensalTitular, renda);
		return contaEstudante;
	}
	
	private ContaBancaria criaContaNormal(String nome, double rendaMensalTitular, double renda) {
		ContaBancaria contaNormal = new ContaNormal(nome, rendaMensalTitular, renda);
		return contaNormal;
	}
	
	private ContaBancaria criaContaPoupanca(String nome, double rendaMensalTitular, double renda) {
		ContaBancaria contaPoupanca = new ContaPoupanca(nome, rendaMensalTitular, renda);
		return contaPoupanca;
	}
	
	public ContaBancaria criaContaBancaria(String nome, double rendaMensalTitular, double renda, String tipo) {
		if (tipo.toLowerCase().equals("elite") || tipo.toLowerCase().equals("conta elite")) {
			return criaContaElite(nome, rendaMensalTitular, renda);
		}
		
		if (tipo.toLowerCase().equals("estudante") || tipo.toLowerCase().equals("conta estudante")) {
			return criaContaEstudante(nome, rendaMensalTitular, renda);
		}
		
		if (tipo.toLowerCase().equals("normal") || tipo.toLowerCase().equals("conta normal")) {
			return criaContaNormal(nome, rendaMensalTitular, renda);
		}
		
		if (tipo.toLowerCase().equals("poupanca") || tipo.toLowerCase().equals("conta poupanca")) {
			return criaContaPoupanca(nome, rendaMensalTitular, renda);
		}
		
		return null;
	}
}
