import java.util.*;
import java.lang.*;

public class Count8 
{
    public static void main(String args[])
    {
        int l, i = 1 ;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        while(i <= l)
        {
            sum = sum +i;
            i++;
        }
        System.out.println(sum);
    } 
}
