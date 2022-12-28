import java.io.*;

class Boj_9095 {
    static int num;
    static int[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(br.readLine());
            dp = new int[11];

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int j = 4; j <= num; j++) {
                dp[j] = dp[j - 1] + dp[j - 2] + dp[j - 3];
            }

            bw.write(dp[num] + "\n");
        }
        bw.flush();
    }
}