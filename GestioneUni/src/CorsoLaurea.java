import java.util.ArrayList;

public class CorsoLaurea {
	
	private String nomeCorso;
	private int minCFU;
	private ArrayList<Studente> listaStudenti = new ArrayList<Studente>();	
	private ArrayList<Studente> listaLaureati = new ArrayList<Studente>();	


	public CorsoLaurea(String nomeCorso, int minCFU) {
		this.nomeCorso = nomeCorso;
		this.minCFU = minCFU;
	}
	
	public CorsoLaurea(String nomeCorso) {
		this.nomeCorso = nomeCorso;
	}
	
	public boolean addStudente(Studente studenteToAdd) {
		boolean esito = false;
		listaStudenti.add(studenteToAdd);
		return esito;
	}
	
	public String getNomeCorso() {
		return this.nomeCorso;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof CorsoLaurea) {
			CorsoLaurea toConfr = (CorsoLaurea) obj;
			if(toConfr.getNomeCorso().equals(this.getNomeCorso()))
				return true;
			else return false;
		}
		else
			return false;
	}
	
	public String toStringIscritti() {
		String output = "------- STUDENTI ISCRITTI -------\n";
		for(Studente studente: listaStudenti)
		{
			output += studente.getNome() + " " + studente.getCognome() + "  --- MAT: " + studente.getMatricola() + "\n";
		}
		return output;
	}
	
	public String toStringLaureati() {
		String output = "------- STUDENTI LAUREATI -------\n";
		for(Studente studente: listaLaureati)
		{
			output += studente.getNome() + " " + studente.getCognome() + "  --- MAT: " + studente.getMatricola() + "\n";
		}
		return output;	}

}
