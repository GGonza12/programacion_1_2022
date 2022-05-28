package clase_7;
/* Para los ejercicios que siguen suponer que se tienen los siguientes métodos
(existen y no se tienen que implementar):
_un método que permite cargar un arreglo de secuencias del tipo y tamaño
(constante) solicitado por el ejercicio.
_un método que permite imprimir un arreglo de secuencias del tipo y tamaño
(constante) solicitado por el ejercicio.
Si utiliza alguno de los métodos anteriores deberá definir el encabezado
dentro del programa y realizar su invocación donde se requiera.
10. Se tiene un arreglo de enteros de tamaño 20 de secuencias de números
entre 1 y 9, separadas por 0. El arreglo esta precargado, y además
empieza y termina con uno o más separadores 0. Hacer un programa que
permita obtener a través de métodos la posición de inicio y la posición de
fin de la secuencia ubicada a partir de una posición entera ingresada por
el usuario. Finalmente, si existen imprima por pantalla ambas posiciones
obtenidas. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_tercerca_parte_ejercicio_10 {
	public static final int MAX = 20;
	public static final int MIN = 0;
	public static void main(String[] args) {
		int [] arreglo = { 0, 4, 3, 2, 0, 0,3,4,5,2,0,3,5,7,5,3,0,2,3,4 };
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			
			imprimir_arreglo(arreglo);
			System.out.println("Ingrese posicion.");
			numero = Integer.valueOf(entrada.readLine());
			mostrar_inicio_fin_secuencia(arreglo,numero);
			
		}
		
		catch(Exception exc) {
			System.out.println(exc);
		}
	
	}
	public static void mostrar_inicio_fin_secuencia (int [] arr,int num) {
		int inicio,fin,pos;
		inicio = 0;
		fin =-1;
		while (inicio<MAX) {
			inicio = obtener_inicio_secuencia(arr,fin+1);
			if(inicio<MAX) {
				fin=obtener_fin_secuencia(arr,inicio);
				pos=verificar_secuencia(arr,inicio,fin,num);
				if((fin<MAX)&&(arr[pos]!=0)&&(pos==num)) {
					
					System.out.println("Inicio de secuencia es: " + inicio);
					System.out.println("Fin de secuencia es: " + (fin-1));
				}
				 
			}
		}	
	}
	public static int verificar_secuencia (int arr [],int inicio,int fin,int pos) {
		int num=inicio;
		while((num<fin)&&(num!=pos)) {
			num++;
		}
		
		return num;
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
