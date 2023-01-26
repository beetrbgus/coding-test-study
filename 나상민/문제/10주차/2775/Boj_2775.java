import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Boj_2775 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[][] APT = new int[15][15];

		//i층 1호, 0층 i호
		for (int i = 0; i < 15; i++) {
			APT[0][i] = i;
			APT[i][1] = 1;
		}

		// 아파트 인원 구하기
		for (int i = 1; i <= 14; i++) {
			for (int j = 2; j <= 14; j++) {
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			System.out.println(APT[k][n]);
		}
	}
}