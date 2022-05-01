package clase_5;
/* Escribir un programa que mientras que el usuario ingrese un número entero
distinto de 0, pida ingresar otro número entero y lo imprima. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_5_practico_ejercicio_3 {

	public static void main(String[] args) {
		int numero;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero");
			numero = Integer.valueOf(entrada.readLine());
			while (numero != 0) {
				System.out.println("Su numero es: " +numero);
				System.out.println("Ingrese otro numero entero");
				numero = Integer.valueOf(entrada.readLine());
			}
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
	}

}
