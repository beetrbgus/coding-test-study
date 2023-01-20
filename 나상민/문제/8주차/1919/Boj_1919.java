import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Boj_1919 {

	private static int[] countAlphabet;
	private static String word1, word2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		countAlphabet = new int[26];
		word1 = br.readLine();
		word2 = br.readLine();

		int result = getAnagramCount(word1, word2);

		System.out.print(result);
	}

	private static int getAnagramCount(String word1, String word2) {
		int toBeRemovedCount = 0;
		for (int index = 0; index < word1.length(); index++) {
			++countAlphabet[word1.charAt(index) - 97];
		}

		for (int index = 0; index < word2.length(); index++) {
			--countAlphabet[word2.charAt(index) - 97];
		}

		for (int index = 0; index < countAlphabet.length; index++) {
			int count = Math.abs(countAlphabet[index]);
			toBeRemovedCount += count;
		}

		return toBeRemovedCount;
	}
}