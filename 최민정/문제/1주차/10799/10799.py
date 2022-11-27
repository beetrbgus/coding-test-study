import sys
input = list(sys.stdin.readline())

stack=[]
result=0

for i in range(len(input)):  
  if input[i]=='(':
    stack.append('(')
  elif input[i]==')':
    if input[i-1]=='(':
      stack.pop()
      result+=len(stack)
    else:
      stack.pop()
      result+=1
        
print(result)