# 1515번
'''
in: 12399
out: 19

1 2 3 4 5 6 7 8 9 1 0 1 1 1 2 1 3 1 4 1 5 1 6 1 7 1 8 1 9

idx 0 1 2 3 4
num 1 2 3 9 9

n 증가, 자릿수마다 계산
nums 길이 주의
'''
import sys

input = sys.stdin.readline
nums = input().strip()

def mini(nums):
    n, idx = 0, 0
    while True:
        n += 1
        for s in str(n):
            # print(s, end=" ")
            if idx < len(nums) and nums[idx] == s:
                idx += 1           
                if idx >= len(nums):
                    return n
                
print(mini(nums))