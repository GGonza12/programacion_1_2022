package clase_7;
/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, obtenga la cantidad de números pares que tiene y la imprima. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_primera_parte_ejercicio_2 {

	public static int MAX = 10;
	public static void main(String[] args) {
		int [] arreglo = new int [MAX];
		int pares;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int i=0;i<MAX;i++) {
				System.out.println("Ingrese un numero");
				arreglo[i] = Integer.valueOf(entrada.readLine());
			}
			pares= cantidad_par(arreglo);
			System.out.println("La cantidad de numeros pares es de : " +pares);
		}
		catch (Exception exc) {
			System.out.println(exc);
		}

	}
	public static int cantidad_par(int [] arr) {
		int par=0;
		for (int i=0;i<MAX;i++) {
			if ((arr[i]%2)==0) {
				par++;
			}
		}
		return par;
	}

}
