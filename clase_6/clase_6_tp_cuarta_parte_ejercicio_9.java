package clase_6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Realizar un programa que dado dos números enteros y un
carácter, todos ingresados por el usuario, muestre por
pantalla el resultado de la operación matemática básica
considerando el valor del carácter. Si ingreso el caracter:
– ‘a’ la suma, ‘b’ la resta, ‘c’ la multiplicación y ‘d’ la división
entre ambos números. */
public class clase_6_tp_cuarta_parte_ejercicio_9 {

	public static void main(String[] args) {

		int num1,num2;
		char caracter;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			System.out.println("Ingrese un numero.");
			num1= Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese otro numero numero.");
			num2= Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el caracter 'a' para suma 'b' resta 'c' multiplicacion 'd' division.");
			caracter = entrada.readLine().charAt(0);
			calculadora(num1,num2,caracter);
			
		}
		
		catch (Exception exc) {
			System.out.println(exc);
		}
	}
	
	public static void calculadora(int n1, int n2, char op) {
		if (op == 'a') {
			System.out.println("El resultado de la suma es : " + (n1+n2));
		}
		if (op == 'b') {
			System.out.println("El resultado de la resta es : " + (n1-n2));
		}
		if (op == 'c') {
			System.out.println("El resultado de la multiplicacion es : " + (n1*n2));
		}
		if (op == 'd') {
			System.out.println("El resultado de la division es : " + (n1/n2));
		}
	}

}
