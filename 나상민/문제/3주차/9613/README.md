# GCD 합

### 문제 이해하기
n쌍의 GCD의 합을 구하는 프로그램을 작성.
### 문제 접근 방법
배열이 주어진다면, 2중 for 문을 통해서 각각 구할 수 있는 gcd를 모두 구하면 된다.
### 구현 배경 지식
유클리드 알고리즘
### 문제를 해결한 방법
1. n만큼 반복하면서 gcd를 구하고 더한다.
```java
private static int gcd(int a, int b) {
        while(b > 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
```