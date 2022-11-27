import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class Boj_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> stack = new Stack<>();

        boolean isIncluded = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '<') {
                isIncluded = true;
                while (!stack.isEmpty()) {
                    System.out.print(stack.pop());
                }
                System.out.print(input.charAt(i));
            } else if (input.charAt(i) == '>') {
                isIncluded = false;
                System.out.print(input.charAt(i));
            } else if (isIncluded) {
                System.out.print(input.charAt(i));
            } else if (!isIncluded) {
                if (input.charAt(i) == ' ') {
                    while (!stack.isEmpty()) {
                        System.out.print(stack.pop());
                    }
                    System.out.print(input.charAt(i));
                } else {
                    stack.push(input.charAt(i));
                }
            }
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}