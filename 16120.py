string = list(input())

if string[-1] == "A":
	print("NP")
	exit()

cnt = 0
i = 0
while i < len(string):
	if string[i] == 'P':
		cnt += 1
		i += 1
		continue
	if cnt >= 2 and string[i+1] == 'P':
		cnt -= 1
		i += 2
	else:
		print("NP")
		exit()

if cnt == 1:
	print("PPAP")
else:
	print("NP")