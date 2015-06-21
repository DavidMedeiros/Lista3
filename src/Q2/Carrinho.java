package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Carrinho{
	private List<Produto> listaDeProdutos;
	
	public Carrinho(){
		listaDeProdutos = new ArrayList<Produto>();
	}
	
	public void adicionaProduto(Produto produto){
		listaDeProdutos.add(produto);
	}
	
	public void removeProduto(Produto produto){
		listaDeProdutos.remove(produto);
	}
	
	public void ordenaCarrinho(){
		Collections.sort(listaDeProdutos);
	}
	
	public void ordenaCarrinhoQuantidade(){
		OrdenaQuantidade comparator = new OrdenaQuantidade();
		Collections.sort(listaDeProdutos, comparator);
	}
	
	public void ordenaCarrinhoNome(){
		OrdenaNomeProdutos comparator = new OrdenaNomeProdutos();
		Collections.sort(listaDeProdutos, comparator);
	}
	
	public void consultaProduto(String nomeDoProduto){
		for (Produto produto : listaDeProdutos) {
			if (produto.getNome().equals(nomeDoProduto)){
				System.out.println("Produto Encontrado");
				return;
			}
		}
		System.out.println("Produto nao encontrado");
	}
	
	public void calculaPrecoCarrinho(){
		double precoTotal = 0;
		for (Produto produto : listaDeProdutos) {
			precoTotal += produto.compraProduto();
		}
		
		System.out.println(precoTotal);
	}
	
	public List<Alimento> listaAlimentosNoCarrinho(){
		List<Alimento> listaDeAlimentos = new ArrayList<Alimento>();
		for (Produto produto : listaDeProdutos) {
			if (produto instanceof Alimento){
				listaDeAlimentos.add((Alimento) produto);
			}		
		}
		return listaDeAlimentos;
	}
	
	public List<Limpeza> listaLimpezaNoCarrinho(){
		List<Limpeza> listaDeLimpeza = new ArrayList<Limpeza>();
		for (Produto produto : listaDeProdutos) {
			if (produto instanceof Limpeza){
				listaDeLimpeza.add((Limpeza) produto);
			}		
		}
		return listaDeLimpeza;
	}

	public List<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}
	
	

}
