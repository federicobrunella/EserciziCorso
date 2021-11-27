package opereArte;
import java.util.Vector;

public class Collezione {
	
	private String nome;
	private String luogo;
	private Vector<OperaArte> collezione = new Vector<OperaArte>();

	public Collezione(String nome, String luogo) {
		this.nome = nome;
		this.luogo = luogo;
	}
	
	public void addOpera(OperaArte opera) {
		collezione.add(opera);
	}
	
	public String toString() {
		String output = "-----COLLEZIONE " + this.nome +" -- "+ this.luogo +" -----\n";
		
		for(OperaArte opera : collezione) {
			output+=opera.toString() + "\n" 
					+ opera.printIngombro()+"\n"
					+"------------------------------\n";
		}
		return output;
	}
	
	public void printCollezione() {
		System.out.println(this.toString());
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void setLuogo(String luogo) {
		this.luogo=luogo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getLuogo() {
		return this.luogo;
	}

}
