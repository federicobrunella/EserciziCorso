package oggetti;

public class OggettoLanciato {

	protected short esito;
	
	public short lancio() {
		this.esito = -1;
		return this.esito;
	}
	
	public int getEsito() {
		return this.esito;
	}
	
	public String toString() {
		return "Esito: "+ this.esito +" (default)";
	}
}
