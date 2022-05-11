package clase_6;
/* Escribir un programa que mientras el usuario cargue desde
teclado un caracter letra minúscula, llame a un método
que imprime por pantalla la tabla de multiplicar de 9. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_6_tp_segunda_parte_ejercicio_3 {

	public static final int MULT = 9;
	public static void main(String[] args) {
		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
			while ((caracter>='a')&&(caracter<='z')) {
				imprimir_tabla();
				System.out.println("Ingrese un caracter");
				caracter = entrada.readLine().charAt(0);
			}
			
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
	}
	public static void imprimir_tabla() {
		for (int num=1;num<=10;num++) {
			System.out.println("9 * " + num +" = " + (num*MULT));
		}
	}

}
