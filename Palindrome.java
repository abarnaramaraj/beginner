import java.util.*;
import java.lang.*;
import java.io.*;
 public class Palindrome
{
	public static void main (String[] args) 
	{
		  int r, n,sum=0,temp;   
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
 
 
  temp=n;    
  while(n>0){    
   r=n%10;  
   sum=(sum*10)+r;    
   n=n/10;    
  }    
  if(temp==sum)    
   System.out.println(" Yes");    
  else    
   System.out.println("No");    
}  
	}
