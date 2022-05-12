package clase_6;
/*Siguiendo la Clase 4 Ejercicio 4, hacer un programa completo (usando
m�todos donde se requiera) en el cual se solicite de teclado el ingreso de
un d�a, un n�mero de mes, y un a�o; luego calcule la cantidad de d�as
desde la �ltima luna nueva (edad lunar), e informe por pantalla en cual de
las 4 fases se corresponde para esa fecha. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class clase_6_tp_cuarta_parte_ejercicio_12 {

	public static void main(String[] args) {
		int dia,mes,anio;
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Ingrese el dia");
			dia = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el mes");
			mes = Integer.valueOf(entrada.readLine());
			System.out.println("Ingrese el a�o");
			anio = Integer.valueOf(entrada.readLine());
			fase_lunar(dia,mes,anio);
		}
		catch(Exception exc) {
			System.out.println(exc);
		}
	}
	public static void fase_lunar(int dia,int mes,int anio) {
		int aureo,epacta,meses,pasaron,fase;
		aureo = (anio+1)%19;
		epacta = (((aureo-1)*11) % 30);
		meses = (((mes-3)+1)%12);
		pasaron = ((dia+epacta+meses)%28);
		fase = (pasaron/7);
		System.out.println("aureo: "+aureo);
		System.out.println("epacta: "+epacta);
		System.out.println("meses: "+meses);
		System.out.println("pasaron: "+pasaron);
		System.out.println("fase: "+fase);
		if (fase == 0) {
			System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + fase  +  " desde la ultima luna nueva, por lo que la luna ser� luna nueva");
		}
		if (fase == 1) {
			System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + fase  +  " desde la ultima luna nueva, por lo que la luna ser� luna creciente");
		}
		if (fase == 2) {
			System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + fase  +  " desde la ultima luna nueva, por lo que la luna ser� luna llena");
		}
		if (fase == 3) {
			System.out.println("El " + dia + " de " + mes + " de " + anio + " habran pasado " + fase  +  " desde la ultima luna nueva, por lo que la luna ser� luna megnuante");
		}
	}

}
