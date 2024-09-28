public class Binomial
{
    public static int factorial(int n)
    {
        int a= 1;
            for (int i = 1; i <= n; i++)
            {
                a = a * i;
            }
            return a;
        
    }
    public static int BinCoeff(int n, int r)
    {
        int n_fact= factorial(n);
        int r_fact= factorial(r);
        int nmr_fact= factorial(n-r);
        int c= n_fact/(r_fact*nmr_fact);
        return c;
    }
    public static void main(String args[])
    {
        int n=5, r=2;
        int ans = BinCoeff(n, r);
        System.out.println("The Binomial Coefficient is: "+ ans);
    }
}