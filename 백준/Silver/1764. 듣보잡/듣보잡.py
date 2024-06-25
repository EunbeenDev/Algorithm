import sys
lis_people=set()
ab_people=set()
n,m=map(int, sys.stdin.readline().split())

for i in range(n):
    lis_people.add(input())
    
for i in range(m):
    ab_people.add(input())

double_people=sorted(list(lis_people&ab_people))
print(len(double_people))
for i in double_people:
    print(i)