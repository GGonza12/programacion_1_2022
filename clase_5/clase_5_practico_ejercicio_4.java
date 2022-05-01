package clase_5;
/* Escribir un programa que mientras que el usuario ingrese un caracter dígito
o caracter letra minúscula, imprima si es caracter dígito o caracter letra
minúscula, y si es letra minúscula imprimir si es vocal o consonante. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_5_practico_ejercicio_4 {

	public static void main(String[] args) {
		char caracter;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
			while (caracter!='*') {
				if((caracter>='0')&&(caracter<='9')) {
					System.out.println("Es caracter digito " + caracter);
				}
				else if((caracter>='a')&&(caracter<='z')) {
					System.out.println("Es caracter letra minuscula " + caracter);
					if((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')) {
						System.out.println("Es vocal");
					}
					else {
						System.out.println("Es consonante");
					}
				}
				System.out.println("Ingrese otro caracter o ingrese * para salir");
				caracter = entrada.readLine().charAt(0);
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}

}
