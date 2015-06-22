package JoguinhoRPG;

public class Papel {
	
	private double poder;
	private double defesa;
	
	public Papel(double poder, double defesa){
		this.poder = poder;
		this.defesa = defesa;
	}

	public double ataca(){
		return getPoder() * -1;
	}
	
	public double defende() {
		return getDefesa();
	}
	
	public double cura() {
		return getPoder();
	}

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
