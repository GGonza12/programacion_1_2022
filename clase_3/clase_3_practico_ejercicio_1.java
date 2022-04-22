package clase_3;
/*Escribir un programa que permita el ingreso de un número entero por
teclado e imprima el cociente de la división de dicho número con el
número 2, luego con el número 3, y finalmente con el número 4. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_3_practico_ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		double resultado1,resultado2,resultado3;
		try {
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero");
			numero = Integer.valueOf(entrada.readLine());
			resultado1= numero / 2;
			System.out.println("El cociente de " + numero + " por 2 es: " + resultado1);
			resultado2= numero / 3;
			System.out.println("El cociente de " + numero + " por 3 es: " + resultado2);
			resultado3= numero / 4;
			System.out.println("El cociente de " + numero + " por 4 es: " + resultado3);
			
		}
		catch (Exception exc){
			System.out.println(exc);
		}
	}

}
