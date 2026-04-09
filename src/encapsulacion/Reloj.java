package encapsulacion;

public class Reloj {
	private int hora;
	private int minuto; 
	private int segundo;
	
	public Reloj(int h,int m,int s) {
		setHora(h);
		
		setMinuto(m);
		
		setSegundo(s);
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int h) {
		if(h >= 0 && h <= 23) this.hora = h;
		else this.hora = 0;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int m) {
		if(m >= 0 && m < 60) this.minuto = m;
		else this.minuto = 0;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int s) {
		if(s >= 0 && s < 60) this.segundo = s;
		else this.segundo = 0;
	}
	
	public void mostrarHora() {
		System.out.print("Hora: ");
		System.out.print(String.format("%02d", this.hora) + ":");
		System.out.print(String.format("%02d", this.minuto) + ":");
		System.out.println(String.format("%02d", this.segundo));
	}
}
