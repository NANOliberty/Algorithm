# 1446번
'''
다른 코드 참고한 것
'''
import sys
input = sys.stdin.readline

#입력
road = list(map(int, input().split()))
n, d = road[0], road[1]

short = []
for _ in range(n) :
    start, end, length = map(int, input().split())
    short.append((start, end, length))


def find_shortest(short):
    dp = [i for i in range(d + 1)]
    
    short.sort()

    for i in range(d + 1):
        if i > 0:
            dp[i] = min(dp[i], dp[i-1] + 1)
        
        for start, end, length in short:
            if start == i and end <= d:
                dp[end] = min(dp[end], dp[start] + length)
    
    return dp[d]

print(find_shortest(short))