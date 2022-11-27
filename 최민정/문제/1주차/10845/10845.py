import sys
input = sys.stdin.readline

N = int(input())
queue=[]

for i in range(N):
  tmp=input().split()

  if tmp[0]=='push':
    queue.append(tmp[1])
  elif tmp[0]=='pop':
    if queue:
      print(queue.pop(0))
    else:
      print(-1)
  elif tmp[0]=='size':
    print(len(queue))
  elif tmp[0]=='empty':
    if queue:
      print(0)
    else:
      print(1)
  elif tmp[0]=='front':
    if queue:
      print(queue[0])
    else:
      print(-1)
  elif tmp[0]=='back':
    if queue:
      print(queue[-1])
    else:
      print(-1)