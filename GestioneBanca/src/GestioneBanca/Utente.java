package GestioneBanca;

public class Utente {
	
	private String nomeUtente;
	private String password;
	private String nome;
	
	public Utente(String nomeUtenteInserito, String passwordInserita, String nomeInserito) {
		nomeUtente = nomeUtenteInserito;
		password = passwordInserita;
		nome = nomeInserito;
	}
	
	public boolean controlla(String nomeUtenteInserito, String passwordInserita) {
		if(nomeUtenteInserito.equals(nomeUtente) && passwordInserita.equals(password))
			return true;
		else 
			return false;
	}
	
	public String ottieniNome() {
		return nome;
	}
	
}
