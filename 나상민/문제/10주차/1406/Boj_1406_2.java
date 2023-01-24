import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

//Stack + bufferedwriter를 이용하여 시간초과 문제 해결
class Boj_1406_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());

        Stack<Character> leftSt = new Stack<>();
        Stack<Character> rightSt = new Stack<>();

        for(char s : str.toCharArray()) {
            leftSt.push(s);
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);
            switch(c) {
                case 'L':
                    if(!leftSt.isEmpty())
                        rightSt.push(leftSt.pop());

                    break;
                case 'D':
                    if(!rightSt.isEmpty())
                        leftSt.push(rightSt.pop());

                    break;
                case 'B':
                    if(!leftSt.isEmpty()) {
                        leftSt.pop();
                    }
                    break;
                case 'P':
                    leftSt.push(st.nextToken().charAt(0));
                    break;
                default:
                    break;
            }
        }
        while(!leftSt.isEmpty())
            rightSt.push(leftSt.pop());

        while(!rightSt.isEmpty())
            bw.write(rightSt.pop());

        bw.flush();
        bw.close();
    }
}