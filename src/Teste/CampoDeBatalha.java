package Teste;

public class CampoDeBatalha {

	public static void main(String[] args){
		
		Habilidade bolaDeFogo = new Habilidade("Bola de Fogo", 60, 5, "Gelo");
		Habilidade raioDeGelo = new Habilidade("Raio de Gelo", 20, 3, "Fogo");
		Habilidade chuteAtomico = new Habilidade("Chute Atomico", 35, 4, "Fisico");
		
		Lutador jogador1 = new Lutador("Juliana", 100, bolaDeFogo);
		Lutador jogador2 = new Lutador("Maria", 1000, chuteAtomico);
		
		
		jogador2.ataca(jogador1);
		jogador2.ataca(jogador1);
		jogador2.ataca(jogador1);
	
		
	}
}
