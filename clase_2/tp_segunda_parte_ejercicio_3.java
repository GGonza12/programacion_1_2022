package clase_2;
/* Escribir un programa que pida que se ingresen datos necesarios para emitir una
factura por la compra de dos artículos de librería (tipo factura, número, nombre
cliente, producto 1, importe 1, producto 2, importe 2, importe total). Como
salida debe imprimir por pantalla la factura en un formato similar al siguiente
(utilizar literales): 
Factura C 201
Nombre y Apellido Jorge Rodríguez
Producto Importe
Lápices 12.2
Cuadernos 20.0
Importe Total 30.2 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_segunda_parte_ejercicio_3 {

	public static void main(String[] args) {
		double  importe1, importe2, importetotal;
		char factura;
		int numerofactura; 
		String producto1, producto2, nombre, apellido;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Ingrese su nombre:");
			nombre = entrada.readLine();
			System.out.println ("ingrese su apellido:");
			apellido = entrada.readLine();
			System.out.println("Ingrese tipo factura:");
			factura = entrada.readLine().charAt(0);
			System.out.println("Ingrese numero factura:");
			numerofactura = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese primer producto");
			producto1 = entrada.readLine();
			System.out.println("Ingrese segundo producto");
			producto2 = entrada.readLine();
			System.out.println("Ingrese primer importe");
			importe1 = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese segundo importe");
			importe2 = Double.valueOf(entrada.readLine());
			importetotal = importe1 + importe2;

			System.out.println("factura \t" + factura + "\t " + numerofactura + "\n " + "Nombre y Apellido \t" + nombre + " " + apellido + "\n " + "Producto\t\t" + "importe\n " + producto1 + "\t\t " + importe1 + "\n " + producto2 + "\t\t " + importe2 + "\n " + "importe total" + "\t\t " + importetotal );

		}
		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}
