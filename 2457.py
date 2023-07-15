import sys
input = sys.stdin.readline

n = int(input())
date = []
for _ in range(n):
    a, b, c, d = map(int, input().split())
    date.append([a * 100 + b, c * 100 + d])

date.sort()
cnt = 0
end_date = 301
i = 0

while i < len(date):
    if end_date >= 1201 or date[i][0] > end_date:
        break
    temp = 0
    while i < len(date) and date[i][0] <= end_date:
        if temp <= date[i][1]:
            temp = date[i][1]
        i += 1

    end_date = temp
    cnt += 1

if end_date < 1201:
    print(0)
else:
    print(cnt)