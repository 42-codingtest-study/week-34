result = input()

while "PPAP" in result:
	result = result.replace("PPAP", "P")

if result == "P" :
	print("PPAP")
else :
	print("NP")