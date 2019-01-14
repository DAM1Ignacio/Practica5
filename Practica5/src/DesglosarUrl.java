/**
 * Class to test a method that separates urls
 * 
 * @author Ignacio Belmonte 14 ene. 2019
 */
public class DesglosarUrl {

	public static void main(String[] args) {
		String url = "http://www.devbg.org/forum/index.php";
		String urlSeparated[] = separarURL(url);
		for (int i = 0; i < urlSeparated.length; i++) {
			System.out.println(urlSeparated[i]);
		}
	}

	public static String[] separarURL(String url) {
		String[] separatedUrl = new String[3];
		separatedUrl[0] = getPotrocol(url);
		separatedUrl[1] = getServer(url);
		separatedUrl[2] = getResorce(url);
		return separatedUrl;
	}

	private static String getPotrocol(String url) {
		String[] urlSeparated = url.split(":");
		return urlSeparated[0];
	}

	private static String getServer(String url) {
		String[] urlSeparated = url.split("/");
		return urlSeparated[2];
	}

	private static String getResorce(String url) {
		StringBuilder resource = new StringBuilder();
		String[] urlSeparated = url.split("/");
		for (int i = 3; i < urlSeparated.length; i++) {
			resource.append("/");
			resource.append(urlSeparated[i]);
		}
		return resource.toString();
	}

}
