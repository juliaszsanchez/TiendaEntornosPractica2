package Tienda;

public class Funciones {

	public static Producto[] rellenarProducto() {

		Producto ListaProductos[] = new Producto[22];
		//INSTANTÁNEA 1
		ListaProductos[0] = new Producto("Altavoz", 89.99, false);
		ListaProductos[1] = new Producto("Auriculares Alambricos", 53.99, false);
		ListaProductos[2] = new Producto("Auriculares Inlambricos", 40.99, false);
		ListaProductos[3] = new Producto("Disco Duro Externo", 65.00, false);
		ListaProductos[4] = new Producto("Fuente de Alimentacion", 87.99, false);
		ListaProductos[5] = new Producto("Memoria RAM", 46.98, false);
		ListaProductos[6] = new Producto("Monitor", 119.37, false);
		ListaProductos[7] = new Producto("Placa Base", 109.90, false);
		ListaProductos[8] = new Producto("Procesador", 204.99, false);
		ListaProductos[9] = new Producto("Raton", 21.99, false);
		ListaProductos[10] = new Producto("Refrigerador", 66.40, false);
		ListaProductos[11] = new Producto("Tarjeta Grafica", 310.29, false);
		ListaProductos[12] = new Producto("Teclado", 39.95, false);
		ListaProductos[13] = new Producto("Portatil", 749.99, false);
		ListaProductos[14] = new Producto("Torre", 103.90, false);

		ListaProductos[15] = new Producto("Altavoz JBL", 105.99, true);
		ListaProductos[16] = new Producto("Auriculares Alambricos Gaming", 90.99, true);
		ListaProductos[17] = new Producto("Auriculares Inlambricos Iphone", 30.99, true);
		ListaProductos[18] = new Producto("Monitor SAMSUNG", 159.90, true);
		ListaProductos[19] = new Producto("Raton Gaming", 38.99, true);
		ListaProductos[20] = new Producto("Teclado con iluminacion", 62.99, true);
		ListaProductos[21] = new Producto("Portatil Apple", 1049.99, true);

		return ListaProductos;
	}

	public static void cabeceraProducto() {
		System.out.println("             PRODUCTO             ");
		System.out.println("-----------------------------------");
		System.out.println("  NOMBRE                 PRECIO");
	}

	public static void pintarLista(Producto[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				System.out.println(lista[i].toString());
			}

		}
	}

	public static Producto buscar(String productoQueMePasa, Producto[] lista) {

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getProductos().toUpperCase().contentEquals(productoQueMePasa.toUpperCase())) {
					return lista[i];
				}
			}

		}
		return null;

	}

	public static int buscarPosicion(String productoQueMePasa, Producto[] lista) {

		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				if (lista[i].getProductos().toUpperCase().contentEquals(productoQueMePasa.toUpperCase())) {
					return i;
				}
			}

		}
		return -1;

	}

	public static void pintarTicket(Producto[] listaCarrito, int[] listaCantidad) {
		double total = 0;

		for (int i = 0; i < listaCarrito.length; i++) {
			Producto producto = listaCarrito[i];
			int cantidad = listaCantidad[i];
			if (producto != null) {
				double totalproducto = (producto.getPrecio() * cantidad);
				total = total + totalproducto;
				System.out.println(producto.toString() + "| CANTIDAD " + cantidad + "| TOTAL " + totalproducto + " €");
			}

		}
		System.out.println("COMPRA TOTAL " + total + " €");
	}

	public static void menu() {
		System.out.println();
		System.out.println("1._ MOSTRAR LISTA DE LOS PRODUCTOS");
		System.out.println("2._ MOSTRAR PRODUCTOS CON DESCUENTO");
		System.out.println("3._ MOSTRAR LISTA DE PRODUCTOS ELEGIDOS");
		System.out.println("4._ COMPRAR");
		System.out.println("5._ BORRAR DEL CARRITO");
		System.out.println("6._ IMPRIMIR TICKET Y SALIR DEL PROGRAMA");

	}
	
}
