package opereArte;

public class Quadro extends OperaArte {
	
	private double larghezza, altezza;
	
	public Quadro(String nomeOpera, String nomeAutore) {
		super(nomeOpera, nomeAutore);
	}

	public Quadro(String nomeOpera, String nomeAutore, double larghezza, double altezza) {
		super(nomeOpera, nomeAutore);
		this.altezza=altezza;
		this.larghezza=larghezza;
	}
	
	public double ingombro() {
		return this.altezza*this.larghezza;
	}
	
	public String printIngombro() {
		String output = "Altezza: "+ this.altezza +" cm; \n"
				+ "Larghezza: " + this.larghezza +" cm; \n"
				+ "Ingombro: " + ingombro() + " cm^2";
		
		return output;
	}
	
	public void setAltezza(double altezza) {
		this.altezza=altezza;
	}
	
	public void setLarghezza(double larghezza) {
		this.larghezza=larghezza;
	}
	
	public double getAltezza() {
		return this.altezza;
	}
	
	public double getLarghezza() {
		return this.larghezza;
	}
}
