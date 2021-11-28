package GestioneRegistroEta;

public class NomeEta {

	private int eta;
	private String nome;

	public NomeEta(String nome, int eta) {
		this.eta=eta;
		this.nome=nome;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof NomeEta) {
			NomeEta toConfr = (NomeEta) obj;
			if(toConfr.getEta() == this.getEta() && toConfr.getNome().equals(this.getNome()))
				return true;
			else return false;
		}
		else
			return false;
	}

}
