import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 Scanner in=new Scanner(System.in);
    int n=in.nextInt();int x=0,max=0,a;
    for(int i=0;i<n;i++)
    {
      a=in.nextInt();
      if(a>max)
      {max=a;x=i;}
    }
    System.out.print(x);
  }
}