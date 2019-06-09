import java.util.*;
import java.lang.*;
import java.io.*;
 public class Positive
{
	public static void main (String[] args) 
	{
		int m;
		Scanner sc=new Scanner(System.in);
		m=sc.nextInt();
		if(m>0)
		{
			System.out.println("Positive");
		}
		else if(m<0)
		{
			System.out.println("Negative");
		}
		else
		{
			System.out.println("Zero");
		}
	}
}
