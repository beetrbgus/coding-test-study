import java.io.*;
import java.util.*;

// baekjoon_10828

public class 10828{
    public static void main(String[] args) throws Exception{
        // 인풋 처리하는 BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 아웃풋 처리하는 BufferedWriter
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // 인풋의 띄어쓰기에 따라 String 분리를 위한 StringTokenizer
        StringTokenizer st;

        // 입력되는 줄의 개수
        int n = Integer.parseInt(br.readLine());
        String a;
        int b;
        // Integer 타입을 가지는 스택 선언
        Stack<Integer> stacks = new Stack<>();

        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            a = st.nextToken();
            if(a.equals("push")){
                b = Integer.parseInt(st.nextToken());
                stacks.push(b);
            }
            else if(a.equals("pop")){
                if(stacks.empty()){
                    bw.write(-1+"\n");
                }
                else{
                    int temp = stacks.peek();
                    stacks.pop();
                    bw.write(temp+"\n");
                }

            }
            else if(a.equals("size")){
                int temp = stacks.size();
                bw.write(temp+"\n");
            }
            else if(a.equals("empty")){
                boolean temp =stacks.empty();
                if(temp==true){
                    bw.write(1+"\n");
                }
                else{
                    bw.write(0+"\n");
                }
            }
            else if(a.equals("top")){
                if(stacks.empty()){
                    bw.write(-1+"\n");
                }
                else{
                    bw.write(stacks.peek()+"\n");
                }
            }

        }
        bw.flush();
        br.close();
        bw.close();
    }
}