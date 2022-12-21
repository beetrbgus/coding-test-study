import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Node {
    private int x;
    private int y;

    public Node(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

class Boj_2468 {
    static int n, count = 0, max = 0;
    static boolean[][] visited;
    static int[] dist;
    static int[][] graph;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void bfs(int x, int y, int h) {
        Queue<Node> q = new LinkedList<Node>();
        q.offer(new Node(x, y)); // 삽입
        visited[x][y] = true; // 방문표시

        while (!q.isEmpty()) {
            Node nowNode = q.poll();
            x = nowNode.getX();
            y = nowNode.getY();

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= n) // 범위
                    continue;

                if (visited[nx][ny] == false && graph[nx][ny] >= h) { // 물에 안잠겼고, 방문안한경우
                    visited[nx][ny] = true; // 방문표시
                    q.offer(new Node(nx, ny)); // 삽입
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());


        // 초기화
        visited = new boolean[n][n]; // 인덱스 0부터 시작
        graph = new int[n][n];

        // 그래프 입력
        for (int i = 0; i < n; i++) { // 인덱스 0부터 시작
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                int a = Integer.parseInt(st.nextToken());
                graph[i][j] = a;

                max = Math.max(max, a); // 최대높이 구하기
            }
        }

        // 초기화
        dist = new int[max + 1]; // 가장 높은크기만큼 인댁스 필요 (0부터 max까지 모두 체크 필요)*****

        for (int h = 0; h <= max; h++) { // 각 높이별 BFS 실행
            count = 0; // 초기화

            visited = new boolean[n][n]; // 초기화
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (graph[i][j] <= h) { // 물에 잠긴다면 미리 방문처리하여 방문못하게함
                        visited[i][j] = true;
                    }
                }
            }

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (visited[i][j] == false && graph[i][j] >= h) { // 미방문이며 물에 잠기지 않은 안전구역인경우 BFS실행,높이값 반복 주의 *****
                        bfs(i, j, h);
                        count++;
                    }
                }
            }
            dist[h] = count; // 높이별 안전영역수 입력
        }

        int resultCnt = 0;
        for (int i = 0; i < dist.length; i++) { // 안전영역이 가장 많은 높이 출력
            resultCnt = resultCnt < dist[i] ? dist[i] : resultCnt;
        }

        System.out.println(resultCnt);
    }
}