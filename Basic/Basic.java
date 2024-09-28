
import java.util.Scanner;

public class Basic
{
    public static void main(String args[])
    {
        System.out.print("Enter the n number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            System.out.println(i);
        }

    }
}