import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Boj_13300 {

	private static int N, K, count;
	private static int[][] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[7][2];
		count = 0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int sex = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());
			arr[grade][sex]++;
		}

		//여학생 탐색
		for (int i = 1; i < 7; i++) {
			if (arr[i][0] == 0) {
				continue;
			} else if (arr[i][0] <= K) {
				count++;
			} else if (arr[i][0] % K == 0) {
				count += arr[i][0] / K;
			} else {
				count += arr[i][0] / K;
				count++;
			}
		}

		//남학생 탐색
		for (int i = 1; i < 7; i++) {
			if (arr[i][1] == 0) {
				continue;
			} else if (arr[i][1] <= K) {
				count++;
			} else if (arr[i][1] % K == 0) {
				count += arr[i][1] / K;
			} else {
				count += arr[i][1] / K;
				count++;
			}
		}
		System.out.println(count);
	}

}