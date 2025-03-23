# 4256번
'''
8

전위 루트 왼쪽서브 오른쪽서브
ce le ri
3 6 5 4 8 7 1 2

중위
le ce ri
5 6 8 4 3 1 2 7

후위
le ri ce
5 8 4 6 2 1 7 3

1
8
3 6 5 4 8 7 1 2
5 6 8 4 3 1 2 7
3 [5, 6, 8, 4] [1, 2, 7] --> 재귀

'''
import sys
input = sys.stdin.readline

def post_order(preorder, inorder) :
    if len(preorder) == 1 :
        return [preorder[0]]
    
    elif len(preorder) == 0 :
        return []
    
    else: 
        root = preorder[0]

        inorder_root = inorder.index(root)
        
        left = inorder[:inorder_root]
        right = inorder[inorder_root+1:]
        
        left_sub = post_order(preorder[1:inorder_root+1], left)
        right_sub = post_order(preorder[inorder_root+1:], right)
        
        return left_sub + right_sub + [root]
    

T = int(input())
for i in range(T) :
    n = int(input())  
    
    preorder = list(map(int, input().split()))
    inorder = list(map(int, input().split()))
    
    print(*post_order(preorder, inorder))
 