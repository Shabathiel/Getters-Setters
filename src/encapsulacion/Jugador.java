package encapsulacion;

public class Jugador {
	private String nombre;
	private int puntajeActual;
	private int puntajeMaximo;
	
	public Jugador(String n, int a, int m) {
		setNombre(n);
		setPuntajeActual(a);
		setPuntajeMaximo(m);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPuntajeActual(int puntajeActual) {
		this.puntajeActual = Math.max(puntajeActual,0);
	}
	public void setPuntajeMaximo(int puntajeMaximo) {
		this.puntajeMaximo = puntajeMaximo;
	}
	
	public void actualizarPuntaje(int nuevoPuntaje) {
		this.puntajeMaximo = Math.max(nuevoPuntaje, this.puntajeMaximo);
	}

	@Override
	public String toString() {
		return "Jugador = " + nombre + "\nPuntaje Actual = " + puntajeActual + "\nPuntaje Maximo = " + puntajeMaximo;
	}
	
	
}
