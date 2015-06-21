package JoguinhoRPG;

import Teste.Lutador;

public class Heroi {
	private String nome;
	private double vida;
	private double destreza;
	private double energia;
	
	public Heroi(String nome, String papel){
		this.nome = nome;
		this.vida = 100;
		this.energia = 100;
		
	}
	/*
	public void ataca(Heroi outroHeroi){
		
		if (vida > 0){
			
			energia -= 20;
			
			System.out.println("Atacou " + outroLutador.getNome());
			
			habilidade.usaHabilidade();
			outroLutador.recebeDano(habilidade.getDanoDaHabilidade() * danoCritico);
		} else{
			System.out.println("Não foi possível atacar");
		}
	}*/
	
}
