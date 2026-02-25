import java.util.*;
class MaxofThree
{
    int a,b,c;

MaxofThree(int x,int y,int z)
{
    a=x;
    b=y;
    c=z;}
void findMax()
{
    if(a>b&&a>c)
    System.out.println("Maximum="+a);
    else if(b>a&&b>c)
    System.out.println("Maximum="+b);
    else 
    System.out.println("Maximum="+c);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter three number");
    sc.close();
     System.out.println("Enter first number");

    int x=sc.nextInt();
     System.out.println("Enter second number");
    int y=sc.nextInt();
     System.out.println("Enter third number");
    int z=sc.nextInt();
     MaxofThree obj=new MaxofThree(x,y,z);
    obj.findMax();
    
}
}

    
