package encapsulacion;

public class Contacto {
	private String nombre;
	private String telefono;
	private String email;
	
	public Contacto(String n, String t, String e) {
		setNombre(n);
		setTelefono(t);
		setEmail(e);
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTelefono(String telefono) {
		if (telefono.length() == 8) this.telefono = telefono;
		else this.telefono ="00000000";
	}

	public void setEmail(String email) {
		if (email.contains("@"))this.email = email;
		else this.email = "null@example.com";
	}
	
	public void mostrarContacto() {
		System.out.println("Nombre: " + this.nombre);
		System.out.println("Telefono: " + this.telefono);
		System.out.println("Email: " + this.email);
	}
	
}
