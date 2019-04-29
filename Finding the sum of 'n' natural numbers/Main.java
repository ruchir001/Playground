import java.util.*;
class Main
{
  public static int fact(int n)
  {
  if(n==1)
    return 1;
    else
      return (n+fact(n-1));
  }
  public static void main(String args[])
  {
  Scanner in=new Scanner(System.in);
    System.out.println(fact(in.nextInt()));
  }
}