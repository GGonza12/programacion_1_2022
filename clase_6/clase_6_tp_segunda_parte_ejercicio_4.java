package clase_6;
/* Escribir un programa que mientras el usuario cargue desde
teclado un numero entero distinto de 0, imprima por
pantalla la suma que se obtiene de invocar un método
que calcula la sumatoria de los primeros 200 números
naturales (son números enteros en 1 y 200). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_6_tp_segunda_parte_ejercicio_4 {

	public static void main(String[] args) {
		int num,resultado;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero.");
			num = Integer.valueOf(entrada.readLine());
			while (num!=0) {
				resultado = sumatoria();
				System.out.println(resultado);
				System.out.println("Ingrese un numero.");
				num = Integer.valueOf(entrada.readLine());
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

}
	public static int sumatoria() {
		int suma=0;
		for(int i=1;i<=200;i++) {
			suma+=i;
		}
		return suma;
	}
	
}
