package clase_4;
/* Hacer un programa que solicite la carga desde consola de
un carácter y realice: imprima si es dígito, o letra minúscula, o
es cualquier otro carácter. Si es letra minúscula indicar si es
vocal o consonante. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_4_tp_segunda_parte_ejercicio_2 {

	public static void main(String[] args) {

		char caracter;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese un caracter");
			caracter = entrada.readLine().charAt(0);
				if ((caracter>='0')&&(caracter<='9')) {
					System.out.println("Es caracter digito.");
				}
				else if ((caracter>='a')&&(caracter<='z')) {
					switch (caracter) {
						case 'a': {
							System.out.println("Es vocal " + caracter);
							break;
						}
						case 'e': {
							System.out.println("Es vocal " + caracter);
							break;
						}
						case 'i': {
							System.out.println("Es vocal " + caracter);
							break;
						}
						case 'o': {
							System.out.println("Es vocal " + caracter);
							break;
						}
						case 'u': {
							System.out.println("Es vocal " + caracter);
							break;
						}
						default : {
							System.out.println("Es consonante.");
						}
					}
					System.out.println("Es caracter minuscula.");
				}
			else if ((caracter>='A')&&(caracter<='Z')) {
				System.out.println("Es caracter letra mayuscula.");
			}
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
		
	}

}
