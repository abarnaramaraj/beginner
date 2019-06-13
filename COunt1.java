import java.util.*;
import java.lang.*;
import java.io.*;
public class COunt1
{
	public static void main (String[] args) 
	{
		int count=0,l;
		Scanner sc=new Scanner(System.in);
		l=sc.nextInt();
		while(l!=0)
		{
			l/=10;
			++count;
		}
		System.out.println(count);
	}
