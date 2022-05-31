package clase_7;
/* Hacer un programa que dado el arreglo definido y precargado permita encontrar la
posición de inicio de la anteúltima secuencia (considerar comenzar a buscarla a
partir de la ultima posición del arreglo). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_tercera_parte_ejercicio_12 {
	public static final int MAX=20;
	public static final int MIN=0;
	public static void main(String[] args) {
		int [] arreglo = { 0, 4, 3, 2, 0, 0,3,4,5,2,0,3,5,7,5,3,0,2,3,0 };
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			imprimir_arreglo(arreglo);
			mostrar_anteultima_secuencia(arreglo);
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}
	public static void mostrar_anteultima_secuencia(int [] arr) {
		int inicio,fin,anteult;
		anteult=2;
		inicio = MAX;
		fin =MAX-1;
		while (fin>=MIN) {
			fin = obtener_fin_secuencia(arr,inicio-1);
			if(inicio>=MIN) {
				inicio=obtener_inicio_secuencia(arr,fin);
					anteult--;
				if(anteult==0) {
					System.out.println("Posicion incio de anteultima secuencia: "+inicio+" ultima posicion: "+(fin+1));
				}
				}
				 
			}

		}
	public static int obtener_fin_secuencia(int [] arr,int pos) {
		while((pos>=MIN)&&(arr[pos]==0)) {
			pos--;
		}
		return pos;
	}
	public static int obtener_inicio_secuencia(int [] arr,int pos) {
		while((pos>=MIN)&&(arr[pos]!=0)) {
			pos--;
		}
		return pos;
	}
	public static void imprimir_arreglo(int [] arr) {
		for(int i=0;i<MAX;i++) {
			System.out.println("arreglo["+i+"]=>: "+arr[i]);
		}
	}

}
