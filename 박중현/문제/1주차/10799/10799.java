import java.io.*;
import java.util.*;

// baekjoon_10799

public class 10799{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        // 스트링을 변환하여 char 배열 생성
        char[] a =str.toCharArray();

        // line 개수
        int line = 0;
        // 가지 개수
        int branch = 0;
        // 직전 문자
        char prevChar = ' ';

        for(int i =0; i<a.length; i++){
            // (( -> 라인 개수 : +1 , 가지 개수 : +1
            if(a[i] == '('){
                if(prevChar == '('){
                    line++;
                    branch++;
                }
            }
            // )( -> 브랜치 개수 = 브랜치 개수 + 라인 개수
            // )) -> 라인 개수 줄어든다
            else if(a[i] == ')'){
                if(prevChar == '('){
                    branch = branch + line;
                }
                else if(prevChar == ')'){
                    line-- ;
                }

            }
            // 직전 문자를 저장
            prevChar = a[i];

        }

        bw.write(branch+ "");

        bw.flush();
        br.close();
        bw.close();
    }
}