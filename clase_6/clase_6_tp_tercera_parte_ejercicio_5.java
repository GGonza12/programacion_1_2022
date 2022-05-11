package clase_6;
/* Escribir un programa que mientras el usuario ingresa un caracter distinto
del caracter ‘*’, invoque a un método que imprima si es caracter dígito o
caracter letra minúscula, y si es letra minúscula imprimir si es vocal o
consonante. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_6_tp_tercera_parte_ejercicio_5 {

	public static void main(String[] args) {
		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un caracter.");
			caracter = entrada.readLine().charAt(0);
			while (caracter != '*') {
				imprimir_tipo_de_caracter(caracter);
				System.out.println("Ingrese un caracter.");
				caracter = entrada.readLine().charAt(0);
				
			}
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
	}
	public static void imprimir_tipo_de_caracter(char car) {
		if((car >='0') && (car<='9')) {
			System.out.println("Es caracter digito.");
		}
		else if ((car>='a')&&(car<='z')) {
			System.out.println("Es caracter minuscula.");
			if ((car=='a')||(car=='e')||(car=='i')||(car=='o')||(car=='u')) {
				System.out.println("Es vocal.");
			}
			else {
				System.out.println("Es consonante.");
			}
		}
	}

}
