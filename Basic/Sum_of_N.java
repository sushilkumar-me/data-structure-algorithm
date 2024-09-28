import java.util.*;

public class Sum_of_N
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=n; i>=1;i--)
        {
            sum =sum +i;
        }
        System.out.println("Sum of First n number is: "+sum);
    }
}