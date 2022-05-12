package clase_6;
/* Escribir un programa que mientras el usuario ingrese un número entero
entre 1 y 10, pida ingresar un caracter, y por cada caracter ingresado
imprima:
– “letra minúscula” si el caracter es una letra del abecedario en minúscula;
– “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
– “dígito” si el caracter corresponde a un carácter número;
– “otro” para los restantes casos de caracteres. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_6_tp_cuarta_parte_ejercicio_10 {

	public static void main(String[] args) {
		int numero;
		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero");
			numero = Integer.valueOf(entrada.readLine());
			while ((numero>=1)&&(numero<=10)) {
				System.out.println("Ingrese un caracter");
				caracter = entrada.readLine().charAt(0);
				tipo_caracter(caracter);
				System.out.println("Ingrese un numero");
				numero = Integer.valueOf(entrada.readLine());
			}
			
		}
		catch (Exception exc) {
			System.out.println(exc);
		}

	}
	public static void tipo_caracter(char car) {
		if((car>='a')&&(car<='z')) {
			System.out.println("Caracter letra minuscula.");
		}
		else if((car>='A')&&(car<='Z')) {
			System.out.println("Caracter letra mayuscula.");
		}
		else if((car>='0')&&(car<='9')) {
			System.out.println("Caracter digito.");
		}
		else{
			System.out.println("Otro caracter.");
		}
	}

}
