import java.io.*;
import java.util.Stack;

class Boj_12605_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] strArr = str.split(" ");
            String result = "";
            Stack<String> stack = new Stack<>();
            for (int j = 0; j < strArr.length; j++) {
                stack.push(strArr[j]);
            }
            for (int j = 0; j < strArr.length; j++) {
                result += stack.pop() + " ";
            }
            sb.append("Case #" + (i+1) + ": " +result+'\n');
        }
        System.out.println(sb);
    }
}