p=input()
o=[]
for i in p:
    if(i.isdigit())==True:
        o.append(i)
print(*o,sep="")
