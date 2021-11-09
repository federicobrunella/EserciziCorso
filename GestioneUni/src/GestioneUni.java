import java.util.ArrayList;
import java.util.Scanner;

public class GestioneUni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CorsoLaurea> listaCorsi = new ArrayList<CorsoLaurea>();
		listaCorsi.add(new CorsoLaurea("Ingegneria informatica", 180));
		listaCorsi.add(new CorsoLaurea("a", 180));
		

		Scanner input = new Scanner(System.in);
		char scelta;
		while(true)
		{
			System.out.println("Scegliere per proseguire");
			System.out.println("a) Iscrivi studente a un Corso di Laurea");
			System.out.println("b) Cerca e modifica studente tra i corsi di laurea");
			System.out.println("c) Laurea Studente ");
			System.out.println("d) Ritira Studente");
			System.out.println("e) Visualizza studenti iscritti a corso di laurea");
			System.out.println("f) Visualizza studenti laureati a corso di laurea");
		
			scelta = input.nextLine().charAt(0);

			switch(scelta) {
			case 'a':
				System.out.println("---------- ISCRIZIONE STUDENTE --------");
				System.out.print("Nome: ");
				String nome = input.nextLine();
				System.out.print("Cognome: ");
				String cognome = input.nextLine();
				System.out.println("Specificare corso al quale iscriversi: ");
				String nomecorso = input.nextLine();
				
				for(CorsoLaurea corso : listaCorsi) {
					if(corso.equals(new CorsoLaurea(nomecorso))) {
						corso.addStudente(new Studente(nome, cognome));
					}
				}
				break;
			case 'e':
				System.out.println("Inserire nome corso per visualizzare i suoi iscritti:");
				nomecorso = input.nextLine();
				
				for(CorsoLaurea corso : listaCorsi) {
					if(corso.equals(new CorsoLaurea(nomecorso))) {
						System.out.println(corso.toStringIscritti());
					}
				}
				
				
				break;

			case 'f':
				System.out.println("Inserire nome corso per visualizzare i suoi Laureati:");
				nomecorso = input.nextLine();
				
				for(CorsoLaurea corso : listaCorsi) {
					if(corso.equals(new CorsoLaurea(nomecorso))) {
						corso.toStringLaureati();
					}
				}
				
				break;

			case 'd':
				input.close();
				return;

			}
		}

	}
}

