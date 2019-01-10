/**
 * Clase para probar un metodo que comprueba que los parentesis sean correctos
 * 
 * @author Ignacio Belmonte 10 ene. 2019
 */
public class ComprobarParentesis {

	public static void main(String[] args) {
		System.out.println(parentesisCorrectos("(()"));
	}

	public static boolean parentesisCorrectos(String expresionMatematica) {
		int parentesisAbiertos = 0;
		for (int i = 0; i < expresionMatematica.length(); i++) {
			if (esParentesisAbierto(expresionMatematica.charAt(i))) {
				parentesisAbiertos++;
			}
			if (esParentesisCerrado(expresionMatematica.charAt(i))) {
				parentesisAbiertos--;
			}
		}
		return parentesisAbiertos == 0;
	}

	public static boolean esParentesisAbierto(char Character) {
		return Character == '(';
	}

	public static boolean esParentesisCerrado(char Character) {
		return Character == ')';
	}
}
