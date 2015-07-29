a=[2,11,3,7,9,5,1,12,13,15,18,200,201,202]
a=sorted(a)

stri=""

while(not(len(a) == 0)):
	i=0
	k=a[0]
	j=0
	
	while((i<len(a)-1) and (a[i]+1 == a[i+1])):
		j=a[i+1]
		i+=1
	
	if(i==0):
		stri+=" "+str(a[i])
		del a[0]
	else :
		stri+=" "+str(a[0])+"-"+str(a[i])
		del a[0:i+1]

print(stri)