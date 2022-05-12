package clase_6;
/* Escribir un programa que mientras el usuario ingrese un número entero
entre 1 y 10 realice:
– Si el numero ingresado es múltiplo de 3 pida ingresar un caracter, y para el caracter
ingresado imprima a que tipo de carácter esta asociado:
• “letra minúscula” si el caracter es una letra del abecedario en minúscula;
• “letra mayúscula” si el caracter es una letra del abecedario en mayúscula;
• “dígito” si el caracter corresponde a un carácter número;
• “otro” para los restantes casos de caracteres.
– Si el numero ingresado es múltiplo de 5 imprima la tabla de multiplicar del numero
ingresado. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_6_tp_cuarta_parte_ejercicio_11 {

	public static void main(String[] args) {
		int numero;
		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero");
			numero = Integer.valueOf(entrada.readLine());
			while ((numero>=1)&&(numero<=10)) {
				if (numero%3==0) {
					System.out.println("Ingrese un caracter");
					caracter = entrada.readLine().charAt(0);
					tipo_caracter(caracter);
				}
				if (numero%5==0){
					tabla_de_multiplicar(numero);
				}
				System.out.println("Ingrese un numero");
				numero = Integer.valueOf(entrada.readLine());
			}
			
		}
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
	public static void tabla_de_multiplicar(int num) {
		for (int i=1;i<=10;i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
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
