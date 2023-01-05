# 1부터 N까지 자연수 중에 중복없이 M개를 고른 수열
n,m = list(map(int,input("숫자를 입력해주세요 :").split()))

s = []

def dfs():
    #배열 s의 크기가 m과 같을 경우에
    print(len(s)) # 0
    print(n)
    print(m)
    if len(s)==m:
        #join()은 s배열의 모든 요소를 합친다
        #str형태의 s배열의 반복을 해줘서 그 요소들을 합쳐준다.
        print(' '.join(map(str,s)))
        return
    else : 
        print("난여기있다.")

dfs()