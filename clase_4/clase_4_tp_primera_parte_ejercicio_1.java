package clase_4;
/* Escribir un programa que permita el ingreso de un car�cter y realice:
_ imprima es car�cter d�gito si el car�cter ingresado es car�cter
d�gito,
_ o imprima no es car�cter d�gito */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_4_tp_primera_parte_ejercicio_1 {

	public static void main(String[] args) {
		char caracter;

		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un carcter");
			caracter = entrada.readLine().charAt(0);
			if ((caracter >= '0')&&(caracter <= '9')) {
				System.out.println("Es un caracter digito");
			}
			else {
				System.out.println("No es un caracter digito");
			}
			
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	
		
	}

}
