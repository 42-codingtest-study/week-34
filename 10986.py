N, M = list(map(int, input().split()))
lst = [i % M for i in list(map(int, input().split()))]
prepix = [0 for _ in range(M)]  # 구간합을 저장할 리스트
presum = 0  # 구간합을 저장할 변수
prepix[0] = 1  # 나머지가 0인 경우를 미리 카운트
for i in range(N):
    presum += lst[i]
    prepix[presum % M] += 1
    print(lst[i], presum, prepix)
ans = 0
for i in prepix:
    ans += i * (i - 1) // 2
print(ans)
