# code.plus - 난쟁이

all = []
sum = 0
a, b = 0, 0
for i in range(9) :
    all.append(int(input()))
    sum += all[i]
a, b = 0, 0
for m in range(8) :
    for n in range(m+1, 9) :
        if sum - (all[m] + all[n]) == 100:
            a = all[m]
            b = all[n]

all.remove(a)
all.remove(b)
all.sort()
for i in all:
    print(i)