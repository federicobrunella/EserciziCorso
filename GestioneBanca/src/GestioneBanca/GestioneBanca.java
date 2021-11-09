package GestioneBanca;

public class GestioneBanca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CONTI CORRENTE
		ContoCorrente conto1 = new ContoCorrente("family",10000);
		ContoCorrente conto2 = new ContoCorrente("family",20000);
		ContoCorrente conto3 = new ContoCorrente("business",30000);
		//UTENTI
		Utente [] users = new Utente[2];
		users[0] = new Utente("federico","password","Federico Brunella");
		users[1] = new Utente("leonardo", "password", "Leonardo Pieralisi");
		//TERMINALE
		TerminaleSportello term1 = new TerminaleSportello(users);
		
		if(term1.login())
		{
			System.out.println("LOGIN Avvenuto con successo!");
			
			System.out.println("conto 1: "+ conto1.ottieniNumero());
			System.out.println("conto 1: "+ conto1.ottieniSaldo());
			
			System.out.println("conto 2: "+ conto2.ottieniNumero());
			System.out.println("conto 2: "+ conto2.ottieniSaldo());
			
			System.out.println("conto 3: "+ conto3.ottieniNumero());
			System.out.println("conto 3: "+ conto3.ottieniSaldo());
			
			conto1.versa(2500.0);
			conto2.preleva(300.00);
			conto3.versa(20000.0);
			
			System.out.println("---------------------------------");
			System.out.println("conto 1: "+ conto1.ottieniSaldo());
			System.out.println("conto 2: "+ conto2.ottieniSaldo());
			System.out.println("conto 3: "+ conto3.ottieniSaldo());
			
			ContoCorrente.applicaTassoFamily(0.02);
			ContoCorrente.applicaTassoBusiness(0.03);
			
			conto1.mauturaInteressi();
			conto2.mauturaInteressi();
			conto3.mauturaInteressi();
			
			System.out.println("---------------------------------");
			System.out.println("conto 1: "+ conto1.ottieniSaldo());
			System.out.println("conto 2: "+ conto2.ottieniSaldo());
			System.out.println("conto 3: "+ conto3.ottieniSaldo());
			
		}
		else {
			System.out.println("ERRORE: Inserire una password e/o nome utente validi!");
		}
		
		


	}

}
