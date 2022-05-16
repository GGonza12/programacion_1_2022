package clase_7;
/* Hacer un programa que dado un arreglo de enteros de tama�o 10 que se encuentra
precargado, invierta el orden del contenido (por ejemplo: el que est� en 0 se intercambia con
el que est� en 9, el que est� en 1 con el que est� en 8...). Este intercambio no se debe realizar
de manera expl�cita, hay que hacer un m�todo que incluya una iteraci�n de intercambio. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_primera_parte_ejercicio_1 {
	public static int MAX = 10;
	public static void main(String[] args) {
		int [] arreglo = new int [MAX];
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			for(int i=0;i<MAX;i++) {
				System.out.println("Ingrese un numero");
				arreglo[i]= Integer.valueOf(entrada.readLine());
			}
			imprimir_arreglo(arreglo);
			invertir_arreglo(arreglo);
			System.out.println("Arreglo invertido:");
			imprimir_arreglo(arreglo);
			
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
		

	}
	public static void imprimir_arreglo(int [] arr) {
		for(int i=0;i<MAX;i++) {
			System.out.println("arreglo["+i+"]=>: "+arr[i]);
		}
	}
	public static void invertir_arreglo(int [] arr) {
		int temp=0;
		for(int i = 0;i<(MAX/2);i++) {
			temp=arr[i];
			arr[i]=arr[(MAX-1)-i];
			arr[(MAX-1)-i]=temp;
		}
	}

}
