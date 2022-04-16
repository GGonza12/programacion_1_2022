package clase_2;
/* Escribir un programa que declare tres variables de tipo double y
una constante de tipo double con valor 1.0 . Luego deberá
asignar el valor de la constante a una de la variables declaradas,
y posteriormente sobre las dos restantes variables se le deberá
asignar el valor de la variable que inicialmente fue seteada con el
valor de la constante. Finalmente imprima por pantalla cada una
de las variables. */
public class tp_primera_parte_ejercicio_2 {
	public static void main(String[] args) {
		double primer = 2.4;
		double segundo = 7.9;
		double tercero = 4.3;
		final double constante = 1.0;
		primer = constante;
		segundo = primer;
		tercero = primer;
		
		System.out.println("primer valor: " + primer);
		System.out.println("segundo valor: " + segundo);
		System.out.println("tercer valor: " + tercero);
		System.out.println("valor constante: " + constante);
		

	}

}
