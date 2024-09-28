/*

****
***
**
*

*/

public class Pattern1
{
    public static void main(String[] args) {
        int n=4; //Total number of lines
        for(int i=1; i<=n; i++) // For lines
        {
            for(int j=1; j<=n-i+1; j++) // For Stars
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}