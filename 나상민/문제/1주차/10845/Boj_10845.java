import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Boj_10845 {
    public static int[] queue = new int[10001];
    public static int first = 0;
    public static int last = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push":
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(pop());
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

    //정수 X를 큐에 넣는 연산이다.
    public static void push(int item) {
        queue[last] = item;
        last++;
    }

    //큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static int pop() {
        if (last - first == 0) {
            return -1;
        } else {
            int res = queue[first];
            first++;
            return res;
        }
    }

    //큐에 들어있는 정수의 개수를 출력한다.
    public static int size() {
        return last - first;
    }

    //큐가 비어있으면 1, 아니면 0을 출력한다.
    public static int empty() {
        if (last - first == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    //큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static int front() {
        if (last - first == 0) {
            return -1;
        } else {
            return queue[first];
        }
    }

    //큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static int back() {
        if (last - first == 0) {
            return -1;
        } else {
            return queue[last - 1];
        }
    }
}