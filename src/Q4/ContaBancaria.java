package Q4;

public abstract class ContaBancaria implements Comparable<ContaBancaria>{
	private String nome;
	private double saldo;
	private double rendaMensalTitular;
	private double renda;
	
	public ContaBancaria(String nome, double rendaMensalTitular, double renda){
		this.nome = nome;
		this.rendaMensalTitular = rendaMensalTitular;
		this.renda = renda;
		this.saldo = 0;
	}

	public void depositar(double valor){
		saldo = saldo + valor;
	}
	
	public void sacar(double valor){
		saldo = saldo - valor;
	}
	
	public abstract double projecao(int quantidadeMeses, double valorInvestimento);
	
	public abstract double emprestimo();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getRendaMensalTitular() {
		return rendaMensalTitular;
	}

	public void setRendaMensalTitular(double rendaMensalTitular) {
		this.rendaMensalTitular = rendaMensalTitular;
	}

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
}

