package GestioneBanca;

public class ContoCorrente {

	private int numeroConto;
	private double saldo;
	private String tipoConto;
	
	private static double tassoFamily;
	private static double tassoBusiness;
	private static int ultimoNumeroConto = 1000;
	


	public ContoCorrente(String tipo , double saldoIniziale) {
		// TODO Auto-generated constructor stub
		saldo = saldoIniziale;
		tipoConto = tipo;
		
		numeroConto = ultimoNumeroConto;
		ultimoNumeroConto++;
	}

	public void versa(double versamento) {
		saldo += versamento;
	}

	public void mauturaInteressi() {
		if(tipoConto=="family"|| tipoConto == "Family"|| tipoConto=="FAMILY")
			saldo += saldo*tassoFamily;
		else
			saldo += saldo*tassoBusiness;
	}

	public int ottieniNumero() {
		return numeroConto;
	}

	public boolean preleva(double prelievo) {
		boolean esito = false;

		if(saldo >= prelievo)
		{
			saldo -= prelievo;
			esito = true;
		}
		else
			esito = false;

		return esito;
	}
	
	public double ottieniSaldo() {
		return saldo;
	}

	public static void applicaTassoFamily(double newTassoFamily) {
		tassoFamily = newTassoFamily;
	}

	public static void applicaTassoBusiness(double newTassoBusiness) {
		tassoBusiness = newTassoBusiness;
	}
}
