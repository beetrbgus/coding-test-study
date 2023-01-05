# 부분수열의 합

### 문제 이해하기
N개의 정수로 이루어진 수열의 부분수열의 합이 S가 되는 경우의 수를 구하는 프로그램 작성

### 문제 접근 방법
1. 부분수열을 구하는 방법으로는 지금 위치의 원소를 선택하는 방법과 선택하지 않는 방법 2가지가 있다.
2. 따라서 backTrack를 호출할 때, 지금 원소를 합에 더하는 부분과 backTrack(v + 1, su + arr[v]) 지금 위치의 원소는 빼고 구하는 부분 backTrack(v + 1, su)을 구현한다.
3. for문이 없으므로 원소의 위치가 배열의 최대이면 지금까지 합이 원하는 값인지 아닌지 확인한 후, 맞으면 카운트 변수 cnt를 증가시키고 종료한다.
4. 합이 0일 경우 공집합도 포함되므로 그 수를 하나 빼주고 출력한다.

### 구현 배경 지식
백트래킹, 재귀

### 문제를 해결한 방법
```java
private static void backTrack(int k, int sum) {

        if (k == n) {
            if (sum == s) {
                cnt++;
            }
        return;
        }

        backTrack(k + 1, sum); //해당 인덱스를 안 더함
        backTrack(k + 1, sum + arr[k]); //해당 인덱스를 더함

}
```
5 0
-7 -3 -2 5 8

k = 0
backTrack(1, 0);
backTrack(1, -7);

k = 1
backTrack(2, 0);
backTrack(2, -3);

backTrack(2, -7);
backTrack(2, -10);

k = 2
backTrack(3, 0);
backTrack(3, -2);

backTrack(3, -3);
backTrack(3, -5);

backTrack(3, -7);
backTrack(3, -9);

backTrack(3, -10);
backTrack(3, -12);

k = 3
backTrack(4, 0);
backTrack(4, 5);

backTrack(4, -2);
backTrack(4, 3);

backTrack(4, -3);
backTrack(4, 2);

backTrack(4, -5);
backTrack(4, 0);

backTrack(4, -7);
backTrack(4, -2);

backTrack(4, -9);
backTrack(4, -4);

backTrack(4, -10);
backTrack(4, -7);

k = 4
backTrack(5, 0);
backTrack(5, 8);

backTrack(5, 5);  o
backTrack(5, 13);

backTrack(5, -2);
backTrack(5, 6);

backTrack(5, 3);
backTrack(5, 11);

backTrack(5, -3);
backTrack(5, 5);  o

backTrack(5, 2);
backTrack(5, 10);

backTrack(5, -5);
backTrack(5, 3);

backTrack(5, 0);
backTrack(5, 8);

backTrack(5, -7);
backTrack(5, 1);

backTrack(5, -2);
backTrack(5, 6);

backTrack(5, -9);
backTrack(5, -1);

backTrack(5, -4);
backTrack(5, 4);

backTrack(5, -10);
backTrack(5,-2);

backTrack(5, -7);
backTrack(5, 1);