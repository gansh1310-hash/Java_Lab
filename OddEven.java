class OddEven
{
    int number;
    void check()
    {
        if(number%2==0)
        System.out.println(number + " is Even");
        else
        System.out.println(number + " is odd");
    }
    public static void main(String args[])
    {
        OddEven obj=new OddEven();
        obj.number=13;
        obj.check();
    }
}