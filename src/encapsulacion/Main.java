package encapsulacion;

public class Main {
	public static void main(String [] Args) {
		ejercicio4();
	}
	
	static void ejercicio1() {
		Persona p1 = new Persona("José", "Rivas", 20);
		
		p1.mostrar();
		
		p1.setApellido("Herrarte");
		
		p1.setEdad(12);
		
		p1.setEdad(-15);
		
		p1.mostrar();
	}
	
	static void ejercicio2() {
		Producto p1 = new Producto("001","Manzana",500,15);
		
		System.out.println(p1);
		
		p1.vender(9);
		
		System.out.println(p1);
		
		p1.vender(9);
	}
	
	static void ejercicio3() {
		CuentaBancaria b1 = new CuentaBancaria("Jose", 1500, "1234");
		
		b1.retirar(500, "1234");
		
		b1.retirar(500, "4321");
	}
	
	static void ejercicio4() {
		Curso c1 = new Curso("Etica",70,80,59);
		
		System.out.println(c1.estado());
	}
}
