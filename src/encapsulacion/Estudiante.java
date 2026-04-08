package encapsulacion;

public class Estudiante {
	private String carnet, nombre;
	private int promedio;
	
	public Estudiante(String c, String n, int p) {
		this.carnet = c;
		this.nombre = n;
		if(p >100 || p < 0) {
			this.promedio = 0;
			return;
		}
		this.promedio = p;
	}
	
	public boolean esBecado() {
		if(this.promedio < 85) return false;
		return true;
	}
}
