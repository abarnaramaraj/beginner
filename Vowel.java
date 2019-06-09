import java.util.*;
import java.lang.*;
import java.io.*;
 public class Vowel
{
	public static void main (String[] args) 
	{
		boolean isVowel=false;
		
		Scanner sc=new Scanner(System.in);
		char n=sc.next().charAt(0);
		switch(n)
		{
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u':
	case 'A':
	case 'E':
	case 'I':
	case 'O':
	case 'U': isVowel = true;
		}
		if(isVowel==true)							
		{
			System.out.println("Vowel");
		}
		else if((n>='a'&&n<='z')||(n>='A'&&n<='Z'))
		{
			System.out.println("Consonant");
		}
		else
	{
		System.out.println("invalid");
	}
		
	}
}
