# 깊이 우선 탐색(DFS)
루트 노드(혹은 다른 임의의 노드)에서 시작해서 다음 분기(branch)로 넘어가기 전에 해당 분기를 완벽하게 탐색하는 방식을 말합니다.

1. 모든 노드를 방문하고자 하는 경우에 이 방법을 선택함
2. 깊이 우선 탐색(DFS)이 너비 우선 탐색(BFS)보다 좀 더 간단함
3. 검색 속도 자체는 너비 우선 탐색(BFS)에 비해서 느림

# 넓이 우선 탐색(BFS)
루트 노드(혹은 다른 임의의 노드)에서 시작해서 인접한 노드를 먼저 탐색하는 방법으로, 시작 정점으로부터 가까운 정점을 먼저 방문하고 멀리 떨어져 있는 정점을 나중에 방문하는 순회 방법입니다.

주로 두 노드 사이의 최단 경로를 찾고 싶을 때 이 방법을 선택합니다.

# 깊이 우선 탐색(DFS)과 너비 우선 탐색(BFS) 활용한 문제 유형/응용
1. 그래프의 모든 정점을 방문하는 것이 주요한 문제
   - DFS, BFS 둘 다 사용 가능
2. 경로의 특징을 저장해둬야 하는 문제
   - 예를 들면 각 정점에 숫자가 적혀있고 a부터 b까지 가는 경로를 구하는데 경로에 같은 숫자가 있으면 안 된다는 문제 등, 각각의 경로마다 특징을 저장해둬야 할 때는 DFS를 사용합니다. (BFS는 경로의 특징을 가지지 못합니다)
3. 최단거리 구해야 하는 문제
   - 미로 찾기 등 최단거리를 구해야 할 경우, BFS가 유리합니다.
4. 검색 대상 그래프가 정말 크다면 DFS를 고려
5. 검색대상의 규모가 크지 않고, 검색 시작 지점으로부터 원하는 대상이 별로 멀지 않다면 BFS

# DFS 코드 (재귀함수 이용)
```java
/* 인접 리스트 이용 */
class Graph {
  private int V;
  private LinkedList<Integer> adj[];
 
  Graph(int v) {
      V = v;
      adj = new LinkedList[v];
      // 인접 리스트 초기화
      for (int i=0; i<v; ++i)
          adj[i] = new LinkedList();
  }
  void addEdge(int v, int w) { adj[v].add(w); }
   
  /* DFS */
  void DFS(int v) {
      boolean visited[] = new boolean[V];
 
      // v를 시작 노드로 DFSUtil 재귀 호출
      DFSUtil(v, visited);
  }
  
  /* DFS에 의해 사용되는 함수 */
  void DFSUtil(int v, boolean visited[]) {
      // 현재 노드를 방문한 것으로 표시하고 값을 출력
      visited[v] = true;
      System.out.print(v + " ");
 
      // 방문한 노드와 인접한 모든 노드를 가져온다.
      Iterator<Integer> it = adj[v].listIterator();
      while (it.hasNext()) {
          int n = it.next();
          // 방문하지 않은 노드면 해당 노드를 시작 노드로 다시 DFSUtil 호출
          if (!visited[n])
              DFSUtil(n, visited);
      }
  }

}
```

# BFS 코드

```java
class Graph {
  private int V;
  private LinkedList<Integer> adj[];
 
  Graph(int v) {
    V = v;
    adj = new LinkedList[v];
    for (int i=0; i<v; ++i)
      adj[i] = new LinkedList();
  }
 
  void addEdge(int v, int w) { adj[v].add(w); }
 
  /* BFS */
  void BFS(int s) {
    boolean visited[] = new boolean[V]; //방문여부 확인용 변수
    LinkedList<Integer> queue = new LinkedList<Integer>(); //연결리스트 생성
 
    visited[s] = true;
    queue.add(s);
 
    while (queue.size() != 0) {
      // 방문한 노드를 큐에서 추출(dequeue)하고 값을 출력
      s = queue.poll();
      System.out.print(s + " ");
 
      // 방문한 노드와 인접한 모든 노드를 가져온다.
      Iterator<Integer> i = adj[s].listIterator();
      while (i.hasNext()) {
        int n = i.next();
        
        // 방문하지 않은 노드면 방문한 것으로 표시하고 큐에 삽입(enqueue)
        if (!visited[n]) {
          visited[n] = true;
          queue.add(n);
        }
      }
    }
  }
}
```