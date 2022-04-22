package clase_3;
/* Escribir un programa que imprima por pantalla la tabla de valores de
verdad para el or y and por separado. Por ejemplo, imprimir el siguiente
caso del or

System.out.println(“ false or true es: ”+(false || true)); */
public class clase_3_practico_ejercicio_2 {

	public static void main(String[] args) {

		System.out.println("la tabla de valor de or \n" + "a \t" + "b \t" + "a or b \n" + "false \t" + "false \t" + (false||false));
		System.out.println("false \t" + "true \t" + (false||true));
		System.out.println("true \t" + "false \t" + (true||false));
		System.out.println("true \t" + "true \t" + (true||true));
		System.out.println("la tabla de valor de and \n" + "a \t" + "b \t" + "a or b \n" + "false \t" + "false \t" + (false&&false));
		System.out.println("false \t" + "true \t" + (false&&true));
		System.out.println("true \t" + "false \t" + (true&&false));
		System.out.println("true \t" + "true \t" + (true&&true));
		
	}

}
