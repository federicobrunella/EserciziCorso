package GestioneBanca;
import java.util.Scanner;


public class TerminaleSportello {
	
	private boolean isLogged = false;
	private Utente users[];
		
	public TerminaleSportello(Utente inputUsers[]) {
		// TODO Auto-generated constructor stub
		users = inputUsers;	
	}
	
	public boolean login() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci nome utente");
		String nomeUtenteInserito = input.nextLine();
		System.out.println("Inserisci password");		
		String passwordInserita = input.nextLine();
		
		for(Utente user : users) {
			if(user.controlla(nomeUtenteInserito, passwordInserita)) {
				isLogged = true;
				System.out.println(user.ottieniNome()+" -- Logged in!");
			}
		}
		
		input.close();
		return isLogged;
	}
	
}
