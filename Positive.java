import java.util.*;
import java.lang.*;
import java.io.*;
 public class Positive
{
	public static void main (String[] args) 
	{
		int n;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println("positive");
		}
		else if(n<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("zero");
		}
	}
}
