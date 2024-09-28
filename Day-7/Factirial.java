import java.util.*;

public class Factirial
{
    public static int fact(int n)
    {
        int a= 1;
        if (n == 0)
        {
            return 1;
        }
        else 
        {
            for(int i=n; i>=1; i--)
            {
                a= a*i;
            }
            return a;
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println("Factorial is: "+ ans);
        
    }
}