package clase_7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario una posición y realice un corrimiento a izquierda o hacia la
menor posición del arreglo. */
public class clase_7_tp_primera_parte_ejercicio_3 {
	public static final int MAX = 10;
	public static final int MIN =0;
	public static void main(String[] args) {
		int [] arreglo = new int [MAX];
		int corr;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int i=0;i<MAX;i++) {
				System.out.println("Ingrese un numero");
				arreglo[i] = Integer.valueOf(entrada.readLine());
			}
			imprimir_arreglo(arreglo);
			System.out.println("Seleccione la posicion donde quiere hacer el corrimiento a izquierda");
			corr = Integer.valueOf(entrada.readLine());
			corrimiento_izquierda(arreglo,corr);
			imprimir_arreglo(arreglo);
		}
		catch (Exception exc) {
			
		}
	}
	public static void imprimir_arreglo(int [] arr) {
		for(int i=0;i<MAX;i++) {
			System.out.println("arreglo["+i+"]=>: "+arr[i]);
		}
	}
	public static void corrimiento_izquierda(int [] arr, int pos) {
		int indice = MIN;
		while (indice < pos){    
		arr[indice] = arr[indice+1];
		indice++;
		}
	}

}
