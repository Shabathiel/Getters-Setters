package encapsulacion;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	
	public Persona (String n, String p, int e) {
		this.nombre = n;
		this.apellido = p;
		this.edad = e;
	}
	
	public void mostrar() {
		System.out.println("La persona " + this.nombre + " " + this.apellido + " tiene: " + this.edad + " años.");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		if (edad < 0) {
			System.out.println("Edad establecida invalida, establecida en 0 ");
			this.edad = 0;
		}
		this.edad = edad;
	}
	
	
}
