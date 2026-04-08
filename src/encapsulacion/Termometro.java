package encapsulacion;

public class Termometro {
	private double celsius;
	
	public Termometro(double c) {
		setCelcius(c);
	}

	public double getFahrenheit() {
		return (this.celsius * 9/5) + 32;
	}

	public void setCelcius(double c) {
		this.celsius = Math.max(-273.15,c);
	}

	@Override
	public String toString() {
		return "Termometro [celsius=" + celsius + "]";
	}
	
	
}
