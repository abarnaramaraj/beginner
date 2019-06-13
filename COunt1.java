import java.util.*;
import java.lang.*;
import java.io.*;
public class COunt1
{
	public static void main (String[] args) 
	{
		int count=0,p;
		Scanner sc=new Scanner(System.in);
		p=sc.nextInt();
		while(p!=0)
		{
			p/=10;
			++count;
		}
		System.out.println(count);
	}
