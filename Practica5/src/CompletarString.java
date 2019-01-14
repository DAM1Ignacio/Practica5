/**
 * Class to try a method that completes a String with characters 
 * @author Ignacio Belmonte
 * 14 ene. 2019
 */
public class CompletarString {

	public static void main(String[] args) {
		System.out.println(padRight("Introducción", '*', 20));
		
	}
	
	public static String padRight(String text, char characterToAdd, int finalNumOfCharacters ) {
		if(text.length()<finalNumOfCharacters) {
			int numCharactersToAdd = finalNumOfCharacters - text.length();
			return addCharactersRight(text,characterToAdd,numCharactersToAdd);
		}
		return text;
	}

	private static String addCharactersRight(String text, char characterToAdd, int numCharactersToAdd) {
		StringBuilder finalText = new StringBuilder(text);
		for (int i = 0; i < numCharactersToAdd; i++) {
			finalText.append(characterToAdd);
		}
		return finalText.toString();
	}

}
