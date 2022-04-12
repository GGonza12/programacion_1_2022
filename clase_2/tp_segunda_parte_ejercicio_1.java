package clase_2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_segunda_parte_ejercicio_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double radio,diametro_circulo,area_triangulo,base,altura,area_circulo;
		final double pi = 3.14;
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el radio para el circulo");
			radio = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese la base triangulo ");
			base = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese la altura del triangulo");
			altura = Double.valueOf(entrada.readLine());
			diametro_circulo = radio*2;
			area_triangulo = (base * altura) / 2;
			area_circulo = pi * (radio*radio);
			
			System.out.println("El area del circulo es: " + area_circulo);
			System.out.println("El diametro del circulo es: " + diametro_circulo + "\n" +  "El area del triangulo es: " + area_triangulo);		
			
		}
		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}
