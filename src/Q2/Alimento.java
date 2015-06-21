package Q2;

public class Alimento extends Produto {
	private boolean contemGlutem;
	private double descontoAlimentoComGlutem;
	
	public Alimento(String nome, int quantidade, double precoBase, boolean contemGlutem) {
		super(nome, quantidade, precoBase);
		this.descontoAlimentoComGlutem = 0.5;
		this.contemGlutem = contemGlutem;
	}

	@Override
	public double compraProduto() {
		if (contemGlutem){
			return (this.getPrecoBase() * this.getQuantidade() * descontoAlimentoComGlutem);
		} else {
			return (this.getPrecoBase() * this.getQuantidade()); 
		}
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
