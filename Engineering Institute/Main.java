//import required packages
import java.util.*;
class Faculty
{
  public int sal;
  Faculty(int x)
  {sal=x;}
  public void salary()
  {
 System.out.println("Base Salary: "+sal);   //write your Faculty class statements
  }
}
class CSE extends Faculty
{
public CSE(int x)
{
super(x);
}
  public void salary()
  {
  sal=sal+3000;
    System.out.println("CSE Faculty: "+sal);
  }
}
class IT extends Faculty
{
  public IT(int x)
{
super(x);
}
  public void salary()
  {
  sal=sal+5000;
    System.out.println("IT Faculty: "+sal);
  }
}
class ECE extends Faculty
{
 public ECE(int x)
{
super(x);
}
  public void salary()
  {
  sal=sal+4500;
    System.out.println("ECE Faculty: "+sal);
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    ECE e = new ECE(n);
    CSE c=new CSE(n);
    IT i=new IT(n);
    Faculty f=new Faculty(n);
    f.salary();c.salary();i.salary();e.salary();
    //implement your required concept here
  }
}