package encapsulacion;

public class Factura {
	private String codigoFactura;
	private String descripcion;
	private int cantidad;
	private double precioUnitario;
	
	public Factura(String c, String d, int ca, double p) {
		setCodigoFactura(c);
		setDescripcion(d);
		setCantidad(ca);
		setPrecioUnitario(p);
	}

	public String getCodigoFactura() {
		return codigoFactura;
	}

	public void setCodigoFactura(String codigoFactura) {
		this.codigoFactura = codigoFactura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = Math.max(0, cantidad);
	}

	public double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = Math.max(precioUnitario,0);
	}
	
	public double calcularTotal() {
		return this.cantidad * this.precioUnitario;
	}
	
	public void mostrarFactura() {
		System.out.println("Codigo: " + this.codigoFactura);
		System.out.println("Descripcion: " + this.descripcion);
		System.out.println("Cantidad: " + this.cantidad);
		System.out.println("Precio Unitario: " + String.format("Q%.2f", this.precioUnitario));
		System.out.println("Total: " + String.format("Q%.2f", this.calcularTotal()));
	}
}
