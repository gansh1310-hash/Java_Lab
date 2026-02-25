import java.util.*;
class swap
{
    int a,b;
    swap(int x,int y)
    {
    a=x;
    b=y;
    }

void swap()
{
int temp=a;
a=b;
b=temp;
}
void display()
{
    System.out.println("swap two numbers");
}

public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.print("enter two numbers");
    sc.close();
    int x=sc.nextInt();
    int y=sc.nextInt();
    swap obj=new swap(x,y);
    System.out.println("Before swapping");
    obj.display();
    obj.swap();
    System.out.println("after swapping");
    obj.display();
}
}