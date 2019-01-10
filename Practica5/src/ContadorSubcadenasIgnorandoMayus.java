/**
 * Clase para probar un metodo que dice el numero de veces que se repite una
 * subcadena en una cadena de texto ignorando las mayusculas
 * 
 * @author Ignacio Belmonte 10 ene. 2019
 */
public class ContadorSubcadenasIgnorandoMayus {

	public static void main(String[] args) {
		System.out.println(obtenerNumeroVecesSubCadena2(
				"“Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días\".",
				"en"));
	}

	public static int obtenerNumeroVecesSubCadena2(String text, String subcadenaABuscar) {
		int numSubcadenasEncontradas = 0;
		StringBuilder textoAIndexar = new StringBuilder(text.toUpperCase());
		int punteroEnLaCadena = 0;
		while (true) {
			punteroEnLaCadena = textoAIndexar.indexOf(subcadenaABuscar.toUpperCase(), punteroEnLaCadena + 1);
			if (punteroEnLaCadena != -1) { // Cuando no se encuentran subcadenas el puntero se pone a -1
				numSubcadenasEncontradas++;
			} else {
				break;
			}
		}
		return numSubcadenasEncontradas;
	}
}
