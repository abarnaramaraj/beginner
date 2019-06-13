pi=input()
l=pi.split('/')
o=pi.split('%')
for i in ax:
    if(i=='/'):
        print(int(l[0])//int(l[1]))
    elif(i=='%'):
        print(int(o[0]) % int(o[1]))
