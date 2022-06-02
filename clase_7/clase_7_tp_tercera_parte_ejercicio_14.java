package clase_7;
/* 14. Hacer un programa que dado el arreglo definido y precargado, y un número entero
ingresado por el usuario, copie de forma continua las secuencias de tamaño igual al
número ingresado en otro arreglo de iguales características e inicializado con 0. La
copia en este último arreglo deben comenzar desde el principio del mismo. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_7_tp_tercera_parte_ejercicio_14 {
	public static final int MAX=20;
	public static final int MIN=0;
	public static void main(String[] args) {
		int [] arreglo = { 0, 4, 3, 2, 0, 0,3,4,5,2,0,3,5,7,5,3,0,2,3,0 };
		int [] arreglo_copia = { 0, 0, 0, 0, 0, 0,0,0,0,0,0,0,0,0,0,0,0,0,0,0 };
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			imprimir_arreglo(arreglo);
			System.out.println("Ingrese tamaño de secuencia a copiar.");
			numero = Integer.valueOf(entrada.readLine());
			buscar_numero_igual_secuencia(arreglo,arreglo_copia,numero);
			imprimir_arreglo(arreglo_copia);
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}
	public static void buscar_numero_igual_secuencia(int [] arr,int [] arrcopia,int num) {
		int inicio,fin;
		inicio = 0;
		fin =-1;
		while (inicio<MAX) {
			inicio = obtener_inicio_secuencia(arr,fin+1);
			if(inicio<MAX) {
				fin=obtener_fin_secuencia(arr,inicio);
				if(num==((fin-inicio)+1)) {
					System.out.println("inicio: "+inicio+" fin: "+ fin);
					corrimiento_secuencia_y_copia(arr,arrcopia,inicio,fin);
				}
				 
			}

		}
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
		return pos-1;
	}
	public static void imprimir_arreglo(int [] arr) {
		for(int i=0;i<MAX;i++) {
			System.out.println("arreglo["+i+"]=>: "+arr[i]);
		}
	}
	public static void corrimiento_secuencia_y_copia(int [] arr,int [] arrcopia,int inicio,int fin) {
		int i=0;
		while(i<((fin-inicio)+1)) {
			corrimiento_derecha(arrcopia,i);
			arrcopia[i]=arr[inicio+i];
			i++;
			
		}
	}
	public static void corrimiento_derecha(int []arr,int pos) {
		int inidice=MAX-1;
		while(inidice>pos){
			arr[inidice]=arr[inidice-1];
			inidice--;
			
		}
	}

}
