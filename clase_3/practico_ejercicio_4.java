package clase_3;
/* Escribir un programa que ingrese un n�mero entero por teclado e
imprima los resultados de determinar:
_ el n�mero es m�ltiplo de 6 y de 7,
_ el n�mero es mayor a 30 y m�ltiplo de 2, o es menor igual a 30,
_ el cociente de la divisi�n de dicho n�mero con 5 es mayor a 10. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class practico_ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		double multiplodos,multiploseis,multiplosiete,cociente;
		boolean multiplo,resultado;
		try {
			
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un numero entero");
			numero = Integer.valueOf(entrada.readLine());
			multiploseis = numero % 6;
			multiplosiete = numero % 7;
			multiplodos = numero % 2;
			multiplo = (multiploseis==0)&&(multiplosiete==0);
			System.out.println("Es " + multiplo + " que el numero sea multiplo de 6 y 7");
			System.out.println("Es " +((numero>30)&&(multiplodos == 0) || (numero<=30)));
            cociente = (numero / 5);
            resultado = (cociente > 10);
			System.out.println(resultado);
			
		}
		catch (Exception exc){
			System.out.println(exc);
		}

	}
}
