
public class TipoEsame {

	private String nomeInsegnamento;
	private short CFU;	

	public TipoEsame(String nomeInsegnamento, short CFU) {
		// TODO Auto-generated constructor stub
		this.nomeInsegnamento = nomeInsegnamento;
		this.CFU = CFU;
	}
	
	public String getNomeInsegnamento() {
		return this.nomeInsegnamento;
	}
	
	public short getCFU() {
		return this.CFU;
	}
	
	public void setNomeInsegnamento(String nomeInsegnamento) {
		this.nomeInsegnamento = nomeInsegnamento;
	}
	
	public void setCFU(short CFU) {
		this.CFU = CFU;
	}

}
