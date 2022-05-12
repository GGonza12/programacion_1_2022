package clase_6;
/* Escribir un programa que mientras que el usuario ingrese un caracter letra
minúscula, pida ingresar un numero entero. Si el número ingresado está
entre 1 y 5 inclusive deberá imprimir la tabla de multiplicar de dicho
numero. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_6_tp_tercera_parte_ejercicio_8 {

	public static void main(String[] args) {
		char caracter;
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
			while ((caracter>='a')&&(caracter<='z')) {
				System.out.println("Ingrese un numero");
				numero = Integer.valueOf(entrada.readLine());
				if ((numero>=1)&&(numero<=5)) {
					tabla_de_multiplicar(numero);
				}
				System.out.println("Ingrese un caracter");
				caracter = entrada.readLine().charAt(0);
			}
			
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
	}
	
	public static void tabla_de_multiplicar(int num) {
		for (int i=1;i<=10;i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}

}
