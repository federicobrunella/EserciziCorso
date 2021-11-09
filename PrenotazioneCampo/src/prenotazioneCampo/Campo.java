package prenotazioneCampo;

public class Campo {
	//in un gionro massimo 10 orari prenotabili (ipotizzo min. 1 ora)
	//Prenotazione [] prenotazioniGiorno = new Prenotazione[10]; 
	private Prenotazione [] prenotazioniGiorno;

	private int idPrenotazione = 0;
	private static int idPrenotazionePrec = 0;

	public Campo(Prenotazione prenotazioniGiorno[]) {
		this.prenotazioniGiorno = prenotazioniGiorno;
	}

	public boolean addPrenotazione(Prenotazione newPrenotazione) {
		boolean esito = false;

		if(idPrenotazionePrec<prenotazioniGiorno.length && controllaOrarioNome(newPrenotazione)) {
			idPrenotazione = idPrenotazionePrec;
			idPrenotazionePrec++;

			prenotazioniGiorno[idPrenotazione] = new Prenotazione(newPrenotazione.getNome(), newPrenotazione.getOrario());
			esito=true;
		}
		return esito;
	}

	private boolean controllaOrarioNome(Prenotazione daInserire) {
		boolean esito = true;
		for(int x = 0; x<idPrenotazione; x++) {
			if(prenotazioniGiorno[x].getOrario().equals(daInserire.getOrario()) || prenotazioniGiorno[x].getNome().equals(daInserire.getNome())) 
				esito = false;

		}

		return esito;
	}

	public boolean removePrenotazione(Prenotazione toDelete) {
		boolean esito = false;

		for(int x = 0; x<=idPrenotazione; x++) {
			
			if(prenotazioniGiorno[x].getNome().equals(toDelete.getNome()) && x != idPrenotazione) {
				prenotazioniGiorno[x].setNome(prenotazioniGiorno[x+1].getNome());
				prenotazioniGiorno[x].setOrario(prenotazioniGiorno[x+1].getOrario());

				if(x <= idPrenotazione) {
					prenotazioniGiorno[x+1].setNome(toDelete.getNome());
					prenotazioniGiorno[x+1].setOrario(toDelete.getOrario());
				}
				idPrenotazione--;
				idPrenotazionePrec--;
				
				esito = true;
			}
			else if(prenotazioniGiorno[x].getNome().equals(toDelete.getNome()) && x == idPrenotazione) {
				idPrenotazione--;
				idPrenotazionePrec--;
				
				esito = true;
			}
		}

		return esito;
	}

	public String toString() {
		if(idPrenotazionePrec == 0)
			return "Nessuna prenotazione";
		else {
			System.out.println("Prenotazioni totali: " + idPrenotazione);

			for(int x = 0; x<=idPrenotazione; x++) {
				if(prenotazioniGiorno[x].getNome()!= null && prenotazioniGiorno[x].getOrario() != null) {
					System.out.println(prenotazioniGiorno[x].getNome());
					System.out.println(prenotazioniGiorno[x].getOrario());
					System.out.println("----------------------------");
				}
			}

			/*for(Prenotazione prenotazioni : prenotazioniGiorno) {
				System.out.println(prenotazioni.getNome());
				System.out.println(prenotazioni.getOrario());
				System.out.println("----------------------------");
			}*/
			return "Stampa completata";
		}
			
	}

}
