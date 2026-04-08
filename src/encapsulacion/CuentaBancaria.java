package encapsulacion;

public class CuentaBancaria {
	private String titular;
	private double saldo;
	private String pin;
	
	public CuentaBancaria(String titular, int saldo, String pin) {
		this.titular = titular;
		this.saldo = saldo;
		this.pin = pin;
	}
	
	public boolean retirar(double monto, String pin) {
		if ( !(pin.equals(this.pin)) ) {
			System.out.println("PIN incorrecto");
			return false;
		}
		if (monto > this.saldo) {
			System.out.println("Fondos insuficientes.");
			return false;
		}
		this.saldo -= monto;
		System.out.println("Se retiraron: " + String.format("Q%.2f", monto));
		System.out.println("Saldo actual: " + String.format("Q%.2f", this.saldo));
		return true;
	}
	
}
