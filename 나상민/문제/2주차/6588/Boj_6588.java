import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Boj_6588 {
    public static final int MAX = 100000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean prime[] = new boolean[MAX+1];
        prime[0] = prime[1] = true; // 소수는 false

        for (int i = 2; i < MAX; i++) {
            if (!prime[i]) {
                for (int j = i * 2; j < MAX; j += i) {
                    prime[j] = true;
                }
            }
        }

        int n = Integer.parseInt(br.readLine());

        while (n != 0) {
            boolean isProve = false;
            for (int i = 2; i <= n / 2; i++) {
                if (!prime[i] && !prime[n - i]) {
                    System.out.println(n + " = " + i + " + " + (n - i));
                    isProve = true;
                    break;
                }
            }

            if (!isProve) {
                System.out.println("Goldbach's conjecture is wrong.");
            }

            n = Integer.parseInt(br.readLine());

        }
    }
}