package prenotazioneCampo;

public class Prenotazione {
	
	private String nome;
	private String orario;

	public Prenotazione(String nome, String orario) {
		this.nome = nome;
		this.orario = orario;
	}
	
	public String getOrario() {
		return orario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setOrario(String orario) {
		this.orario = orario;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}