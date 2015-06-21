package Q4;

public class ContaElite extends ContaBancaria {

	public ContaElite(String nome, double rendaMensalTitular, double renda) {
		super(nome, rendaMensalTitular, renda);
	}

	@Override
	public double projecao(int quantidadeMeses, double valorInvestimento) {
		double juros = 0.15;
		double projecao = valorInvestimento + (valorInvestimento * juros);
		
		for (int i = 0; i < quantidadeMeses - 1 ; i++) {
			projecao += projecao * juros; 
		}
		return projecao;
	}

	@Override
	public double emprestimo() {
		double juros = 0.10;
		double projecao = getRenda() + (getRenda() * juros);
		
		for (int i = 0; i < 5 - 1 ; i++) {
			projecao += projecao * juros; 
		}
		
		return getRendaMensalTitular() + 0.1 * projecao ;
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
