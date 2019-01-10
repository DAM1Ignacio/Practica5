/**
 * Clase para probar un metodo que invierte el texto
 * 
 * @author Ignacio Belmonte 10 ene. 2019
 */
public class VoltearTexto {

	public static void main(String[] args) {
		System.out.println(invertirTexto("Hola "));
	}

	public static String invertirTexto(String textoAInvertir) {
		StringBuilder textoInvertido = new StringBuilder();
		for (int i = textoAInvertir.length() - 1; i >= 0; i--) {
			textoInvertido.append(textoAInvertir.charAt(i));
		}
		return textoInvertido.toString();
	}
}
