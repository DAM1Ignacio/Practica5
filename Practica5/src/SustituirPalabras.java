
public class SustituirPalabras {

	public static void main(String[] args) {
		String text = "Oracle ha anunciado hoy su nueva generación de compilador Java hoy. Utiliza analizador avanzado y optimizador especial para la JVM de Oracle";
		String wordsToRemplace = "JVM,Java,Oracle";
		
		System.out.println(reemplazaPalabras(text, wordsToRemplace));

	}

	public static String reemplazaPalabras(String text, String wordsToRemplace) {
		StringBuilder finalText = new StringBuilder(text);
		String[] wordToRemplace = wordsToRemplace.split(",");

		for (int i = 0; i < wordToRemplace.length; i++) {
			
			int startWordPosition = 0;
			startWordPosition = text.indexOf(wordToRemplace[i], startWordPosition);

			while (true) {
				if (startWordPosition != -1) {
					int endWordPosition = startWordPosition + wordToRemplace[i].length();
					String wordRemplace = createWordRemplace(wordToRemplace[i].length());
					finalText.replace(startWordPosition, endWordPosition, wordRemplace);
					startWordPosition = text.indexOf(wordToRemplace[i], startWordPosition +1);
				}else {
					break;
				}
			}
		}
		return finalText.toString();
	}

	private static String createWordRemplace(int length) {
		StringBuilder wordReplace = new StringBuilder();
		for ( int i = 0 ; i< length; i++) {
			wordReplace.append("*");
		}
		return wordReplace.toString();
	}

}
