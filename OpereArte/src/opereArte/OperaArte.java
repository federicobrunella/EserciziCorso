package opereArte;

public abstract class OperaArte {
	
	protected String nomeOpera;
	protected String nomeAutore;
	

	public OperaArte(String nomeOpera, String nomeAutore) {
		this.nomeAutore=nomeAutore;
		this.nomeOpera=nomeOpera;
	}
	
	public abstract double ingombro();
	
	public boolean equals(Object obj)
	{
		if(obj instanceof OperaArte) {
			OperaArte toConfr = (OperaArte) obj;
			if(toConfr.nomeOpera.equals(this.nomeOpera) && toConfr.nomeAutore.equals(this.nomeAutore))
				return true;
			else return false;
		}
		else
			return false;
	}
	
	public String toString() {
		String output = "Nome Opera: " + this.nomeOpera + " -- Autore: " + this.nomeAutore + "\n";
		
		return output;
	}
	
	public abstract String printIngombro();
	
}
