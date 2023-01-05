import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Boj_15649 {
    static int[] arr;
    static int n;
    static boolean[] isUsed;
    static int s;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        isUsed = new boolean[n + 1];
        arr = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            arr[i] = i;
        }
        nandm(0);
    }

    private static void nandm(int k) throws IOException {
        if (k == s) {
            for (int i = 1; i < k + 1; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i < n + 1; i++) {
            if (!isUsed[i]) {
                isUsed[i] = true;
                arr[k + 1] = i;
                nandm(k + 1);

                isUsed[i] = false;
            }
        }

    }

}