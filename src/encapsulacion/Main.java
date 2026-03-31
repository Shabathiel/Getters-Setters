package encapsulacion;

public class Main {
	public static void main(String [] Args) {
		ejercicio1();
	}
	
	static void ejercicio1() {
		Persona p1 = new Persona("José", "Rivas", 20);
		
		p1.mostrar();
		
		p1.setApellido("Herrarte");
		
		p1.setEdad(12);
		
		p1.setEdad(-15);
		
		p1.mostrar();
	}
}
