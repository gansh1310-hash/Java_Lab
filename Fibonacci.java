import java.util.*;
class Fibonacci
{
    int n;
    Fibonacci(int n)
    {
        this.n=n;

    }
    void series()
    {
        int a=0,b=1,c;
        System.out.print("Fibonacci series");
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+"");
            c=a+b;
            a=b;
            b=c;

        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of terms");
        sc.close();
        int n=sc.nextInt();
        Fibonacci obj=new Fibonacci(n);
        obj.series();
    }
}