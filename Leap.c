include<stdio.h>
int year
{
if((year%400==0)||(year%4==0&&year%100!=0))
return 1;
else
return 0;
}
int main()
{
int i,n;

scanf("%d",&n);

for(i=0;i<=0;i++)
{
if(year(i))
printf("%d",i);
}
return 0;
}
