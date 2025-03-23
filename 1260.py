# 1260번_DFS(스택)와 BFS(큐)
'''
정점이 여러 개인 경우에는 정점 번호가 작은 것부터 먼저 방문 

input: 
4 5 1
1 2
1 3
1 4
2 4
3 4

output:
1 2 4 3: DFS
1 2 3 4: BFS

{1: [2, 3, 4], 2: [1, 4], 3: [1, 4], 4: [1, 2, 3]}
{1: [2, 3], 2: [1, 5], 3: [1, 4], 4: [3, 5], 5: [2, 4]}
'''

import sys
from collections import deque

input = sys.stdin.readline

# 초기 세팅 끝...아 여기서 어떻게 하더라
nodes, edges, start_node = map(int, input().split())
graph = {i: [] for i in range(1, nodes + 1)}

search = deque([start_node])
has_visited = [0] * nodes

# 간선
for i in range(edges) :
    n1, n2 = map(int, input().split())
    graph[n1].append(n2)
    graph[n2].append(n1)

# 오름차순 정렬
for i in range(1, nodes + 1) :
    graph[i].sort()

def DFS(nodes) :
    print(nodes, end=' ')
    has_visited[nodes-1] = 1
    for i in graph[nodes] :
        if has_visited[i-1] == 0 :
            DFS(i)
    
def BFS() :
    while search :
        node = search.popleft()
        print(node, end= ' ')
        for i in graph[node] :
            if has_visited[i-1] == 0 and i != start_node :
                has_visited[i-1] = 1
                search.append(i)

DFS(start_node)
print()
has_visited = [0] * nodes
BFS()