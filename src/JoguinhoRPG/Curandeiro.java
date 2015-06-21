package JoguinhoRPG;

public class Curandeiro extends Papel {

	public Curandeiro(double poder, double defesa) {
		super(poder, defesa);
	}

	@Override
	public double ataca() {
		return (getPoder() - (getPoder() * 0.5)) * -1;
	}

	@Override
	public double defende() {
		return getDefesa();
	}

	@Override
	public double cura() {
		setPoder(getPoder() + (getPoder() * 0.4));
		return getPoder();
	}
}
