import java.util.*;
import java.lang.*;
import java.io.*;
public class Largee
{
	public static void main (String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a>=b&&a>=c)
		System.out.println(a);
		if(b>=a&&b>=c)
		System.out.println(b);
		if(c>=a&&c>=b)
		System.out.println(c);
	}
}
