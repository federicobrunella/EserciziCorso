package operazione;

public class Div extends Operation {

	public Div(float parametro1, float parametro2) {
		super(parametro1, parametro2);
	}
	
	public void execute() {
		this.risultato = operando1 / operando2;
	}

}
