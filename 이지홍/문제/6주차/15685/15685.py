# 시물레이션 
# 	•	알고리즘은 간단한데 코드가 지나칠 만큼 길어지는 문제
# 	•	실수 연산을 다루고 특정 소수점 자리까지 출력해야 하는 문제
# 	•	문자열을 특정한 기준에 따라서 끊어 처리해야 하는 문제
# 	•	적절한 라이브러리를 찾아서 사용해야 하는 문제
# 특징
# 일반적으로 2차원 공간을 다루는 문제가 많이 나온다
# 2차원 공간을 다루기 위해 행렬(Matrix) 개념을 사용 이차원 공간에서의 방향 벡터가 자주 나옴

import sys
input = sys.stdin.readline

n = int(input())

dx = [1,0,-1,0]
dy = [0,-1,0,1]

# 좌표가 드래곤 커브에 포함이 되는지 체크해줄 리스트
check = [[0] * (101) for _ in range(101)]


for _  in range(n):
    x,y,d,g = map(int,input().split())


    # 주어진 g세대동안 움직인 방향들을 담아둘 리스트
    move_list = [d]
     # 먼저 시작하는 x,y 좌표는 방문체크
    check[x][y] = 1
    # 세대 만큼 For문을 돌리면서
    for i in range(g):
        tmp = []
        # 시작세대 d로 초기화한 move_list의 길이만 큼 for문을 돌린다.
        # 앞으로 계속 추가해줄 것이기 때문에 길이는 늘어난다.
        for j in range(len(move_list)):
            # 이전 세대들을 돌면서 뒤에서 부터  방향에 1씩 더하고 4로 나눠서 방향을 
            # tmp에 append 시킨다.
            tmp.append((move_list[-j-1]+1)%4)
        # move_list 에 tmp를 extend 시켜서 뒤에 그대로 붙여준다.
               move_list.extend(tmp)


    # g 세대 만큼 실행한 뒤 
    # move_list에 있는 방향들을 확인하면서 좌표를 계산해주고, check 처리를 해준다.
    for i in move_list:
        nx = x + dx[i]
        ny = y + dy[i]
        check[nx][ny] = 1 # 체크처리
        x,y = nx,ny # 방향을 현재 움직인 방향으로 갱신

answer = 0
# 100,100 좌표를 돌면서 한 좌표가 1로 체크되어있을 때, 
# 나머지 오른쪽, 아래, 오른쪽 아래대각선이 1로 체크되어있으면
# answer += 1  을 해준다.
for i in range(100):
    for j in range(100):
        if check[i][j] == 1 and check[i+1][j] == 1 and check[i][j+1] == 1 and check[i+1][j+1] == 1:
            answer += 1

print(answer)