import java.util.*;
import java.lang.*;

public class Sum6 
{
    public static void main(String args[])
    {
        int p, i = 1 ;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        p= sc.nextInt();
        while(i <= p)
        {
            sum = sum +i;
            i++;
        }
        System.out.println(sum);
    } 
}
