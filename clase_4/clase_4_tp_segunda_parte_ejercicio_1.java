package clase_4;
/* Hacer un programa que solicite la carga desde consola de un
numero entero y realice:
_si el numero es positivo, imprima “grande” si es mayor a 100 o “chico “ si
es menor. Además deberá imprimir que el valor es positivo.
_si no lo es, imprima si el numero es par, o si el numero es múltiplo de 3, o
ninguna de las opciones anteriores. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_4_tp_segunda_parte_ejercicio_1 {

	public static void main(String[] args) {
		int num1;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero");
			num1 = Integer.valueOf(entrada.readLine());
			if (num1>0) {
				if (num1>100) {
					System.out.println("El numero " + num1 + " es mayor a 100");
				}
				else {
					System.out.println("El numero " + num1 + " es menor a 100");
				}
				System.out.println("el numero es positivo");
				
			}
			else {
				if ((num1 % 2)==0) {
					System.out.println("El numero " + num1 + " es par");
				}
				else if ((num1 % 3)==0) {
					System.out.println("El numero " + num1 + " es multiplo de 3");
				}
				else {
						System.out.println("El numero " + num1 + " no es par ni multiplo de 3");
				}
			}	
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}

}
