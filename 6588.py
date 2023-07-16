# code.plus - 골드바흐의 추측

import math

def get_prime():
    for num in range(2, 1001) :
        for i in range(2, math.isqrt(num) + 1) :
            if num % i == 0 : 
                prime_list[num] = False
                break

if __name__== "__main__" :
    MAX_NUM = 1000000
    prime_list = [True] * (MAX_NUM + 1)
    get_prime()
    for i in range(2,  1001) :
        if prime_list[i] :
            for j in range(i + i, MAX_NUM + 1, i) :
                prime_list[j] = False