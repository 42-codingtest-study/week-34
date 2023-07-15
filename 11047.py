n, k = map(int, input().split())
coin = []
for _ in range(n):
	coin.append(int(input()))
coin.sort(reverse=True)
cnt = 0
for i in coin :
	if i <= k :
		cnt += k // i
		k -= (k // i) * i

print(cnt)