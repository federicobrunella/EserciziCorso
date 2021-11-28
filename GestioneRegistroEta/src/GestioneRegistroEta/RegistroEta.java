package GestioneRegistroEta;
import java.util.Vector;

public class RegistroEta {
	
	private String nomeRegistro;
	Vector <NomeEta> registro = new Vector<NomeEta>();
	
	public RegistroEta(String nomeRegistro) {
		this.nomeRegistro=nomeRegistro;
	}
	
	public void add(NomeEta toAdd) {
		registro.add(toAdd);
	}
	
	public void incrementaEta(NomeEta toIncrement) {
		for(NomeEta item: registro) {
			if(item.equals(toIncrement))
				item.setEta(item.getEta()+1);
		}
	}
	
	public String toString() {
		String output = "----- REGISTRO " + this.nomeRegistro + " -----";
		
		for(NomeEta item: registro) {
			output += "Nome: " + item.getNome() + " -- Eta: " + item.getEta() + " \n";
		}
		
		return output;
	}
}
