class add
{
    int a,b;
    void displaySum()
    {
    int sum=a+b;
    System.out.println("Sum="+sum);
    }
    public static void main(String[] args) {
        add obj=new add();
        
            obj.a=10;
            obj.b=20;
            obj.displaySum();
        
    }
}