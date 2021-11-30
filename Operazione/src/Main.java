import operazione.*;

public class Main {

	public static void main(String[] args) {
		float x = 100;
		float y = 150;
		
		Add addizione = new Add(x, y);
		addizione.execute();
		System.out.println(addizione.toString());
		
		Sub sottrazione = new Sub(x, y);
		sottrazione.execute();
		System.out.println(sottrazione.toString());
		
		Mul moltiplicazione = new Mul(x, y);
		moltiplicazione.setOp1(0);
		moltiplicazione.execute();
		System.out.println(moltiplicazione.toString());
		
		Div divisione = new Div(x, y);
		divisione.execute();
		System.out.println(divisione.toString());

	}

}
