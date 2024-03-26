package TiendaDepuración;

import java.util.Scanner;

public class TiendaProductosPrecio {

	public static void main(String[] args) {
		Producto ListaProductos[] = Funciones.rellenarProducto();
		Producto CarritoCompra[] = new Producto[22];
		int cantidadProductosCarrito[] = new int[22];
		System.out.println("BIENVENIDO A NUESTRA TIENDA ONLINE OFFICE STORE JULIA´S ");
		System.out.println("                                           ");
		Scanner teclado = new Scanner(System.in);
		System.out.println("SELECCIONE UNA OPCIÓN");
		int opcion = 0;
		while (opcion != 6) {
			Funciones.menu();
			opcion = teclado.nextInt();

			switch (opcion) {

			case 1: {
				System.out.println("\nPRODUCTOS");
				Funciones.cabeceraProducto();
				Funciones.pintarLista(ListaProductos);

				break;

			}
			case 2: {
				System.out.println("\nPRODUCTOS CON DESCUENTO");
				Funciones.cabeceraProducto();
				for (int i = 0; i <= ListaProductos.length; i++) {
					if (ListaProductos[i] != null) {
						if (ListaProductos[i].isDescuento()) {
							System.out.println(ListaProductos[i].toString());
						}

					}

				}

				break;
			}
			case 3: { /*CAMBIAR EN LA FUNCION EL 0 POR EL 1*/
				System.out.println("CARRITO");
				Funciones.pintarTicket(CarritoCompra, cantidadProductosCarrito);

				break;
			}
			case 4: {
				System.out.println("COMPRA");
				teclado.nextLine();
				System.out.println("¿QUÉ PRODUCTO QUIERES COMPRAR?");
				String producto = teclado.nextLine();
				Producto productoBuscado = Funciones.buscar(producto, ListaProductos);
				
				if (productoBuscado != null) {
					int posicion=Funciones.buscarPosicion(productoBuscado.getProductos(), CarritoCompra);
					if (posicion!=-1) {
						System.out.println("¿CUÁNTOS PRODUCTOS MÁS QUIERES?");
						int cantidad = teclado.nextInt();
						cantidadProductosCarrito[posicion] =cantidadProductosCarrito[posicion] + cantidad;
						
					}else {
						for (int i = 0; i < CarritoCompra.length; i++) {
							if (CarritoCompra[i] == null) {
								CarritoCompra[i] = productoBuscado;
								System.out.println("¿CUÁNTOS QUIERES?");
								int cantidad = teclado.nextInt();
								cantidadProductosCarrito[i] = cantidad;
								break;
							}
							
					}
					}
					
				} else {
					System.out.println("NO ENCONTRADO");
				}

				break;
			}
			case 5: {
				System.out.println("QUÉ PRODUCTO QUIERES BORRAR DEL CARRITO?");
				Funciones.pintarTicket(CarritoCompra, cantidadProductosCarrito);
				teclado.nextLine();
				String productoborrado = teclado.nextLine();
				int posicionProducto = Funciones.buscarPosicion(productoborrado, CarritoCompra);
				System.out.println("¿CUÁNTOS PRODUCTOS QUIERES BORRAR DEL CARRITO?");
				int cantidad = teclado.nextInt();

				if (posicionProducto != -1) {
					int cantidadProducto = cantidadProductosCarrito[posicionProducto];
					cantidadProductosCarrito[posicionProducto] = cantidadProducto - cantidad;

					if (cantidadProductosCarrito[posicionProducto] <= 0) {
						CarritoCompra[posicionProducto] = null;
						cantidadProductosCarrito[posicionProducto] = 0;
					}

				} else {
					System.out.println("NO ENCONTRADO");
				}
				break;
			}
			case 6: {
				System.out.println("COMPRA");
				Funciones.pintarTicket(CarritoCompra, cantidadProductosCarrito);

				break;
				/*FALLO EN PINTARTICKET: EN INT I=0 HE PUESTO INT I=1, POR LO QUE NO PINTA EN EL TICKET EL 
				 PRIMER PRODUCTO QUE QUIERES COMPRAR*/
			}
			}
		}

	}

}