# 18352번
'''
[[], [2, 3], [3, 4], [], []]

-1 0 1 1 2
'''

import sys
input = sys.stdin.readline

# 입력
n, m, k, x = map(int, input().split())

road = []
for _ in range(m) :
    a, b = map(int, input().split())
    road.append((a, b))
    
def solve_city_problem(road):
    graph = [[] for _ in range(n + 1)]
    for a, b in road:
        graph[a].append(b)
    
    distances = [-1] * (n + 1)
    
    # BFS
    queue = [x]
    distances[x] = 0
    
    index = 0
    while index < len(queue):
        current = queue[index]
        index += 1
        
        for neighbor in graph[current]:
    
            if distances[neighbor] == -1:
                distances[neighbor] = distances[current] + 1
                queue.append(neighbor)
    
    result = []
    for city in range(1, n + 1):
        if distances[city] == k:
            result.append(city)
    
    if not result:
        return [-1]
    
    return sorted(result)


answer = solve_city_problem(road)
for i in answer :
    print(i)

