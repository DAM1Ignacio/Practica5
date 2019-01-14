/**
 * Class to test a method that encrypt and decrypt a String whit a password
 * 
 * @author Ignacio Belmonte 14 ene. 2019
 */
public class EncriptarPalabras {

	public static void main(String[] args) {
		String text = "bella ciao";
		String password = "italy";
		String encryptedWord = encriptar(text, password); // encrypt
		System.out.println(encryptedWord);
		System.out.println(encriptar(encryptedWord, password)); // decrypt
	}

	public static String encriptar(String text, String password) {
		StringBuilder encryptedWord = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			encryptedWord.append((char) (text.charAt(i) ^ password.charAt(i % password.length())));
		}
		return encryptedWord.toString();
	}

}
