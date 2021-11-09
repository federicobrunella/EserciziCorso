package oggetti;
import java.util.Random;

public class Moneta extends OggettoLanciato{

	public short lancio() {
		Random rand = new Random();
		this.esito = (short)rand.nextInt(2);
		return this.esito;
	}
	
	public String toString() {
		// 0 == testa 1 == croce
		if(this.esito==0)
			return "Esito lancio moneta: testa";
		else
			return "Esito lancio moneta: croce";
	}

}
