public class convertirAMayusculaSubcadena {
	private static final String TAG_OPEN_CAPS = "<mayus>";
	private static final String TAG_CLOSE_CAPS = "</mayus>";

	public static void main(String[] Args) {
		String texto = "Estamos viviendo en un <mayus>sub0marino amarillo</mayus>.   No tenemos <mayus>nada</mayus> qué hacer";
		System.out.println(PasarMayusculaSubCadena(texto));
	}

	private static String PasarMayusculaSubCadena(String text) {
		int searchStartPoint = 0;
		StringBuilder textoFinal = new StringBuilder(text);
		int i = 0;
		while (true) {
			searchStartPoint = getStartOfOpenTag(searchStartPoint, text);
			
			if (isContainsTagToOpenCapsAndCloseCaps(text, searchStartPoint)) {

				textoFinal = new StringBuilder();
				String textAfterTag = text.substring(0, searchStartPoint);
				textoFinal.append(textAfterTag);

				String textUpperCase = text.substring(getEndOfOpenCaps(searchStartPoint),
						text.indexOf(TAG_CLOSE_CAPS, searchStartPoint ));

				textoFinal.append(textUpperCase.toUpperCase());
				textoFinal.append(text.substring(
						text.indexOf(TAG_CLOSE_CAPS, searchStartPoint ) + TAG_CLOSE_CAPS.length(), text.length()));
				text = textoFinal.toString();
			} else {
				break;
			}
		}
		return textoFinal.toString();
	}

	private static int getStartOfOpenTag(int searchStartPoint, String textToSearch) {
		return textToSearch.indexOf(TAG_OPEN_CAPS, searchStartPoint);
	}

	private static int getStartOfCloseTag(int searchStartPoint, String textToSearch) {
		return textToSearch.indexOf(TAG_CLOSE_CAPS, searchStartPoint );
	}

	private static boolean isContainsTagToOpenCapsAndCloseCaps(String text, int searchStartPoint) {
		return getStartOfOpenTag(searchStartPoint, text) != -1 && getStartOfCloseTag(searchStartPoint, text) != -1;
	}

	private static int getEndOfOpenCaps(int searchStartPoint) {
		return searchStartPoint + TAG_OPEN_CAPS.length();
	}

}
