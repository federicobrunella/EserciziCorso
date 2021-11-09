import oggetti.*;

public class Main {

	public static void main(String[] args){
		//Test classe Dado: 
		Dado dado = new Dado();
		System.out.println(dado.lancio());
		System.out.println(dado.getEsito());
		System.out.println(dado.toString());
		
		//Test calsse Moneta:
		Moneta moneta = new Moneta();
		System.out.println(moneta.lancio());
		System.out.println(moneta.getEsito());
		System.out.println(moneta.toString());
	}

}
