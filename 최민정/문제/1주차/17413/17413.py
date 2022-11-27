s = list(input())

stack=''
result=''
flag=False # <가 있었는지 어떤지를 판별

for i in s:
  if flag==False:
    if i=='<': 
      flag=True
      stack=stack+i
    elif i==' ':
      stack=stack+i
      result=result+stack
      stack=''
    else:
      stack=i+stack

  elif flag==True:
    stack=stack+i
    if i=='>':
      flag=False
      result=result+stack
      stack=''

print(result+stack)