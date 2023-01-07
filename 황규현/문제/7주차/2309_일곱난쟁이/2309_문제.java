package BackJoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B_2309_SevenDwarf {
    static int[] heights = new int[9];
    static int expect = 100;
    static int heightSum = 0;

    public static void solution() {
        boolean isFindResult = false;
        Arrays.sort(heights);
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if(heightSum - (heights[i] + heights[j]) == expect) {
                    heights[i] = 0;
                    heights[j] = 0;
                    isFindResult = true;
                    break;
                }
            }
            if(isFindResult) break;
        }

        for (int i = 0; i < heights.length; i++) {
            if(heights[i] != 0) {
                System.out.println(heights[i]);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            heightSum += heights[i];
        }
        solution();
    }
}
