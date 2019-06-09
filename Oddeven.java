import java.util.*;
import java.lang.*;
import java.io.*;
 public class Oddeven
{
	public static void main (String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else if(n%2==1)
		{
			System.out.println("Odd");
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}
}
