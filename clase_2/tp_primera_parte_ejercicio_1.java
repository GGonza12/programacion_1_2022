package clase_2;
/* Escribir un programa que para los tipos int, double, char y boolean
declare una variable en cada caso, luego asigne un valor a cada
una correspondiente al tipo que la variable tiene, e imprima por
pantalla cada una de las variables. */
public class tp_primera_parte_ejercicio_1 {

	public static void main(String[] args) {

		int entero;
		double no_entero;
		boolean respuesta;
		char caracter;
		
		entero = 13;
		no_entero = 14.3;
		respuesta = false;
		caracter = 'a';
		
		System.out.println("Este es un entero: " + entero);
		System.out.println("Este es un numero no entero: " + no_entero);
		System.out.println("Esta es una respuesta: " + respuesta);
		System.out.println("Esto es un caracter: " + caracter);
		

	}

}
