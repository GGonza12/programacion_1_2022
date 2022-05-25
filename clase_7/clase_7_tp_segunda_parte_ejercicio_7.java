package clase_7;
/* Hacer un programa que dado un arreglo ordenado creciente de enteros
de tamaño 10 que se encuentra precargado, solicite al usuario un numero
entero y lo inserte en el arreglo manteniendo su orden. Para ello tendrá
que realizar un corrimiento a derecha (se pierde el último valor del arreglo)
y colocar el numero en el arreglo en la posición indicada. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_segunda_parte_ejercicio_7 {
	public static final int MAX = 10;
	public static final int MIN = 0;
	public static void main(String[] args) {
		int [] arreglo = new int [MAX];
		int numero,posicion;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int i=0;i<MAX;i++) {
				System.out.println("Ingrese un para el arreglo posicion: " + i );
				arreglo[i] = Integer.valueOf(entrada.readLine());
			}
			imprimir_arreglo(arreglo);
			System.out.println("Ingrese un numero para meter al arreglo");
			numero = Integer.valueOf(entrada.readLine());
			posicion = posicion_arreglo(numero, arreglo);
			System.out.println(posicion);
			meter_en_arreglo(numero,posicion,arreglo);
			imprimir_arreglo(arreglo);
			
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
	public static int posicion_arreglo(int num, int [] arr) {
		int pos=0;
		while ((num>=arr[pos])&&(pos<MAX)) {
			pos++;
		}
		return pos;
	}
	public static void meter_en_arreglo(int num,int pos, int [] arr) {
				corrimiento_der(arr,pos);
				arr[pos]=num;	
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
