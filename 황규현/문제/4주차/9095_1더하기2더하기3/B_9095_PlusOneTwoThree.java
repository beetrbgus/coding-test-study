package BackJoon.dynamic_programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
 *
 * 1+1+1+1
 * 1+1+2
 * 1+2+1
 * 2+1+1
 * 2+2
 * 1+3
 * 3+1
 * 정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 *
 */
public class B_9095_PlusOneTwoThree {
    
    public static int solution(int input) {
        int[] sumArr = new int[12];
        sumArr[1] = 1;
        sumArr[2] = 2;
        sumArr[3] = 4;
        for (int i = 4; i <= input; i++) {
            sumArr[i] = sumArr[i-1] + sumArr[i-2] + sumArr[i-3];
        }
        return sumArr[input];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int solution = solution(Integer.parseInt(br.readLine()));
            System.out.println(solution);
        }
    }
}
