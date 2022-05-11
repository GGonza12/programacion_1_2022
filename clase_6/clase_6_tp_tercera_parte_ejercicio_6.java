package clase_6;
/* Escribir un programa que mientras que el usuario ingrese un número entero
natural, llame a un método que calcule la sumatoria entre 1 y dicho
numero y se lo retorne como resultado. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_6_tp_tercera_parte_ejercicio_6 {

	public static void main(String[] args) {
		int numero,resultado;
		
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero.");
			numero= Integer.valueOf(entrada.readLine());
			while(numero>=0) {
				resultado = sumatoria(numero);
				System.out.println("la sumatoria es :" + resultado);
				System.out.println("Ingrese numero.");
				numero= Integer.valueOf(entrada.readLine());
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
	public static int sumatoria(int num) {
		int sumatoria =0;
		for(int i=1;i<=num;i++) {
			sumatoria+=i;
		}
		return sumatoria;
	}

}
