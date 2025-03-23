# 14501번
'''
동적계획법으로 풀기
N + 1일에 퇴사, N일까지 일

 0 1 2 3 4 5 6 7 8 9
[0 45 45 45 35 15 0 0 0 0]

5, 2, 15
4, 1, 20

'''

import sys
input = sys.stdin.readline

time = [0]
pay = [0]

N = int(input())
for _ in range(N):
    a, b = map(int, input().split())
    time.append(a)
    pay.append(b)
    
# 최대 수익 계산
max_pay = [0 for _ in range(N+2)]

def max_pay_cal() :
    for i in range(N, -1, -1) :
        if time[i] + i <= N + 1 :
            max_pay[i] = max(max_pay[i+1], pay[i] + max_pay[i+time[i]])
        else :
            max_pay[i] = max_pay[i+1]      
    return max_pay[1]

print(max_pay_cal())
