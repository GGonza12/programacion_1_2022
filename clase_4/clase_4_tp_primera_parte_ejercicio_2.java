package clase_4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Escribir un programa que permita el ingreso de dos n�meros enteros
por teclado y realice:
_ imprima A si el primero mayor al segundo,
_ o imprima B si ambos son m�ltiplos de 2,
_ o imprima C para ninguna de las opciones anteriores */
public class clase_4_tp_primera_parte_ejercicio_2 {
	public static void main(String[] args) {
	int num1,num2;
	
	try {
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Ingrese un numero entero");
		num1 = Integer.valueOf(entrada.readLine());
		System.out.println("Ingrese otro numero entero");
		num2 = Integer.valueOf(entrada.readLine());
		if (num1>num2) {
			System.out.println("A");
		}
		else if (((num1 % 2) ==0)&&(( num2 % 2) == 0)){
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
		
		
	}
	catch(Exception exc) {
		System.out.println(exc);
	}

}
}
