package prenotazioneCampo;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Prenotazione [] prenotazioniGiornoCampo1 = new Prenotazione[5]; 
		Campo campo1 = new Campo(prenotazioniGiornoCampo1);
		
		Prenotazione daElaborare;
		String nomePrenotazione;
		String orarioPrenotazione;
		
		char scelta;
		while(true)
		{
			System.out.println("Scegliere per proseguire");
			System.out.println("a) stampa tutte le prenotazioni");
			System.out.println("b) aggiungi prenotazione");
			System.out.println("c) rimuovi prenotazioni");
			System.out.println("d) esci");
			scelta = input.nextLine().charAt(0);
			
			switch(scelta) {
			case 'a':
				System.out.println(campo1.toString());
				break;
			case 'b':
				System.out.println("inserire nome prenotazione: ");
				nomePrenotazione = input.nextLine();
				System.out.println("Inserire orario di inizio (prenotazione ogni ora dall'apertura)");
				orarioPrenotazione = input.nextLine();
				
				daElaborare = new Prenotazione(nomePrenotazione, orarioPrenotazione);
				if(campo1.addPrenotazione(daElaborare))
					System.out.println(campo1.toString());
				else
					System.out.println("Impossibile prenotare, nome già esistente, orario occupato oppure posti terminati!");
				break;
				
			case 'c':
				System.out.println("inserire nome prenotazione da rimuovere: ");
				nomePrenotazione = input.nextLine();
				
				daElaborare = new Prenotazione(nomePrenotazione, null);
				if(campo1.removePrenotazione(daElaborare))
					System.out.println("Prenotazione rimossa");
				else
					System.out.println("Impossibile rimuovere, nome non trovato!");
				break;
				
			case 'd':
				input.close();
				return;

			}
		}
		
		/*Prenotazione newPrenotazione = new Prenotazione("federico", "10:30");
		
		System.out.println(campo1.addPrenotazione(newPrenotazione));
		newPrenotazione.setNome("leonardo");
		newPrenotazione.setOrario("11:30");
		System.out.println(campo1.addPrenotazione(newPrenotazione));
		newPrenotazione.setNome("jacopo");
		newPrenotazione.setOrario("12:30");
		System.out.println(campo1.addPrenotazione(newPrenotazione));
		newPrenotazione.setNome("davide");
		newPrenotazione.setOrario("13:30");
		System.out.println(campo1.addPrenotazione(newPrenotazione));
		newPrenotazione.setNome("alessia");
		newPrenotazione.setOrario("15:30");
		System.out.println(campo1.addPrenotazione(newPrenotazione));
		
		newPrenotazione.setNome("alessia");
		newPrenotazione.setOrario("11:30");
		campo1.removePrenotazione(newPrenotazione);

		
		System.out.println(campo1.toString());*/
	}

}
