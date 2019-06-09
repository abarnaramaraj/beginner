import java.util.*;
import java.lang.*;
public class Factorial
{
public static void main(String[] args)
{
int m,i;
long factorial=1;
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
for(i=1;i<=m;++i)
{
factorial=factorial*i;
}
System.out.println(factorial);
}
}
