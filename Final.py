e=int(input())
o=input()
o=i.split(" ")
o=list(map(int,o))
g=sorted(o)
for i in range(len(g)):
        if(o[i]!=g[i]):
             print(g.index(g[i]))
             break
