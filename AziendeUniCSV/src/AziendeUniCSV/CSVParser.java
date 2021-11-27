package AziendeUniCSV;
import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class CSVParser {

	public CSVParser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Vector <String> v = new Vector<String>();
		
		try {
			Scanner inputFile = new Scanner(new BufferedReader(new FileReader("C:\\Users\\fedri\\Documens\\GitHub\\EserciziCorso\\AziendeUniCSV\\src\\AziendeUniCSV\\files\\input.txt")));

			while(inputFile.hasNext()) {
				v.add(inputFile.nextLine());
			}
			
			inputFile.close();
		}
		catch(IOException e){
			System.out.println("I/O Error");
		}
		
		for(String s : v) {
			System.out.println(s);
		}

	}



}
