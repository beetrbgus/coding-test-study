## 📍 1주차 개념 정리

## 자료구조
### 개념 
대량의 데이터를 효율적으로 관리할 수 있는 데이터의 구조
<Br>
어떤 데이터 구조를 사용하느냐에 따라 코드의 효율이 달라질 수 있으므로 적절한 자료구조를 선정하는 것이 매우 중요하다.

### 자료구조의 분류
선형구조
- 배열
- 연결리스트
- 스택
- 큐

비선형구조
- 트리
- 그래프

## Stack
### 개념
데이터를 순서대로 쌓는 자료구조

### 특징
- 후입 선출(LIFO) 구조
    - 마지막에 들어온 데이터가 먼저 나가는 데이터 구조
- 데이터 수에 상관없이 무조건 하나씩만 넣거나 뺄 수 있다
- 하나의 입출력 방향을 가진다.
- 유한하고 정적인 데이터만 저장할 수 있다.
- 스택의 크기는 제한되어 있다.

### Stack 클래스 메서드
```java
import java.util.Stack;

public class StackExample {

  public static void main(String[] args) {
      
    // 선언하기  
      
    // String 타입 선언  
    Stack<String> stack = new Stack<>();
    // Char 타입 선언
    Stack<Character> chStack = new Stack<Character>();
    // Integer 타입 선언
    Stack<Integer> iStack = new Stack<Integer>();
    // 뒤 타입 생략 가능
    Stack<Integer> iStack2 = new Stack<>();
    
    // 메서드
    
    // Stack에 데이터 추가
    stack.push("Data1");
    stack.push("Data2");
    stack.push("Data3");

    // Stack에서 데이터 꺼내기
    System.out.println(stack.pop());

    // Stack의 최상단 값 출력(제거하지 않음)
    System.out.println(stack.peek());

    // Stack에서 데이터 꺼내기
    System.out.println(stack.pop());
    
    // Stack 사이즈 확인하기
    System.out.println(stack.size());
    
    // Stack 초기화하기 
    System.out.println(stack.clear());
    
    // Stack 비어있는지 여부 판단
    // Boolean true or false 리턴
    System.out.println(stack.empty());
    
    // Stack에 특정 데이터가 포함되어 있는지 확인
    // Boolean true or false 리턴
    System.out.println(stack.contains("Data1"));
  }
}
```
<br>

> 스택 오버플로우
> <br>
> 꽉 찬 스택에 데이터 원소를 넣으려 할 때 발생
> <br>
> <br>
> 스택 언더플로우
> <br>
> 비어있는 스택에서 데이터 원소를 꺼내려할 때 발생

### 스택 활용 예시
- 웹 브라우저 뒤로 가기 : 가장 나중에 열린 페이지부터 뒤로 가기 실행
- 문서작업에서 Ctrl+Z : 가장 나중 수정한 내역부터 되돌린다
- 역순 문자열 만들기 : 맨 끝의 문자열부터 차례대로 만들어진다
- 후위 표기법 계산
- 재귀적 알고리즘

## Queue
### 개념
먼저 집어넣은 데이터가 먼저 나오는 구조

### 특징
- Rear 부분에서 자료 삽입
- Front 부분에서 자료 삭제
- 선입선출 자료구조

### Queue 클래스 메서드
```java
import java.util.LinkedList;

public class QueueExample {

  public static void main(String[] args) {

    // 선언하기  

    // Queue 클래스 선언
    Queue queue = new LinkedList();

    // Integer타입으로 선언
    Queue<Integer> i = new LinkedList<Integer>();
    // new부분 타입 생략 가능
    Queue<Integer> i2 = new LinkedList<>();
    // 선언과 동시에 초기값 세팅
    Queue<Integer> i3 = new LinkedList<Integer>(Arrays.asList(1, 2, 3));
    // String타입 선언
    Queue<String> str = new LinkedList<String>();
    // Character타입 선언    
    Queue<Character> ch = new LinkedList<Character>();

    // 메서드

    // Queue에 값 추가
    que.add("Hello");
    que.add("World");
    queue.offer("hi");

    // 맨 앞의 값 삭제
    que.poll();
    // 맨 앞의 값 삭제
    que.remove();
    // 해당하는 값 삭제
    que.remove("Hello");

    // Queue 헤드 요소 확인 및 반환
    System.out.println(que.peek());
    
    // Queue 비었는지 확인
    // true false 리턴
    System.out.println(que.isEmpty());
    
    // Queue 값 포함 여부
    // true false 리턴
    System.out.println(que.continas("Hello"));
    
    // Queue 사이즈 확인하기
    System.out.println(que.size());

    // Queue 초기화하기
    System.out.println(que.clear());
    
  }
}
  
  
```

### 큐의 활용 예시
- 은행창구 번호표 대기 : 빠른 번호표를 가진 사람이 먼저 업무를 본다
- 컴퓨터 운영체제 스케줄링 : 가장 간단한 현태의 선입선 처리 스케줄링 정책
- 너비 우선 탐색 알고리즘 
