import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

class Boj_10866 {

	private static int num;
	private static Deque deque;
	private static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		deque = new ArrayDeque();
		sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			switch (str) {
				case "push_front":
					num = Integer.parseInt(st.nextToken());
					deque.addFirst(num);
					break;
				case "push_back":
					num = Integer.parseInt(st.nextToken());
					deque.addLast(num);
					break;
				case "pop_front":
					if (deque.isEmpty()) {
						sb.append("-1").append("\n");
					} else {
						sb.append(deque.pollFirst()).append("\n");
					}
					break;
				case "pop_back":
					if (deque.isEmpty()) {
						sb.append("-1").append("\n");
					} else {
						sb.append(deque.pollLast()).append("\n");
					}
					break;
				case "size":
					sb.append(deque.size()).append("\n");
					break;
				case "empty":
					if (deque.isEmpty()) {
						sb.append("1").append("\n");
					} else {
						sb.append("0").append("\n");
					}
					break;
				case "front":
					if (deque.isEmpty()) {
						sb.append("-1").append("\n");
					} else {
						sb.append(deque.peekFirst()).append("\n");
					}
					break;
				case "back":
					if (deque.isEmpty()) {
						sb.append("-1").append("\n");
					} else {
						sb.append(deque.peekLast()).append("\n");
					}
					break;
			}
		}
		System.out.println(sb);
	}
}