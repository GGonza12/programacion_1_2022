package clase_7;
/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y elimine la primer ocurrencia del numero
(un número igual) en el arreglo (si existe). Para ello tendrá que buscar la posición y si está,
realizar un corrimiento a izquierda (queda una copia de la última posición del arreglo en la
anteúltima posición). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_primera_parte_ejercicio_5 {
	public static final int MAX=10;
	public static final int MIN=0;
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
			eliminar_ocurrencia(numero,arreglo);
			imprimir_arreglo(arreglo);
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}
	public static void imprimir_arreglo(int [] arr) {
		for(int i=0;i<MAX;i++) {
			System.out.println("arreglo["+i+"]=>: "+arr[i]);
		}
	}
	public static void eliminar_ocurrencia(int num,int [] arr) {
		boolean primero=false;
		for(int i=0;i<MAX;i++) {
			if((arr[i]==num)&&(primero==false)) {
				corrimiento_izquierda_desde_final(arr,i);
				primero=true;
			}
		}
	}
	public static void corrimiento_izquierda_desde_final(int [] arr, int pos) {
		while (pos< MAX-1){    
		arr[pos] = arr[pos+1];
		pos++;
		}
	}

}
