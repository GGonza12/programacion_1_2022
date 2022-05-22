package clase_7;
/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se
encuentra precargado, solicite al usuario el ingreso de dos números
enteros (posiciones del arreglo) y ordene de forma creciente el arreglo
entre dos posiciones correspondientes a los números ingresados. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_segunda_parte_ejercicio_9 {
	public static final int MAX = 10;
	public static final int MIN = 0;
	public static void main(String[] args) {
		int [] arreglo = new int [MAX];
		int num1,num2;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int i=0;i<MAX;i++) {
				System.out.println("Ingrese un para el arreglo posicion: " + i );
				arreglo[i] = Integer.valueOf(entrada.readLine());
			}
			imprimir_arreglo(arreglo);
			System.out.println("Ingrese primera posicion.");
			num1 = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese segunda posicion.");
			num2 = Integer.valueOf(entrada.readLine());
			ordenar_arreglo_burbujeo(arreglo,num1,num2);
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
	public static void ordenar_arreglo_burbujeo(int[] arr, int posinicio, int posfinal){
		int temp;
		for(int i = posinicio+1;i < posfinal+1;i++){
		for (int j = posinicio ; j < posfinal; j++){
		if (arr[j] > arr[j+1]){
		temp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = temp;

		}
		}
		}
		}
		}


