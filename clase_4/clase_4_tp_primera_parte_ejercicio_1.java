package clase_4;
/* Escribir un programa que permita el ingreso de un carácter y realice:
_ imprima es carácter dígito si el carácter ingresado es carácter
dígito,
_ o imprima no es carácter dígito */
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
