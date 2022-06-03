package clase_7;
/* 17. Suponer que se tienen dos arreglos A y B de secuencias (de caracteres separados por uno o
m�s espacio) de tama�o MAX (arreglo empieza y termina con uno o m�s caracteres
espacio). A y B que est�n precargadas, y adem�s se tienen los siguientes m�todos (existen y
no se tienen que implementar):
a) un m�todo que permite obtener el �ndice inicial de la secuencia que m�s se repite de un
arreglo de secuencias de tama�o MAX (que empieza y termina con o m�s caracteres
espacios).
b) un m�todo que retorna el �ndice inicial de la secuencia que tiene m�s caracteres
repetidos de un arreglo de secuencias (de caracteres separados por uno o m�s caracteres
espacio) de tama�o MAX (que empieza y termina con espacio).
Se pide realizar un programa completo que (sin utilizar arreglos auxiliares/extras a los
mencionados):
_reemplace en A la secuencia que m�s se repite por la secuencia de B con m�s
caracteres repetidos (la separaci�n previa entre las secuencias de A debe mantenerse).
En caso de utilizar uno o m�s de los m�todos preexistentes mencionados en el enunciado
definir el o los encabezados de los mismos. No se requiere hacer m�todos de carga e
impresi�n de arreglos. */
public class clase_7_tp_tercera_parte_ejercicio_17 {
	public static final int MAX=20;
	public static final int MIN=0;
	public static void main(String[] args) {
		
		char [] arreglo_A= { ' ','a','b', 'd', ' ', 'c','d','e',' ','a','b','c','d',' ','c','d',' ','a','b',' ' };
		char [] arreglo_B= { ' ','z','z', 'a', ' ', 'z','e','a',' ','a','e','e','e',' ','f','f',' ','h','j',' ' };
		
		copiar_secuencia(arreglo_A,arreglo_B);
		imprimir_arreglo(arreglo_A);

	}
  //{' ','a','b','c',' '} arreglo b
	   //{' ','z','z','z','z',' '} arreglo a
	public static void copiar_secuencia(char [] arrA,char [] arrB) {
		int inicioA= indice_inicial_mas_repetido(arrA);
		int finA=obtener_fin_secuencia(arrA,inicioA);
		int inicioB= indice_inicial_caracteres_repetidos(arrB);
		int finB=obtener_fin_secuencia(arrB,inicioB);
		int tamanoA= ((finA-inicioA)+1); //3
		int tamanoB= ((finB-inicioB)+1); //4
		int dif;
		if(tamanoA<tamanoB) {
			dif=(tamanoB)-(tamanoA);
			corrimiento_derecha_diferencia(arrA,dif,inicioA,finA);
			reemplazar(arrA,arrB,inicioA,inicioB,finA,finB);
		}
		else if(tamanoB<tamanoA) {
			dif=(tamanoA)-(tamanoB);
			corrimiento_izquierda_diferencia(arrA,dif,inicioA,finA);
			reemplazar(arrA,arrB,inicioA,inicioB,finA,finB);
		}
		else if (tamanoB==tamanoA) {
			reemplazar(arrA,arrB,inicioA,inicioB,finA,finB);
		}
		
	}
	public static void corrimiento_izquierda_diferencia(char [] arrA,int dif,int inicioA,int finA) {
		int i=0;
		while(i<dif) {
			corrimiento_izquierda(arrA,finA);
			i++;
		}
	}
	public static void reemplazar(char []arrA,char [] arrB,int inicioA, int inicioB,int finA,int finB) {
		int pos=inicioA;
		int posB=inicioB;
		while (pos<finA) {
			arrA[pos]=arrB[posB];
			pos++;
			posB++;
		}
	}
	public static void corrimiento_derecha_diferencia(char []arrA,int dif,int fin, int inicio) {
		int i=0;
		while(i<dif) {
			corrimiento_derecha(arrA,fin);
			i++;
		}
	}
	public static void corrimiento_izquierda(char [] arr,int pos) {
		while(pos<MAX) {
			arr[pos]=arr[pos+1];
			pos++;
		}
	}
	public static void corrimiento_derecha(char [] arr, int pos) {
		int indice=MAX-1;
		while(indice>pos) {
			arr[indice]= arr[indice-1];
			indice--;
		}
	}
	public static int indice_inicial_mas_repetido(char []arr) {
		return -1;
	}
	public static int indice_inicial_caracteres_repetidos(char []arr) {
		return -1;
	}
	
	public static int obtener_fin_secuencia(char [] arr,int pos) {
		while((pos<MAX)&&(arr[pos]!=0)) {
			pos++;
		}
		return pos-1;
	}
	public static void imprimir_arreglo(char [] arr) {
		for(int i=0;i<MAX;i++) {
			System.out.println("arreglo["+i+"]=>: "+arr[i]);
		}
	}

}
