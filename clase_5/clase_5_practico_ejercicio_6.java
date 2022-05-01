package clase_5;
/* Escribir un programa que mientras el usuario ingrese un caracter letra
minúscula, acumule la cantidad de vocales que ingreso. Finalmente
muestre por pantalla dicha cantidad. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_5_practico_ejercicio_6 {

	public static void main(String[] args) {
		char caracter;
		int vocales=0;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter");
			caracter= entrada.readLine().charAt(0);
			while(caracter!='*') {
				if ((caracter=='a')||(caracter=='e')||(caracter=='i')||(caracter=='o')||(caracter=='u')) {
					vocales++;
				}
				System.out.println("Ingrese otro caracter o ingrese * para salir.");
				caracter= entrada.readLine().charAt(0);
			}
			System.out.println("La cantidad de vocales que ingreso es de: " + vocales);
		}
		catch(Exception exc) {
			System.out.println(exc);
		}

	}

}
