package clase_7;
/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine todas las ocurrencia de numero
en el arreglo. Mientras exista (en cada iteración tiene que buscar la posición dentro del
arreglo) tendrá que usar la posición para realizar un corrimiento a izquierda (quedarán
tantas copias de la última posición del arreglo como cantidad de ocurrencias del número). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_primera_parte_ejercicio_6 {
	public static final int MAX = 10;
	public static final int MIN = 0;
	public static void main(String[] args) {
		int [] arreglo = new int [MAX];
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int i=0;i<MAX;i++) {
				System.out.println("Ingrese un numero");
				arreglo[i] = Integer.valueOf(entrada.readLine());
			}
			imprimir_arreglo(arreglo);
			System.out.println("Ingrese un numero");
			numero = Integer.valueOf(entrada.readLine());
			eliminar_ocurrencias(numero,arreglo);
			imprimir_arreglo(arreglo);
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
	public static void eliminar_ocurrencias(int num,int [] arr) {
		for (int i=0;i<MAX;i++) {
			if (arr[i]==num) {
				corrimiento_izquierda_desde_final(arr,i);
			}
		}
	}
	public static void imprimir_arreglo(int [] arr) {
		for(int i=0;i<MAX;i++) {
			System.out.println("arreglo["+i+"]=>: "+arr[i]);
		}
	}
	public static void corrimiento_izquierda_desde_final(int [] arr, int pos) {
		while (pos< MAX-1){    
		arr[pos] = arr[pos+1];
		pos++;
		}
	}

}
