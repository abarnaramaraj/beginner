import java.util.*;
import java.lang.*;
public class Fact2
{
public static void main(String[] args)
{
int k,i;
long factorial=1;
Scanner sc=new Scanner(System.in);
k=sc.nextInt();
for(i=1;i<=k;++i)
{
factorial=factorial*i;
}
System.out.println(factorial);
}
}
