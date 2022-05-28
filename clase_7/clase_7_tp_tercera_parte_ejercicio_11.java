package clase_7;
/* Hacer un programa que dado el arreglo definido y precargado permita encontrar la
posición de inicio de la secuencia cuya suma de valores sea mayor. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_tercera_parte_ejercicio_11 {
	public static final int MAX = 20;
	public static final int MIN = 0;
	public static void main(String[] args) {
		int [] arreglo = { 0, 4, 3, 2, 0, 0,3,4,5,2,0,3,5,7,5,3,0,2,3,4 };
		try {
			imprimir_arreglo(arreglo);
			mostrar_mayor_secuencia(arreglo);
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}
	public static void mostrar_mayor_secuencia(int [] arr) {
		int inicio,fin,suma,mayorsuma,mayorinicio,mayorfin;
		mayorsuma=0;
		mayorinicio=0;
		mayorfin=0;
		inicio = 0;
		fin =-1;
		while (inicio<MAX) {
			inicio = obtener_inicio_secuencia(arr,fin+1);
			if(inicio<MAX) {
				fin=obtener_fin_secuencia(arr,inicio);
					suma=calcular_suma_secuencia(arr,inicio,fin);
					if(suma>mayorsuma) {
						mayorsuma=suma;
						mayorinicio=inicio;
						mayorfin=fin;
					}
				}
				 
			}
		System.out.println("La secuencia mayor es de : " + mayorsuma + ", su inicio es: "+ mayorinicio + " y su fin es: "+(mayorfin-1));
		}	
	public static int calcular_suma_secuencia(int [] arr,int inicio,int fin) {
		int suma=0;
		for(int i=inicio;i<fin;i++) {
			suma+=arr[i];
		}
		return suma;
	}
	public static int obtener_inicio_secuencia(int [] arr,int pos) {
		while((pos<MAX)&&(arr[pos]==0)) {
			pos++;
		}
		return pos;
	}
	public static int obtener_fin_secuencia(int [] arr,int pos) {
		while((pos<MAX)&&(arr[pos]!=0)) {
			pos++;
		}
		return pos;
	}
	public static void imprimir_arreglo(int [] arr) {
		for(int i=0;i<MAX;i++) {
			System.out.println("arreglo["+i+"]=>: "+arr[i]);
		}
	}

}
