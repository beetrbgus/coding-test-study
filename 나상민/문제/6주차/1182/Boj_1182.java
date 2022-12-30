import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Boj_1182 {
    static int[] arr;
    static int n;
    static int cnt;
    static int s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        backTrack(0, 0);

        //합이 0일 경우 공집합도 포함되므로 그 수를 하나 빼주고 출력
        System.out.print(s == 0? --cnt : cnt);
    }

    private static void backTrack(int k, int sum) {

        if (k == n) {
            if (sum == s) {
                cnt++;
            }
            return;
        }

        backTrack(k + 1, sum);
        backTrack(k + 1, sum + arr[k]);

    }
}
