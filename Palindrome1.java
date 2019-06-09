import java.util.*;
import java.lang.*;
import java.io.*;
 public class Palindrome1
{
	public static void main (String[] args) 
	{
		  int r, m,sum=0,temp;   
Scanner sc=new Scanner(System.in);
m=sc.nextInt();
 
 
  temp=m;    
  while(m>0){    
   r=m%10;  
   sum=(sum*10)+r;    
   m=m/10;    
  }    
  if(temp==sum)    
   System.out.println(" yes");    
  else    
   System.out.println("no");    
}  
	}
