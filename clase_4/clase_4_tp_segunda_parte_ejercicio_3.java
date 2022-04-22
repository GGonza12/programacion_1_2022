package clase_4;
/* Construir un programa que solicite desde teclado un número de
mes y posteriormente notifique por pantalla la cantidad de días
de ese mes. En el caso de que ingrese 2 como número de mes
(febrero), para imprimir la cantidad de días deberá solicitar
ingresar un número de anio (no usar ñ), para determinar si es
bisiesto o no con la siguiente sentencia:
_si ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) es verdadero,
entonces es bisiesto. */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class clase_4_tp_segunda_parte_ejercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes,anio;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el mes");
			mes = Integer.valueOf(entrada.readLine());
			switch (mes) {
			case 1: {
				System.out.println("Hay 31 dias");
				break;
			}
			case 2: {
				System.out.println("Ingrese el año");
				anio = Integer.valueOf(entrada.readLine());
				if(((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))) {
					System.out.println("Es bisiesto y tiene 29 dias.");
				}
				else {
					System.out.println("no es bisiesto y tiene 28 dias.");
				}
					break;
				}
			case 3: {
				System.out.println("Hay 31 dias.");
				break;
			}
			case 4: {
				System.out.println("Hay 30 dias.");
				break;
			}
			case 5: {
				System.out.println("Hay 31 dias.");
				break;
			}
			case 6: {
				System.out.println("Hay 30 dias.");
				break;
			}
			case 7: {
				System.out.println("Hay 31 dias.");
				break;
			}
			case 8: {
				System.out.println("Hay 31 dias.");
				break;
			}
			case 9: {
				System.out.println("Hay 30 dias.");
				break;
			}
			case 10: {
				System.out.println("Hay 31 dias.");
				break;
			}
			case 11: {
				System.out.println("Hay 30 dias.");
				break;
			}
			case 12: {
				System.out.println("Hay 31 dias.");
				break;
			}
			default : {
				System.out.println("Mes ingresado incorrecto.");
			}
			}
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}

}
