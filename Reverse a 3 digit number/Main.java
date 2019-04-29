import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 		Scanner s=new Scanner(System.in);
      int a=s.nextInt();
  while(a>1)
  {
  System.out.print(a%10);
    a=a/10;
  }
  }
}