package clase_2;
/* Escribir un programa que solicite y luego muestre por consola los valores
necesarios para dibujar un círculo y un triángulo. Hay que determinar en cada
caso que constantes (que no se cargan por consola) y variables con tipos son
necesarias declarar. */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class tp_segunda_parte_ejercicio_1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi = 3.14;
		final int rectangulo=90;
		int angulo,angulo_faltante;
		double radio,diametro_circulo,area_triangulo,base,altura,area_circulo;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el radio para el circulo");
			radio = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese la base triangulo ");
			base = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese la altura del triangulo");
			altura = Double.valueOf(entrada.readLine());
			System.out.println("Ingrese angulo del triangulo rectangulo");
			angulo = Integer.valueOf(entrada.readLine());
			diametro_circulo = radio*2;
			area_triangulo = (base * altura) / 2;
			area_circulo = pi * (radio*radio);
			angulo_faltante = (180 - rectangulo - angulo);
			System.out.println("El area del circulo es: " + area_circulo);
			System.out.println("El diametro del circulo es: " + diametro_circulo + "\n" +  "El area del triangulo es: " + area_triangulo + " y el angulo faltante es: " + angulo_faltante);		
			
		}
		catch (Exception exc) {
			System.out.println(exc);
		}

	}

}
