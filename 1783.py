# 1783번
height, width = map(int, input().split())

if height == 1 :
    print(1)
elif height == 2 :
    if width < 7 : 
        print((width+1)//2)
    else :
        print(4)
else :
    if width < 7 :
        print(min(4, width))
    else :
        print(width - 2)
