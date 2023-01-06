n,m = list(map(int,input("숫자를 입력해주세요 :").split()))
 
s = []
 
def dfs():
    # len()은 배열의 크기(개수)
    print('s는 --'+str(len(s))) # 0
    print('n은 --'+str(n))
    print( 'm은 --'+str(m))
    if len(s)==m:
        # join()은 배열의 요소를 합치는 거
        print(' '.join(map(str,s)))
        return
    
    for i in range(1,n+1):
        if i not in s:
            s.append(i)
            dfs()
            s.pop()
 
dfs()