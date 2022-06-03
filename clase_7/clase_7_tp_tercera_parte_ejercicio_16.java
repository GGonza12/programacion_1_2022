package clase_7;
/* Hacer un programa que dado el arreglo definido y precargado elimine todas las
secuencias que tienen orden descendente entre sus elementos. */
public class clase_7_tp_tercera_parte_ejercicio_16 {
	public static final int MAX=20;
	public static final int MIN=0;
	public static void main(String[] args) {
		int [] arreglo = { 0, 7, 5, 3, 0, 0,2,2,2,0,0,9,7,7,5,3,0,2,3,0 }; //{ 0, 4, 3, 2, 0, 0,3,4,5,2,0,3,5,7,5,3,0,2,3,0 }
		
		imprimir_arreglo(arreglo);
		eliminar_secuencia_descendente(arreglo);
		imprimir_arreglo(arreglo);
		

	}
	public static void eliminar_secuencia_descendente(int [] arr) {
		int inicio,fin;
		inicio = 0;
		fin =-1;

		while (inicio<MAX) {
			inicio = obtener_inicio_secuencia(arr,fin+1);
			if(inicio<MAX) {
				fin=obtener_fin_secuencia(arr,inicio);				
					System.out.println("arreglo_normal inicio: "+inicio+" fin: "+ fin);
					if(secuencia_descendente(arr,inicio,fin)) {
						System.out.println("correr.");
						corrimiento_secuencia(arr,fin,inicio);
						fin=inicio;
						}				
			      }
			}
	}
	public static boolean secuencia_descendente(int [] arr,int inicio,int fin) {
		int pos=inicio;
		while((pos<fin)&&(arr[pos]>=arr[pos+1])) {
			pos ++;
		}
		if(pos==fin) {
			return true;
		}
		else {
			return false;
		}
	}
				 
	public static void corrimiento_izquierda_desde_final(int [] arr, int pos) {
		while (pos< MAX-1){    
		arr[pos] = arr[pos+1];
		pos++;
		}
	}
	public static void imprimir_arreglo(int [] arr) {
		for(int i=0;i<MAX;i++) {
			System.out.println("arreglo["+i+"]=>: "+arr[i]);
		}
	}
	public static void corrimiento_secuencia(int [] arr,int fin,int inicio) {
		int i=0;
		while(i<(fin-inicio)+1) {
			corrimiento_izquierda_desde_final(arr,inicio);
			i++;
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

}
