import java.util.ArrayList;

public class Studente {

	private String nome;
	private String cognome;
	private int matricola;
	public static int matricolaPrec = 1000;

	ArrayList<Esame> pianoStudi = new ArrayList<Esame>();
	private short cfuConseguiti = 0;
	private float media = 1;

	public Studente(String nome, String cognome) {
		matricola = ++matricolaPrec;

		this.nome = nome;
		this.cognome = cognome;
	}

	public int getMatricola() {
		return this.matricola;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCognome() {
		return this.cognome;
	}
	
	public short getCfuConseguiti() {
		return this.cfuConseguiti;
	}
	
	public float getMedia() {
		return this.media;
	}

	public boolean addEsame(Esame esameDaIns) {
		//TODO: controllo su esami duplicati
		boolean esito = true;
		pianoStudi.add(esameDaIns);
		return esito;
	}

	public boolean promuoviStudente(Esame esameDaProm) {
		//TODO: controllo su esisitenza dell'esame nel piano di studi
		boolean esito = false;
		for(Esame esame : pianoStudi) {
			if(esame.equals(esameDaProm)){
					esito = true;
					esame.setEsito(true);
					esame.setVoto(esameDaProm.getVoto());
					aggiornaMedia(esameDaProm.getVoto());
					aggiornaCFU(esameDaProm.getCFU());
			}
		}
		return esito;
	}

	public boolean removeEsame(Esame esameDaRmv) {
		boolean esito = false;
		//cerco l'indice dell'esame da rimuovere nella lista degli essami del piano di studi
		for(int i = 0; i<pianoStudi.size(); i++)
		{
			if(pianoStudi.get(i).equals(esameDaRmv)) {
				aggiornaCFU(-pianoStudi.get(i).getCFU());
				aggiornaMedia(pianoStudi.get(i).getVoto());
				pianoStudi.remove(i);
				esito=true;
			}
		}

		return esito;
	}

	public boolean laureaStudente() {
		//TODO:
		boolean esito = false;
		return esito;
	}

	public String toString() {
		//TODO: stampa a schermo 
		String carriera = "-------- "+this.getNome() +" " + this.getCognome() +" MAT: " + this.getMatricola() +"-------\n"
				+"   -Media: " + this.getMedia() + "\n"
				+"   -CFU convalidati: " + this.getCfuConseguiti() +"\n"
				+"------------- PIANO DI STUDI --------------\n";
		
		for(Esame esame : pianoStudi) {
			if(esame.getEsito())
				carriera += "Insegnamento: " + esame.getNomeInsegnamento() +" -- CFU: " + esame.getCFU()+ " -- Valutazione: "+ esame.getVoto() + "\n";
			else
				carriera += "Insegnamento: " + esame.getNomeInsegnamento() +" -- CFU: " + esame.getCFU()+ " -- Valutazione: ESAME NON SUPERATO \n";
		}
		
		carriera += "-------------------------------------------\n";
		return carriera;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Studente) {
			Studente toConfr = (Studente) obj;
			if(toConfr.getNome().equals(this.getNome()) && toConfr.getCognome().equals(this.getCognome()) && toConfr.getMatricola()==this.getMatricola())
				return true;
			else return false;
		}
		else
			return false;
	}

	private int esamiSuperati() {
		int esamiSuperati = 0;
		for(Esame esame : pianoStudi) {
			if(esame.getEsito() == true)
				esamiSuperati++;
		}
		return esamiSuperati;
	}

	private void aggiornaMedia(int voto) {
		media = (media*(esamiSuperati()-1)+voto)/esamiSuperati();
	}

	private void aggiornaCFU(int cfu) {
		cfuConseguiti += cfu;
	}

}
