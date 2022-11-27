# 덱

### 문제 이해하기
deque의 8가지의 명령어(push_front,push_back,pop_front,pop_back,size,empty,front,back)를 받아서 처리하는 프로그램 만들기
### 문제 접근 방법
배열을 이용하여 deque(double end queue) 자료구조를 만들어야 한다.
### 구현 배경 지식
deque
### 해결하지 못한 이유 (적을게 있을 경우에만)


### 문제를 해결한 방법
- 배열을 '원형'이라고 생각하고 만약 맨 앞의 원소의 인덱스가 0일 때 push_front를 한다면 배열의 가장 마지막 인덱스를 가리키도록 한다.
- Deque 배열에서 front가 최종적으로 가리키는 위치는 항상 비워둔다. 즉, 가장 앞에있는 원소는 front + 1이 된다.
- 앞 쪽에 데이터를 추가할 때 음수가 되는 것을 방지하기 위해 다음과 같이 작성한다.
```
rear = (rear - 1 + array.length) % array.length;
```
- 뒤 쪽은 음수 방지가 필요 없기 때문에 다음과 같이 작성한다.
```
rear = (rear + 1) % array.length;
```