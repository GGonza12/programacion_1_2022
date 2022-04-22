package clase_4;
/* Se pide: hacer un programa completo en el cual se solicite de teclado el
ingreso de un día, un número de mes, y un año; luego calcule la cantidad
de días desde la última luna nueva (edad lunar), e informe por pantalla en
cual de las 4 fases se corresponde para esa fecha (ver cálculo en ejercicios
resueltos p4e4.xlsx). */

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_4_tp_segunda_parte_ejercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dia,mes,anio,aureo,epacta,meses,pasaron,fase;
		
		try {
			BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Ingrese el dia");
			dia = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el mes");
			mes = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el año");
			anio = Integer.valueOf(entrada.readLine());
			aureo = (anio+1)%19;
			epacta = (((aureo-1)*11)%30);
			meses = (((mes-3)+1)%12);
			pasaron = ((dia-epacta)+meses);
			fase = (pasaron/7);
			System.out.println(aureo);
			System.out.println(epacta);
			System.out.println(meses);
			System.out.println(pasaron);
			System.out.println(fase);
			
			if (fase == 0) {
				System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + fase  +  " desde la ultima luna nueva, por lo que la luna será luna nueva");
			}
			if (fase == 1) {
				System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + fase  +  " desde la ultima luna nueva, por lo que la luna será luna creciente");
			}
			if (fase == 2) {
				System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + fase  +  " desde la ultima luna nueva, por lo que la luna será luna llena");
			}
			if (fase == 3) {
				System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + fase  +  " desde la ultima luna nueva, por lo que la luna será luna megnuante");
			}
			
			
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}

}
