result=[]
while True:
    a,b,c=map(int,input().split())
    length=[a,b,c]
    length.sort()
    if a==0 and b==0 and c==0:
        break;
    else:
        if length[2]**2==length[1]**2+length[0]**2:
            result.append("right")
        else:
            result.append("wrong") 
for i in result:
    print(i)