import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int p=in.nextInt();
      int i=1,s=1;
      while(i<=p)
      {
      s=s*n;i++;
      }
      System.out.println(s);
    }
}