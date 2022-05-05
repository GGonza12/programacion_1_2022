package clase_5;
/* Escribir un programa que mientras que el usuario ingrese un número entero
entre 1 y 10 inclusive, lleve la suma de los números ingresados. Finalmente,
cuando sale del ciclo muestre por pantalla el resultado de la suma. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_5_practico_ejercicio_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero,suma;
		suma = 0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero");
			numero = Integer.valueOf(entrada.readLine());
			while ((numero>=1)&&(numero<=10)) {
				suma+=numero;
				System.out.println("Ingrese un numero entero.");
				numero = Integer.valueOf(entrada.readLine());
			}
			System.out.println("La suma de todos los numeros ingresados es: " + suma);
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
