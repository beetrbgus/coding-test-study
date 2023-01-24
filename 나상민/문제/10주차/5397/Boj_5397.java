import java.io.*;
import java.util.Stack;

class Boj_5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            Stack<Character> leftStack = new Stack<>();
            Stack<Character> rightStack = new Stack<>();

            for (char ch : str.toCharArray()) {
                switch (ch) {
                    case '<':
                        if (!leftStack.isEmpty()) {
                            rightStack.push(leftStack.pop());
                        }
                        break;
                    case '>':
                        if (!rightStack.isEmpty()) {
                            leftStack.push(rightStack.pop());
                        }
                        break;
                    case '-':
                        if (!leftStack.isEmpty()) {
                            leftStack.pop();
                        }
                        break;
                    default:
                        leftStack.push(ch);
                        break;
                }
            }

            while (!leftStack.isEmpty()) {
                rightStack.push(leftStack.pop());
            }

            while (!rightStack.isEmpty()) {
                bw.write(rightStack.pop());
            }
            bw.write('\n');
        }

        bw.flush();
        bw.close();
    }
}