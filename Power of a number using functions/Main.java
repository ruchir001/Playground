import java.util.*;
class Main
{
  public static double power(int a,int b)
  {
  return(Math.pow(a,b));
  }
public static void main(String arr[])
{
  Scanner in=new Scanner(System.in);
      int a=in.nextInt();
  int b=in.nextInt();
          
  System.out.println(power(a,b));

}
}