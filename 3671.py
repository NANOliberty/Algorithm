# 3671번
'''
하기 싫다
'''
import sys
from itertools import permutations

def is_prime(n):
    if n <= 1:
        return False
    if n == 2 or n == 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

def count_primes(digits):
    if digits == '0':
        return 0

    paper_digits = list(digits)
    n = len(paper_digits)
    
    primes = set()
    
    for mask in range(1, 1 << n):
        subset = []
        for i in range(n):
            if mask & (1 << i):
                subset.append(paper_digits[i])

        for perm in permutations(subset):
            if perm[0] == '0':
                continue
            num = int(''.join(perm))
            if is_prime(num):
                primes.add(num)
    
    return len(primes)

c = int(input())
    
for _ in range(c):
    digits = input().strip()
    result = count_primes(digits)
    print(result)
