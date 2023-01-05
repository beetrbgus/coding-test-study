import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/***
 * 삽입정렬
 */

class Boj_2752_4 {

	private static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[3];
		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (temp < arr[j])
					arr[j + 1] = arr[j];
				else break;
			}
			arr[j + 1] = temp;
		}

		for (int str : arr) {
			System.out.print(str + " ");
		}
	}
}