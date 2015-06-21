package Q2;

public abstract class Produto implements Comparable<Produto>{
	private String nome;
	private int quantidade;
	private double precoBase;
	
	public Produto(String nome, int quantidade, double precoBase){
		this.nome = nome;
		this.quantidade = quantidade;
		this.precoBase = precoBase;
	}
	
	public abstract double compraProduto();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	@Override
	public String toString() {
		return this.nome;
	}
	
}
