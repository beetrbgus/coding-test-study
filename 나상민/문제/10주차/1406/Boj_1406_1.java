import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

//시간 초과 - linkedList 사용
class Boj_1406_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Character> result = new LinkedList<>();
        String str = br.readLine();
        for (char c : str.toCharArray()) {
            result.add(c);
        }

        int N = Integer.parseInt(br.readLine());
        int cursor = result.size()-1;
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            switch (st.nextToken()) {
                case "L":
                    if (cursor > 0) {
                        cursor--;
                    }
                    break;
                case "D":
                    if (cursor < result.size()) {
                        cursor++;
                    }
                    break;
                case "B":
                    if (cursor > 1) {
                        result.remove(cursor - 1);
                    }
                    break;
                case "P":
                    cursor++;
                    result.add(cursor, st.nextToken().charAt(0));
                    break;
            }
        }
        System.out.println(result);
    }
}