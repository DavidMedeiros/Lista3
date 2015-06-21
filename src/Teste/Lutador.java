package Teste;


public class Lutador {
	
	private String nome;
	private int hP;
	private Habilidade habilidade;
	
	public Lutador(String nome, int hP, Habilidade habilidade){
		this.nome = nome;
		this.hP = hP;
		this.habilidade = habilidade;
	}
	
	public void recebeDano(int dano){
		this.hP -= dano;
		
		if (hP <= 0){
			System.out.println(nome + " está desmaiado.");
		}
			
	}
	
	public void ataca(Lutador outroLutador){
		
		if (hP >= habilidade.getCustoDeEnergia()){
			
			int danoCritico;
			
			double moeda = Math.random();
			if(moeda < 0.5){
				danoCritico = 2;
				System.out.println("Dano critico.");
			}else{
				danoCritico = 1;
			}
			
			hP -= habilidade.getCustoDeEnergia();
			
			System.out.println("Atacou " + outroLutador.getNome());
			
			habilidade.usaHabilidade();
			outroLutador.recebeDano(habilidade.getDanoDaHabilidade() * danoCritico);
		} else{
			System.out.println("Não foi possível usar " + habilidade.getNome());
		}
	}
	
	public String getNome(){
		return nome;
	}
}
