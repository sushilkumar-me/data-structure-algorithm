public class CallByValue
{
    public static void swap(int a, int b)
    {
        
        int temp= a;
        a= b;
        b= temp;

        
    }
    public static void main(String[] args)
    {
        int a=5, b=10;
        
        swap(a,b);
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}