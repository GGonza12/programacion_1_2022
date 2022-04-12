package clase_2;

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
