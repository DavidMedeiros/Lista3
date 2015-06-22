package JoguinhoRPG;

import Exceptions.DadoInvalidoException;
import Exceptions.EntradaException;
import Teste.Lutador;

public class Heroi {
	private String nome;
	private double vida;
	private double destreza;
	private double energia;
	private Papel papel;
	private double poder;
	private double defesa;

	public Heroi(String nome, String papel, double poder, double defesa,
			double destreza) throws EntradaException {
		this.nome = nome;
		this.vida = 100;
		this.energia = 100;
		this.poder = poder;
		this.defesa = defesa;

		// criar factory dps
		if (papel.equals("protetor")) {
			this.papel = new Protetor(poder, defesa);
		}
		if (papel.equals("assassino")) {
			this.papel = new Assassino(poder, defesa);
		}
		if (papel.equals("curandeiro")) {
			this.papel = new Curandeiro(poder, defesa);
		}

		if (destreza >= 1 && destreza <= 100) {
			this.destreza = destreza;
		} else {
			throw new DadoInvalidoException();
		}
	}

	public void ataca(Heroi outroHeroi) {

		if (vida > 0) {

			energia -= 20;

			double moeda = Math.random();
			if (moeda < (destreza * 0.01)) {
				outroHeroi.recebeDano(papel.ataca());
				System.out.println("Atacou " + outroHeroi.getNome());

			} else {
				System.out.println("Não foi possível atacar "
						+ outroHeroi.getNome());
			}

		} else {
			System.out.println("Não foi possível atacar");
		}
	}

	private void recebeDano(double dano) {
		double moeda = Math.random();
		if (moeda < (destreza * 0.01)) {
			vida += papel.defende() + dano;
		} else {
			vida += dano;
			System.out.println("Ataque total recebido.");
		}
	}

	public void cura(Heroi outroHeroi) {

		if (vida > 0) {

			energia -= 20;

			double moeda = Math.random();
			if (moeda < (destreza * 0.01)) {
				outroHeroi.setVida(outroHeroi.getVida() + papel.cura());
			} else {
				System.out.println("Não foi possível curar "
						+ outroHeroi.getNome());
			}

		} else {
			System.out.println("Não foi possível curar");
		}
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public String getNome() {
		return nome;
	}

	public double getVida() {
		return vida;
	}

	public double getDestreza() {
		return destreza;
	}

	public double getEnergia() {
		return energia;
	}

	public Papel getPapel() {
		return papel;
	}

	public double getPoder() {
		return poder;
	}

	public double getDefesa() {
		return defesa;
	}

}
