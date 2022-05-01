package clase_5;
/* Escribir un programa que mientras el usuario ingrese un número entero
menor que 10 y mayor a 1, muestre por pantalla si el número es múltiplo de
2 y múltiplo de 3 simultáneamente. (¿Los valores mencionados en el
enunciado deberían ser constantes?. De a poco habría que definirlos
como constantes). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_5_practico_ejercicio_1 {

	public static void main(String[] args) {
		int numero;
		final int MAX = 10;
		final int MIN = 1;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero");
			numero = Integer.valueOf(entrada.readLine());
			while ((numero>MIN)&&(numero<MAX)) {
				if ((numero%2==0)&&(numero%3==0)) {
					System.out.println("El numero es multiplo de 2 y3");
					System.out.println("Ingrese un numero");
					numero = Integer.valueOf(entrada.readLine());
				}
				else {
					numero = 11;
				}
			}
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}

}
