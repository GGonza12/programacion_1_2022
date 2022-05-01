package clase_5;
/* Escribir un programa que mientras que el usuario ingrese un caracter letra
minúscula, pida ingresar un numero entero. Si el número ingresado está
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
numero. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_5_practico_ejercicio_8 {

	public static void main(String[] args) {
		final int MAX = 10;
		char caracter;
		int numero;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
				while ((caracter>='a')&&(caracter<='z')) {
					System.out.println("Ingrese un numero");
					numero = Integer.valueOf(entrada.readLine());
					if ((numero>=1)&&(numero<=5)) {
						for(int i=1;i<=MAX;i++) {
							System.out.println(i + "*" + numero + " = " + (i*numero));
						}
					}
					System.out.println("Ingrese otro caracter letra minuscula si quiere otra tabla o ingrese otra cosa para terminar.");
					caracter = entrada.readLine().charAt(0);
				}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
