package encapsulacion;

public class Producto {
	private String codigo;
	private String nombre;
	private int precio; //Precio en centavos
	private int stock;
	
	public Producto(String c, String n, int p, int s) {
		this.codigo = c;
		this.nombre = n;
		if (s < 0 ) this.stock = 0;
		else this.stock = s;
		if (p <= 0) this.precio = 10000;
		else this.precio = p; //Validaciones discretas para manejo simple
		//TODO: Validacion en GUI riguroza.
	}

	@Override
	public String toString() {
		return "Codigo: " + codigo + ", Nombre: " + nombre + ", Precio: Q" + (precio/100) + ".00, Stock: " + stock + ".";
	}
	
	public void vender(int cantidad) {
		if(this.stock < cantidad) {
			System.out.println("Se intento vender y no hay stock suficiente de: " + this.nombre);
			return;
		}
		if (cantidad < 1) {
			System.out.println("Cantidad no valida para compra");
			return;
		}
		this.stock -= cantidad;
		System.out.println("Se vendieron " + cantidad + " de " + this.nombre);
		System.out.println("Total: Q" + (this.precio * 0.01 * cantidad));
	}
}
