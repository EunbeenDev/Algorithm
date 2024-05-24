num=str(input())
l1=list(num)
num_list=[]
for i in l1:
    num_list.append(int(i))
num_list.sort(reverse=True)

result="".join(str(s) for s in num_list)
print(result)