import java.util.*;
import java.lang.*;
import java.io.*;
 public class Alphabet
{
	public static void main (String[] args) 
	{
		Char n;
		
		Scanner sc=new Scanner(System.in);
		char n=sc.next().charAt(0);
	

		if((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
		{
			System.out.println("Alphabet");
}

		else
{

	
		System.out.println("No");
	}
		
	}
}
