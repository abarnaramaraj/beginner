import java.util.*;
import java.lang.*;
public class Factorial
{
public static void main(String[] args)
{
int n,i;
long factorial=1;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(i=1;i<=n;++i)
{
factorial=factorial*i;
}
System.out.println(factorial);
}
}
