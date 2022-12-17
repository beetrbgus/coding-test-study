import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_9613_SumGCD {

    public static void solution (String[] input) {
        Long result = 0L;
        for (int i = 1; i < input.length; i++) {
            int first = Integer.parseInt(input[i]);

            for (int j = i + 1; j < input.length; j++) {
                int second = Integer.parseInt(input[j]);
                result += gcd(first, second);
            }
        }
        System.out.println(result);
    }
    private static int gcd(int first, int second) {
        if(second == 0) return first;
        return gcd(second, first % second);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int octal = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < octal; i++) {
            String[] input = bufferedReader.readLine().split(" ");
            solution(input);
        }
    }
}