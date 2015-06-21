package Q2;

public class Main {
	public static void main(String[] args) {
		Produto detergente = new Limpeza("Detergente", 7, 3.50);
		Produto tapioca = new Alimento("Tapioca", 5, 2.40, true);
		Produto melancia = new Alimento("Melancia", 3, 5.40, true);
		Produto sabonete = new Limpeza("Sabonete", 10, 2.40);
		
		Carrinho carrinho = new Carrinho();
		carrinho.adicionaProduto(tapioca);
		carrinho.adicionaProduto(tapioca);
		carrinho.adicionaProduto(detergente);
		carrinho.removeProduto(tapioca);
		carrinho.adicionaProduto(sabonete);
		carrinho.adicionaProduto(melancia);
		
		carrinho.consultaProduto("Detergente");
		carrinho.consultaProduto("Sabonete");
		carrinho.consultaProduto("Melao");
		
		System.out.println("");
		System.out.print("Valor total dos produtos no carrinho: R$ ");
		carrinho.calculaPrecoCarrinho();
		
		System.out.println("Alimentos no carrinho: " + carrinho.listaAlimentosNoCarrinho());
		System.out.println("Produtos de limpeza no carrinho: " + carrinho.listaLimpezaNoCarrinho());
		
		
		System.out.println("Lista de produtos no carrinho: " + carrinho.getListaDeProdutos());
		carrinho.ordenaCarrinho();
		System.out.println("Lista de produtos ordenada pelo preco base: " + carrinho.getListaDeProdutos());
		carrinho.ordenaCarrinhoQuantidade();
		System.out.println("Lista de produtos ordenada pela quantidade de produtos: " + carrinho.getListaDeProdutos());
		carrinho.ordenaCarrinhoNome();
		System.out.println("Lista de produtos ordenada pelo nome dos produtos: " + carrinho.getListaDeProdutos());
	}
}
