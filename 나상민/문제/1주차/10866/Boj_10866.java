import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Boj_10866 {
	public static int[] deck = new int[10000];
	public static int first = 0;
	public static int last = 0;
	public static int size = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int N = Integer.parseInt(br.readLine());
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			switch (st.nextToken()) {
				case "push_front":
					push_front(Integer.parseInt(st.nextToken()));
					break;
				case "push_back":
					push_back(Integer.parseInt(st.nextToken()));
					break;
				case "pop_front":
					System.out.println(pop_front());
					break;
				case "pop_back":
					System.out.println(pop_back());
					break;
				case "size":
					System.out.println(size());
					break;
				case "empty":
					System.out.println(empty());
					break;
				case "front":
					System.out.println(front());
					break;
				case "back":
					System.out.println(back());
					break;
			}

		}

	}

	//정수 X를 덱의 앞에 넣는다.
	public static void push_front(int item) {
		deck[first] = item;
		first = (first - 1 + 10000) % 10000;
		size++;
	}

	//정수 X를 덱의 뒤에 넣는다.
	public static void push_back (int item) {
		last = (last + 1) % 10000;
		size++;
		deck[last] = item;
	}

	//덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int pop_front() {
		if (size == 0) {
			return -1;
		} else {
			int res = deck[(first + 1) % 10000];
			first = (first + 1) % 10000;
			size--;
			return res;
		}
	}

	//덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int pop_back() {
		if (size == 0) {
			return -1;
		} else {
			int res = deck[last];
			last = (last - 1 + 10000) % 10000;
			size--;
			return res;
		}
	}

	//덱에 들어있는 정수의 개수를 출력한다.
	public static int size() {
		return size;
	}

	//덱이 비어있으면 1을, 아니면 0을 출력한다.
	public static int empty() {
		if (size == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	//덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int front() {
		if (size == 0) {
			return -1;
		} else {
			return deck[(first + 1) % 10000];
		}
	}

	//덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
	public static int back() {
		if (size == 0) {
			return -1;
		} else {
			return deck[last];
		}
	}
}