import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B_17608_Stick {
    /**
     * 방법 1 - 배열 사용
     * 오른쪽에서 보이기 때문에 배열의 마지막 부터 탐색
     * 현재까지의 최고 막대기 크기와 같거나 작으면 안보임
     * 현재최고 크기의 막대기 보다 큰 블럭이 나오면
     * visibleBlock에 ++ 한 후
     * 가장 큰 블록을 현재 크기로 변경
     *
     */
    static int solution(int[] arr) {
        int visibleBlock = 0;
        int recentTallerBlock = 0;
        for (int i = arr.length - 1 ; i >= 0; i--) {
            if(recentTallerBlock < arr[i]) {
                visibleBlock++;
                recentTallerBlock = arr[i];
            }
        }
        return visibleBlock;
    }

    /**
     * 방법2 - Stack 사용
     * 문제 분류에 Stack이라 써있어서 Stack을 사용해 보았는데,
     * 배열로 푸는 것보다 복잡해서 비효율적인 것 같다.
     * 원리는 방법 1과 동일
     * @param arr
     * @return
     */
    static int solution2(int[] arr) {
        Stack<Integer> recentTallerBlock = new Stack<>();
        int visibleBlock = 0;

        for (int i = arr.length - 1 ; i >= 0; i--) {
            if(recentTallerBlock.isEmpty() || recentTallerBlock.peek() < arr[i]) {
                recentTallerBlock.push(arr[i]);
                visibleBlock++;
            }
        }
        return visibleBlock;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        System.out.println(solution2(arr));
    }
}