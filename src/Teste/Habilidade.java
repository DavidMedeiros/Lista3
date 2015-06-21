package Teste;

public class Habilidade{
	
	private String nome;
	private int danoDaHabilidade;
	private int custoDeEnergia;
	private String tipoDeDano;
	
	public Habilidade(String nome, int danoDaHabilidade, int custoDeEnergia, String tipoDeDano){
		this.nome = nome;
		this.danoDaHabilidade = danoDaHabilidade;
		this.custoDeEnergia = custoDeEnergia;
		this.tipoDeDano = tipoDeDano;
	}
	
	public void usaHabilidade(){
		System.out.println("Gastou " + custoDeEnergia + " de energia. " + nome + " causa " + danoDaHabilidade + " de dano.");
	}
	
	public String getNome(){
		return nome;
	}
	
	public int getDanoDaHabilidade(){
		return danoDaHabilidade;
	}
	
	public int getCustoDeEnergia(){
		return custoDeEnergia;
	}
	
	public String getTipoDeDano(){
		return tipoDeDano;
	}
}