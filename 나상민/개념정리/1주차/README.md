## 📍 1주차 개념 정리

### Stack
- Stack의 특징
  1. 먼저 들어간 자료가 나중에 나옴 LIFO(Last In First Out) 구조
  2. 시스템 해킹에서 버퍼오버플로우 취약점을 이용한 공격을 할 때 스택 메모리의 영역에서 함
  3. 인터럽트처리, 수식의 계산, 서브루틴의 복귀 번지 저장 등에 쓰임
  4. 그래프의 깊이 우선 탐색(DFS)에서 사용
  5. 재귀적(Recursion) 함수를 호출 할 때 사용
- Stack의 주요 메소드
  1. empty() : Stack이 비어있는지 알려줌
  2. peek() : Stack의 맨 위에 저장된 객체를 반환
  3. pop() : Stack의 맨 위에 저장된 객체를 꺼냄
  4. push(e) : Stack에 객체를 저장
  5. search(e) : Stack에서 주어진 객체를 찾아서 그 위치를 반환

### Queue
- Queue의 특징
   1. 먼저 들어간 자료가 먼저 나오는 구조 FIFO(First In FIrst Out) 구조
   2. 큐는 한 쪽 끝은 프런트(front)로 정하여 삭제 연산만 수행함
   3. 다른 한 쪽 끝은 리어(rear)로 정하여 삽입 연산만 수행함
   4. 그래프의 넓이 우선 탐색(BFS)에서 사용
   5. 컴퓨터 버퍼에서 주로 사용, 마구 입력이 되었으나 처리를 하지 못할 때, 버퍼(큐)를 만들어 대기 시킴
- Queue의 주요 메소드
  1. add(e) : 지정된 객체를 Queue에 추가
  2. offer(e) : Queue에 객체를 저장
  3. remove() : Queue에서 객체를 꺼내서 반환
  4. poll() : Queue에서 객체를 꺼내서 반환
  5. element() : 삭제없이 요소를 읽어옴.
  6. peek() : 삭제없이 요소를 읽어옴.
  7. size() : queue의 사이즈 반환

### Deque
- Deque의 특징
  1. 삽입과 삭제가 리스트의 양쪽 끝에서 모두 발생할 수 있는 자료 구조이다.
  2. Double Ended Queue의 약자이다.
  3. Stack과 Queue의 장점만 따서 구성한 것이다.
- Deque의 주요 메소드
  - Deque 값 추가
    1. addFirst(e) : Deque의 앞쪽에 데이터를 삽입, 용량 초과시 Exception
    2. offerFirst() : Deque의 앞쪽에 데이터를 삽입 후 true, 용량 초과시 false
    3. addLast() : Deque의 뒤쪽에 데이터를 삽입, 용량 초과시 Exception 
    4. add() : addLast()와 동일 
    5. offerLast() : Deque의 뒤쪽에 데이터를 삽입 후 true, 용량 초과시 false 
    6. offer() : offerLast()와 동일
    7. deque.push() : addFirst()와 동일
    8. deque.pop() : removeFirst()와 동일
  - Deque 값 제거
    1. removeFirst() : Deque의 앞에서 제거, 비어있으면 예외 
    2. remove() : removeFirst()와 동일 
    3. poll() : Deque의 앞에서 제거, 비어있으면 null 리턴 
    4. pollFirst() : poll()과 동일 
    5. removeLast() : Deque의 뒤에서 제거, 비어있으면 예외 
    6. pollLast() : Deque의 뒤에서 제거, 비어있으면 null 리턴
  - Deque 값 확인
    1. getFirst() : 첫 번째 엘리먼트를 확인, 비어있으면 예외
    2. peekFirst() : 첫 번째 엘리먼트를 확인, 비어있으면 null 리턴
    3. peek() : peekFirst()와 동일
    4. getLast() : 마지막 엘리먼트를 확인, 비어있으면 예외 
    5. peekLast() : 마지막 엘리먼트를 확인, 비어있으면 null 리턴 
    6. contain(Object o) : Object 인자와 동일한 엘리먼트가 포함되어 있는지 확인 
    7. size() : Deque에 들어있는 엘리먼트의 개수