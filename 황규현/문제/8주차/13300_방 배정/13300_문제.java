package BackJoon.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_13300_AssignmentsRoom {
    /**
     * 학년 : 1 - 6학년 = 6개
     * 남자와 여자방 분리해야 하기 때문에 배열 따로 생성.
     * 입력받은 학생의 성별 정보로 계산
     * 딱 나누어 떨어질 때 해당 학년의 필요한 방 수 = 학생인원 / 방 인원
     * 딱 나누어 떨어지지 않을 때 해당 학년 필요한 방 수 = 학생인원 / 방 인원 + 1 (어차피 모자른 인원은 방 한개를 더 써야 함)
     *
     * 총 방 수이기 때문에 여자와 남자 필요 방수를 모두 더해준다.
     */
    static int gradeCount = 6;
    static int[] women = new int[gradeCount];
    static int[] men = new int[gradeCount];
    public static int solution(int K) {
        int room = 0;
        for (int i = 0; i < gradeCount; i++) {
            int womenRoom = women[i] % K == 0 ? women[i] / K : women[i] / K + 1;
            int menRoom = men[i] % K == 0 ? men[i] / K : men[i] / K + 1;
            room += womenRoom + menRoom;
        }
        return room;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        for (int i = 0; i < N; i++) {
            String[] student = br.readLine().split(" ");
            int gender = Integer.parseInt(student[0]);
            int grade = Integer.parseInt(student[1]);
            if(gender == 0) {
                women[grade - 1]++;
            }else if(gender == 1){
                men[grade - 1]++;
            }
        }
        System.out.println(solution(K));
    }
}