package Tienda;

public class Producto {

	public String productos;
	public double precio;
	public boolean descuento;
	
	public Producto (String productos, double precio,boolean descuento) {
		this.productos=productos;
		this.precio=precio;
		this.descuento = descuento;
	}

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public boolean isDescuento() {
		return descuento;
	}

	public void setDescuento(boolean descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return "| " + productos  + "     | " + precio + '€';
	}
	
	
	
}
