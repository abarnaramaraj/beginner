import java.util.*;
import java.lang.*;
import java.io.*;
public class Large7
{
	public static void main (String[] args) 
	{
		int a1,b1,c;
		Scanner sc=new Scanner(System.in);
		a1=sc.nextInt();
		b1=sc.nextInt();
		c=sc.nextInt();
		if(a1>=b1)
		{
		if(a1>=c)
		System.out.println(a1);
		else
		System.out.println(c);
		}
		else
		{
		if(b1>=c)
		System.out.println(b1);
		else
		System.out.println(c);
		}
	}
