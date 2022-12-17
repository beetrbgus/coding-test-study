import java.io.*;
import java.util.*;

import static java.lang.Character.getNumericValue;
// baekjoon_1212

public class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String st = br.readLine();

        for (int i = 0; i<st.length(); i++){
            char c = st.charAt(i);
            int eightNum = Character.getNumericValue(c);
            String s = Integer.toBinaryString(eightNum);

            if (s.length()==3){
                sb.append(s);
            }
            else if(s.length()==2 && i!=0){
                sb.append("0"+s);
            }
            else if(s.length()==1 && i!=0){
                sb.append("00"+s);
            }
            else {
                sb.append(s);
            }

        }

        bw.write(sb.toString());

        bw.flush();
        br.close();
        bw.close();
    }
}