package JoguinhoRPG;

public abstract class Papel {
	
	private double poder;
	private double defesa;
	
	public Papel(double poder, double defesa){
		this.poder = poder;
		this.defesa = defesa;
	}

	public abstract double ataca();
	
	public abstract double defende();
	
	public abstract double cura();

	public double getPoder() {
		return poder;
	}

	public double getDefesa() {
		return defesa;
	}

	public void setPoder(double poder) {
		this.poder = poder;
	}

	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}
	
	
	
	
}
