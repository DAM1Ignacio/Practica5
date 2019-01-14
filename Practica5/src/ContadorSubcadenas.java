/**
 * Clase para probar un metodo que dice el numero de veces que se repite una
 * subcadena en una cadena de texto
 * 
 * @author Ignacio Belmonte 10 ene. 2019
 */
public class ContadorSubcadenas {

	public static void main(String[] args) {
		System.out.println(obtenerNumeroVecesSubCadena(
				"“Estamos viviendo en un submarino amarillo. No tenemos nada que hacer. En el interior del submarino se está muy apretado. Así que estamos leyendo todo el día. Vamos a salir en 5 días\".",
				"en"));
	}

	public static int obtenerNumeroVecesSubCadena(String text, String subcadenaABuscar) {
		int numSubcadenasEncontradas = 0;
		StringBuilder textoAIndexar = new StringBuilder(text);
		int punteroEnLaCadena = 0;
		while (true) {
			punteroEnLaCadena = textoAIndexar.indexOf(subcadenaABuscar, punteroEnLaCadena + 1);
			if (punteroEnLaCadena != -1) { // Cuando no se encuentran subcadenas el puntero se pone a -1
				numSubcadenasEncontradas++;
			} else {
				break;
			}
		}
		return numSubcadenasEncontradas;
	}
}
