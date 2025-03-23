# 1244번
'''
남: 1
여: 2

[0, 1, 0, 1, 0, 0, 0, 1] [[1, 3], [2, 3]]

1 0 0 0 1 1 0 1
'''
import sys

input = sys.stdin.readline

switches = int(input())
switch_status = list(map(int, input().split()))
students = int(input())
students_info = [list(map(int, input().split())) for _ in range(students)]

for i in students_info:
    # 남학생
    if i[0] == 1:
        for j in range(i[1] - 1, switches, i[1]):
            switch_status[j] = 1 - switch_status[j]
    # 여학생
    else:
        center = i[1] - 1
        left = center - 1
        right = center + 1
        
        while left >= 0 and right < switches and switch_status[left] == switch_status[right]:
            left -= 1
            right += 1
        
        left += 1
        right -= 1
        
        for j in range(left, right + 1):
            switch_status[j] = 1 - switch_status[j]

for i in range(0, switches, 20):
    print(*switch_status[i:i+20])
