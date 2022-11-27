import java.io.*;
import java.util.*;

// baekjoon_17413

public class 17413{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a;
        // 태그 안 문자인지 태그 밖 문자인지 구분하기 위한 boolean 변수
        boolean tagOn = false;
        Stack<Character> stacks = new Stack<>();
        Queue<Character> queues = new LinkedList<>();
        a = br.readLine();

        for(int i = 0; i<a.length(); i++){
            if(a.charAt(i)=='<'){
                while(!stacks.empty()){
                    bw.write(stacks.pop());
                }
                queues.add(a.charAt(i));
                tagOn = true;
            }
            else if(a.charAt(i)=='>'){
                queues.add(a.charAt(i));
                while(!queues.isEmpty()){
                    bw.write(queues.poll());
                }
                tagOn = false;
            }

            else if(tagOn == true){
                queues.add(a.charAt(i));
            }
            else if(tagOn == false){
                if (a.charAt(i)==' '){
                    while (!stacks.empty()){
                        bw.write(stacks.pop());
                    }
                    bw.write(a.charAt(i));
                }
                else {
                    stacks.push(a.charAt(i));
                    if (i==a.length()-1){
                        while (!stacks.empty()){
                            bw.write(stacks.pop());
                        }
                    }
                }
            }
        }

        stacks.clear();

        bw.flush();
        br.close();
        bw.close();
    }
}