package clase_5;
/* Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, muestre por pantalla si es caracter digito, o si es caracter
vocal minúscula. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_5_practico_ejercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char caracter;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
			while (caracter != '*') {
				if ((caracter>='0')&&(caracter<='9')) {
					System.out.println("caracter digito");
				}
				else if ((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')){
					System.out.println("Caracter vocal minuscula");
				}
				System.out.println("Ingrese un caracter");
				caracter = entrada.readLine().charAt(0);
			}
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}

}
