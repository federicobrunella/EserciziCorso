package operazione;

public abstract class Operation implements Operazione {
	
	float risultato, operando1, operando2;

	public Operation(float operando1, float operando2) {
		this.operando1 = operando1;
		this.operando2 = operando2;
	}
	
	public float getRisultato() {
		return this.risultato;
	}
	
	public void setOp1(float operando1) {
		this.operando1 = operando1;
	}
	
	public void setOp2(float operando2) {
		this.operando2 = operando2;
	}
	
	
	public String toString() {
		return "risultato: " + risultato;
	}

}
