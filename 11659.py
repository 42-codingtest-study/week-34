import sys

input = sys.stdin.readline
N, M = map(int, input().split())
lst = list(map(int, input().split()))
sum_lst = [0] * (N + 1)
sum_lst[1] = lst[0]
for i in range(N):
    sum_lst[i + 1] = lst[i] + sum_lst[i]
for _ in range(M):
    i, j = map(int, input().split())
    print(sum_lst[j] - sum_lst[i - 1])
