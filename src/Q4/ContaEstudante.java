package Q4;

public class ContaEstudante extends ContaBancaria {

	public ContaEstudante(String nome, double rendaMensalTitular, double renda) {
		super(nome, rendaMensalTitular, renda);
	}

	@Override
	public double projecao(int quantidadeMeses, double valorInvestimento) {
		double juros = 0.02;
		double projecao = valorInvestimento + (valorInvestimento * juros);
		
		for (int i = 0; i < quantidadeMeses - 1 ; i++) {
			projecao += projecao * juros; 
		}
		return projecao;
	}

	@Override
	public double emprestimo() {
		return getRendaMensalTitular() / 2;
	}
	
	@Override
	public int compareTo(ContaBancaria contaBancaria) {
		if (contaBancaria.getRendaMensalTitular() < getRendaMensalTitular()){
			return -1;
		}
		if (contaBancaria.getRendaMensalTitular() > getRendaMensalTitular()){
			return 1;
		}
		return 0;
	}

}
