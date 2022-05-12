package clase_6;
/* Escribir un programa que mientras el usuario ingresa un numero de mes
(entero) entre 1 y 12 inclusive, muestre por pantalla la cantidad de días del
mes ingresado (suponer febrero de 28 días) (¿mostrar por pantalla la
cantidad de días del mes debería realizarse con un método? Debería). */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_6_tp_tercera_parte_ejercicio_7 {

	public static void main(String[] args) {
		int numero;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese un numero de mes.");
			numero = Integer.valueOf(entrada.readLine());
			while ((numero>=1)&&(numero<=12)) {
				cantidad_dias(numero);
				System.out.println("Ingrese un numero de mes.");
				numero = Integer.valueOf(entrada.readLine());
			}
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}
	public static void cantidad_dias(int mes) {
		if ((mes==1)||(mes==3)||(mes==5)||(mes==7)||(mes==8)||(mes==10)||(mes==12)) {
			System.out.println("Tiene 31 dias.");
		}
		else if ((mes==4)||(mes==6)||(mes==9)||(mes==11)) {
			System.out.println("Tiene 30 dias.");
		}
		else if (mes==2) {
			System.out.println("Tiene 28 dias.");
		}
	}

}
