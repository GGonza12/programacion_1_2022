package clase_7;
/* Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y elimine la primer ocurrencia de numero (un número igual) en el
arreglo (si existe). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_segunda_parte_ejercicio_8 {
	public static final int MAX = 10;
	public static final int MIN = 0;
	public static void main(String[] args) {
		int [] arreglo = new int [MAX];
		int numero;
		int ocurrencia;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int i=0;i<MAX;i++) {
				System.out.println("Ingrese un para el arreglo posicion: " + i );
				arreglo[i] = Integer.valueOf(entrada.readLine());
			}
			imprimir_arreglo(arreglo);
			System.out.println("Ingrese numero a eliminar");
			numero = Integer.valueOf(entrada.readLine());
			ocurrencia = encontrar_ocurrencia(numero,arreglo);
			eliminar_ocurrencia(ocurrencia,arreglo);
			imprimir_arreglo(arreglo);
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}
	public static int encontrar_ocurrencia(int num,int []arr) {
		int i=0;
		while(num!=arr[i]) {
			i++;
		}
		return i;
	}
	public static void eliminar_ocurrencia(int pos,int [] arr) {
				corrimiento_izquierda_desde_final(arr,pos);
	}
	public static void corrimiento_izquierda_desde_final(int [] arr, int pos) {
		while (pos< MAX-1){    
		arr[pos] = arr[pos+1];
		pos++;
		}
	}
	public static void imprimir_arreglo(int [] arr) {
		for(int i=0;i<MAX;i++) {
			System.out.println("arreglo["+i+"]=>: "+arr[i]);
		}
	}

}
