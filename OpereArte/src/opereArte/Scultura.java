package opereArte;

public class Scultura extends OperaArte {
	
	private double larghezza, altezza, profondita;

	public Scultura(String nomeOpera, String nomeAutore) {
		super(nomeOpera, nomeAutore);
	}
	
	public Scultura(String nomeOpera, String nomeAutore, double larghezza, double altezza, double profondita) {
		super(nomeOpera, nomeAutore);
		this.altezza=altezza;
		this.larghezza=larghezza;
		this.profondita=profondita;
	}
	
	public double ingombro() {
		return this.altezza*this.larghezza*this.profondita;
	}
	
	public String printIngombro() {
		String output = "Altezza: "+ this.altezza +" cm; \n"
				+ "Larghezza: " + this.larghezza +" cm; \n"
				+ "Profondita: " + this.profondita +" cm; \n"
				+ "Ingombro: " + ingombro() + " cm^3";
		
		return output;
	}
	
	public void setAltezza(double altezza) {
		this.altezza=altezza;
	}
	
	public void setLarghezza(double larghezza) {
		this.larghezza=larghezza;
	}
	
	public void setProfondita(double profondita) {
		this.profondita=profondita;
	}
	
	public double getAltezza() {
		return this.altezza;
	}
	
	public double getLarghezza() {
		return this.larghezza;
	}
	
	public double getProfondita() {
		return this.profondita;
	}

}
