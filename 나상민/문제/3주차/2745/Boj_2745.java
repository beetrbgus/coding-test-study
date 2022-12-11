import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Boj_2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        long result = 0;
        int idx = 0;
        int num = 0;
        for (int i = n.length()-1; i >= 0; i--) {
            char c = n.charAt(i);
            if (c>='0' && c<='9')
                num = c - '0';//0~9 사이는 그대로 출력
            else
                num = c - 55;//A~Z는 숫자로 변경
            result += num * Math.pow(b, idx++);
        }
        System.out.println(result);
    }
}