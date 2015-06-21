package JoguinhoRPG;

public class Assassino extends Papel {

	public Assassino(double poder, double defesa) {
		super(poder, defesa);
	}
	
	@Override
	public double ataca() {
		return (getPoder() + (getPoder() * 0.45)) * -1;
	}

	@Override
	public double defende() {
		return (getDefesa() - (getDefesa() * 0.5));
	}

	@Override
	public double cura() {
		return getPoder();
	}
}
