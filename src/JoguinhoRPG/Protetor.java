package JoguinhoRPG;

public class Protetor extends Papel {

	public Protetor(double poder, double defesa) {
		super(poder, defesa);
	}

	@Override
	public double ataca() {
		return getPoder() * -1;
	}

	@Override
	public double defende() {
		return (getDefesa() + (getDefesa() * 0.5));
	}

	@Override
	public double cura() {
		return getPoder();
	}

}
