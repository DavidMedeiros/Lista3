package Q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Banco {
	private List<ContaBancaria> listaDeContas;
	
	public Banco(){
		listaDeContas = new ArrayList<ContaBancaria>();
	}
	
	public void criaContaBancaria(String nome, double rendaMensalTitular, double renda, String tipo){
		FactoryContaBancaria factory = new FactoryContaBancaria();
		ContaBancaria contaBancaria = factory.criaContaBancaria(nome, rendaMensalTitular, renda, tipo);
		
		listaDeContas.add(contaBancaria);
	}
	
	public void fecharConta(String nome){
		for (ContaBancaria contaBancaria : listaDeContas) {
			if (contaBancaria.getNome().equals(nome)){
				listaDeContas.remove(contaBancaria);
				return;
			}
		}
	}
	
	public void verificarFinanciamento(String nome){
		for (ContaBancaria contaBancaria : listaDeContas) {
			if (contaBancaria.getNome().equals(nome)){
				System.out.println("Valor do financiamento para a sua conta, " + contaBancaria.getNome() + ", é de: " +  contaBancaria.emprestimo());
			}
		}
	}

	public void verificarProjecao(String nome, int quantidadeMeses, double valorInvestimento) {
		for (ContaBancaria contaBancaria : listaDeContas) {
			if (contaBancaria.getNome().equals(nome)) {
				System.out.println(contaBancaria.getNome() + ", a projecao para a sua conta em "
						+ quantidadeMeses
						+ " meses, para um investimento de R$ "
						+ valorInvestimento
						+ " é de : "
						+ contaBancaria.projecao(quantidadeMeses,
								valorInvestimento));
			}
		}
	}

	public void financiamentoTotal() {
		double financiamentoTotal = 0;

		for (ContaBancaria contaBancaria : listaDeContas) {
			financiamentoTotal += contaBancaria.emprestimo();
		}

		System.out
				.println("O total de dinheiro necessário para fornecer o financiamento a todos os clientes é de: "
						+ financiamentoTotal);
	}

	public void ordenaContas() {
		Collections.sort(listaDeContas);
	}
	
	public List<ContaBancaria> getListaDeContas() {
		return listaDeContas;
	}
	
	
}
