import opereArte.*;

public class test {
	
	public static void main(String[] args) {
		Collezione collezione1 = new Collezione("uffizi", "firenze");
		
		Quadro quadro1 = new Quadro("Nascita di venere", "Botticelli");
		quadro1.setAltezza(125.7);
		quadro1.setLarghezza(68.9);
		
		Scultura scultura1 = new Scultura("scultura1", "autore1", 127.1, 12.8, 78);
		Scultura scultura2 = new Scultura("scultura2", "autore2", 98.3, 56.8, 34.2);
		
		collezione1.addOpera(quadro1);
		
		collezione1.printCollezione();
		
		collezione1.addOpera(scultura2);
		collezione1.addOpera(scultura1);
		
		collezione1.printCollezione();
	}

}
