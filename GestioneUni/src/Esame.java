
public class Esame extends TipoEsame {
	
	private boolean esito; //false = non superato
	private short voto;
	

	public Esame(String nomeInsegnamento, short CFU, boolean esito, short voto) {
		super(nomeInsegnamento, CFU);
		this.voto = voto;
		this.esito = esito;
	}
	
	public Esame(String nomeInsegnamento, short CFU) {
		super(nomeInsegnamento, CFU);
		this.voto = -1;
		this.esito = false;
	}
	
	
	public boolean getEsito() {
		return this.esito;
	}
	
	public short getVoto() {
		return this.voto;
	}
	
	public void setEsito(boolean esito){
		this.esito = esito;
	}
	
	public void setVoto(short voto) {
		this.voto = voto;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Esame) {
			Esame toConfr = (Esame) obj;
			if(toConfr.getNomeInsegnamento().equals(this.getNomeInsegnamento()) && this.getCFU() == toConfr.getCFU())
				return true;
			else return false;
		}
		else
			return false;
	}

}
