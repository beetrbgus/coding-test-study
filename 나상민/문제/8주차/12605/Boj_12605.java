import java.io.*;

class Boj_12605 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String[] strArr = str.split(" ");
            String result = "";
            for (int j = strArr.length - 1; j >= 0; j--) {
                result += strArr[j]+ " ";
            }
            sb.append("Case #" + (i+1) + ": " +result+'\n');
        }
        System.out.println(sb);
    }
}