import java.io.*;
import java.util.*;

// baekjoon_1182

public class Main{

    // N개의 정수로 이루어진 수열이 있을 때,
    // 크기가 양수인 부분수열 중에서 그 수열의 원소를 다 더한 값이 S가 되는 경우의 수를 구하는 프로그램을 작성하시오.

    private static int cnt;
    private static int targetNum;
    private static int arrLength;
    private static int[] arr;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        arrLength = Integer.parseInt(st.nextToken());
        targetNum = Integer.parseInt(st.nextToken());

        arr = new int[arrLength];

        st = new StringTokenizer(br.readLine());

        for(int i = 0 ; i<arrLength ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dfs(0,0);

        if (targetNum==0){
            bw.write(cnt-1+"");
        }
        else {
            bw.write(cnt + "");
        }

        bw.flush();
        br.close();
        bw.close();
    }

    public static void dfs(int index, int sum){
        if (index == arrLength){
            if (sum == targetNum){
                cnt++;
            }
            return;
        }
        dfs(index+1, sum+arr[index]);
        dfs(index+1, sum);
    }

}