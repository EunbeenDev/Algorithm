rnum=input()
num_list=list(rnum)
count_list=[]
for i in range(len(num_list)):
    if num_list[i]=='9':
        num_list[i]='6'
six=num_list.count('6')
if six%2==0:
    count_list.append(six/2)
else:
    count_list.append(six//2+1)
for i in range(len(num_list)):
    if num_list[i]!='6':
        count_list.append(num_list.count(num_list[i]))
print(int(max(count_list)))