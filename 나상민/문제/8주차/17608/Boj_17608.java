import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Boj_17608 {

    private static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        stack = new Stack<>();
        int count = 1;

        for (int i = 0; i < N; i++) {
            stack.push(Integer.parseInt(br.readLine()));
        }

        int firstStack = stack.pop();

        while (!stack.empty()) {
            if (firstStack < stack.pop()) {
                count++;
            }
        }

        System.out.println(count);
    }
}