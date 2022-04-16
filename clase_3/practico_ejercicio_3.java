package clase_3;
/* Escribir un programa que permita el ingreso de dos números enteros por
teclado e imprima los resultados de comparar:
_ el primero mayor al segundo.
_ ambos son múltiplos de 2. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class practico_ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int primero,segundo;
		double primercalculo,segundocalculo;
		boolean multiplo;
		try {
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero");
			primero = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese otro numero entero");
			segundo = Integer.valueOf(entrada.readLine());
			System.out.println("El resultado de que si el numero " + primero + " es mayor a " + segundo + " es: "+ (primero>segundo));
			primercalculo = primero % 2;
			segundocalculo=segundo % 2;
			multiplo = (primercalculo==0)&&(segundocalculo==0);
			
			System.out.println("Es " + multiplo + " que ambos numeros sean multiplos de 2");
			

			
		}
		catch (Exception exc){
			System.out.println(exc);
		}

	}

}
