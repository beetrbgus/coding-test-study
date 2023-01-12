package BackJoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_12605_ReverseWord {
    private static void solution(int index, String[] input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length; i++) {
            sb.append(input[input.length - (1 + i)]);
            if(i == input.length - 1) break;
            sb.append(" ");
        }
        System.out.println("Case #"+ index + ": " + sb.toString());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N; i++) {
            String[] input= br.readLine().split(" ");
            solution(i, input);
        }
        br.close();
    }
}
