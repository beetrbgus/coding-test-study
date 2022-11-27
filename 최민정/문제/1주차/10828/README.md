### 문제 이해하기
파이썬으로 stack 구현하기

### 문제 접근 방법
list로 stack을 구현하기 위해서 push할 때 어디에 넣고, pop할 때 어떤 걸 뺄지 고민해보기

### 구현 배경 지식
list.append(tmp[i]) : tmp[i]를 list 마지막에 push한다.
list.pop() : list의 마지막 인덱스값을 pop한다.
len(list) : list의 갯수를 출력한다.
list[-1] : list의 마지막 인덱스값을 가리킨다.

### 해결하지 못한 이유
자꾸 시간초과가 떴다...

### 문제를 해결한 코드
import sys
input = sys.stdin.readline

### 문제를 해결한 방법
위의 두 줄을 넣어주면 빠른 입/출력이 가능해지므로 시간초과가 해결된다!