package oggetti;
import java.util.Random;

public class Dado extends OggettoLanciato {

	public short lancio() {
		Random rand = new Random();
		this.esito = (short)(rand.nextInt(7-1)+1);
		return this.esito;
	}
	
	public String toString() {
		return "Esito lancio dado: " + this.esito;
	}
}
