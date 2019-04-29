import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
   Scanner in=new Scanner(System.in);
      int r=in.nextInt();
      int c=in.nextInt();
      int p,n;
    for(int i=r;i>=1;i--)
    {
      p=1;n=i;
      for(int x=r;x>i;x--)
      {System.out.print(x);p++;}
      for(int j=0;j<n;j++)
      {System.out.print(n);p++;}
      n--;
    
    System.out.println();
    }
    
    
    }
}