import java.util.*;
class GradeSystem
{
    int per;

  GradeSystem(int p)
  {
    per =p;
  }
  void grade()
  {
if(per>=90)
System.out.println("Grade A");
else if(per>=80)
System.out.println("Grade B");
else if(per>=70)
System.out.println("Grade C");
else if(per>=60)
System.out.println("Grade D");
else if(per>=40)
System.out.println("Grade E");
else 
System.out.println("Grade F");
  }
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter percentage");
    sc.close();
    int p=sc.nextInt();
    GradeSystem obj=new GradeSystem(p);
    obj.grade();
    
}
  }
    
