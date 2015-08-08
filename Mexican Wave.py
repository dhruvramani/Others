def printe():
	stre="abcdefghijklmnopqrstuvwxyz"
	for i in range(0,len(stre)):
		for j in range(0,i):
			print(stre[j],end="")
		print(stre[i].upper(),end="")
		for k in range(i+1,len(stre)):
			print(stre[k],end="")
		print("")
			
	for i in range(len(stre)-1,0,-1):
		for j in range(0,i):
			print(stre[j],end="")
		print(stre[i].upper(),end="")
		for k in range(i+1,len(stre)):
			print(stre[k],end="")
		print("")
	
printe()