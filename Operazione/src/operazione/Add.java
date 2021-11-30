package operazione;

public class Add extends Operation {

	public Add(float parametro1, float parametro2) {
		super(parametro1, parametro2);
	}

	public void execute() {
		this.risultato = operando1 + operando2;
	}

}
