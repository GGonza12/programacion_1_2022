package clase_7;
/* Hacer un programa que dado un arreglo de enteros de tamaño 10 que se encuentra
precargado, solicite al usuario un numero entero y lo agregue al principio del arreglo
(posición 0). Para ello tendrá que realizar un corrimiento a derecha (se pierde el último valor
del arreglo) y colocar el numero en el arreglo en la posición indicada. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_primera_parte_ejercicio_4 {
	public static final int MAX =10;
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
			agregar_numero_al_arreglo(arreglo,numero);
			imprimir_arreglo(arreglo);
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
	public static void agregar_numero_al_arreglo(int [] arr , int num) {
		corrimiento_der(arr,MIN);
		arr[MIN] = num;
	}
	public static void imprimir_arreglo(int [] arr) {
		for(int i=0;i<MAX;i++) {
			System.out.println("arreglo["+i+"]=>: "+arr[i]);
		}
	}
	public static void corrimiento_der(int [] arrenteros, int pos){
		int indice = MAX-1;
		while (indice > pos){
		arrenteros[indice] = arrenteros[indice-1];
		indice--;
		}
		}

}
