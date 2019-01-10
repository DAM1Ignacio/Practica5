/**
 * Class to test a method to convert the text between the tags to upper case.
 * 
 * @author Ignacio Belmonte 10 ene. 2019
 */
public class ConvertirAMayusculaSubcadena {
	private static final String TAG_OPEN_CONVERT_TO_UPPERCASE = "<mayus>";
	private static final String TAG_CLOSE_CONVERT_TO_UPPERCASE = "</mayus>";
	private static int searchStartPoint;

	public static void main(String[] Args) {
		String texto = "Estamos viviendo en un <mayus>submarino amarillo</mayus>. No tenemos <mayus>nada</mayus> qué hacer";
		System.out.println(PasarMayusculaSubCadena(texto));
	}

	private static String PasarMayusculaSubCadena(String text) {
		searchStartPoint = 0;
		StringBuilder finalText = new StringBuilder(text);
		while (true) {
			searchStartPoint = getStartPositionOfOpenTag(text);
			if (isContainsOpenAndCloseTag(text)) {
				finalText = new StringBuilder(); // reset finalText

				// add previous text of the open tag
				String textBeforeOpenTag = text.substring(0, searchStartPoint);
				finalText.append(textBeforeOpenTag);

				// add upper case text without tags
				String upperCaseText = text.substring(getEndPositionOfOpenTag(), getStartPositionOfCloseTag(text))
						.toUpperCase();
				finalText.append(upperCaseText);

				// add next text of the close tag
				String textAfterCloseTag = text.substring(getEndPositionOfCloseTag(text), text.length());
				finalText.append(textAfterCloseTag);

				// update text
				text = finalText.toString();

			} else {
				break;
			}
		}
		return finalText.toString();
	}

	private static int getStartPositionOfOpenTag(String textToSearch) {
		return textToSearch.indexOf(TAG_OPEN_CONVERT_TO_UPPERCASE, searchStartPoint);
	}

	private static int getStartPositionOfCloseTag(String textToSearch) {
		return textToSearch.indexOf(TAG_CLOSE_CONVERT_TO_UPPERCASE, searchStartPoint);
	}

	private static boolean isContainsOpenAndCloseTag(String text) {
		return getStartPositionOfOpenTag(text) != -1 && getStartPositionOfCloseTag(text) != -1;
	}

	private static int getEndPositionOfOpenTag() {
		return searchStartPoint + TAG_OPEN_CONVERT_TO_UPPERCASE.length();
	}

	private static int getEndPositionOfCloseTag(String text) {
		return text.indexOf(TAG_CLOSE_CONVERT_TO_UPPERCASE, searchStartPoint) + TAG_CLOSE_CONVERT_TO_UPPERCASE.length();
	}
}
