package clase_6;
/* Escribir un diseño de programa que mientras que el usuario
ingrese un número distinto de 0, pida ingresar otro numero y
lo imprima. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_6_tp_primera_parte_ejercicio_1 {

	public static void main(String[] args) {
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero");
			numero = Integer.valueOf(entrada.readLine());
			while (numero != 0) {
				System.out.println(numero);
				System.out.println("Ingrese un numero o ingrese 0 para salir.");
				numero = Integer.valueOf(entrada.readLine());
				
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
