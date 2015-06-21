package Q2;

public class Limpeza extends Produto {
	private double descontoProdutoDeLimpeza;
	
	public Limpeza(String nome, int quantidade, double precoBase) {
		super(nome, quantidade, precoBase);
		descontoProdutoDeLimpeza = 0.1;
	}

	@Override
	public double compraProduto() {
		double precoProduto = (this.getPrecoBase() * this.getQuantidade());
		return (precoProduto - (descontoProdutoDeLimpeza * (this.getQuantidade() - 4) * precoProduto));
		 
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int compareTo(Produto produto) {
		if (getPrecoBase() < produto.getPrecoBase()){
			return -1;
		}
		if (getPrecoBase() > produto.getPrecoBase()){
			return 1;
		}
		return 0;
	}
	
	@Override
	public boolean equals(Object produto) {
		if (produto instanceof Produto) {
			Produto outroProduto = (Produto) produto;
			if (outroProduto.getNome().equals(getNome())
					&& outroProduto.getPrecoBase() == getPrecoBase()) {
				return true;
			}
		}
		return false;
	}
	
}
