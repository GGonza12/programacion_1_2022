package clase_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_segunda_parte_ejercicio_2 {

	public static void main(String[] args) {
		int edad;
		String nombre,apellido,ocupacion,direccion;
		double altura;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese su nombre:");
			nombre = entrada.readLine();
			System.out.println("Ingrese su apellido:");
			apellido = entrada.readLine();
			System.out.println("Ingrese su edad:");
			edad = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese su altura:");
			altura = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese su ocupaci�n:");
			ocupacion = entrada.readLine();
			System.out.println("Ingrese su direcci�n:");
			direccion = entrada.readLine();
			System.out.println("Su nombre completo es: " + nombre + " " + apellido + ", su edad y altura son: " + edad + ", " + altura + ", su ocupacion es: " + ocupacion + " y su direccion es: " + direccion);			
		}
		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}
