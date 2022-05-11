package clase_6;
/* Escribir un diseño de programa que mientras que el usuario
ingrese un caracter dígito o caracter letra minúscula,
imprima dicho caracter, y si es caracter letra minúscula,
imprima si es vocal o consonante. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_6_tp_primera_parte_ejercicio_2 {

	public static void main(String[] args) {
		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un caracter.");
			caracter = entrada.readLine().charAt(0);
			while (((caracter>='0') && (caracter<='9')) || ((caracter>='a')&&(caracter<='z')) ) {
				System.out.println("El caracter es: " + caracter);
				if(((caracter>='0') && (caracter<='9'))!=true) {
					if ((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')) {
						System.out.println("El caracter es vocal");
					}
					else {
						System.out.println("El caracter es consonante ");
					}
				}
				System.out.println("Ingrese un caracter.");
				caracter = entrada.readLine().charAt(0);
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
