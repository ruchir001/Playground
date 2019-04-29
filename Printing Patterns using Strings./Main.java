import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 Scanner in=new Scanner(System.in); 
  String s=in.next();
    int n=s.length();int j=0;
    for(int i=0;i<n;i++)
    {
    for(j=0;j<n-i-1;j++)
    System.out.print(" ");
      j=n/2;
      for(int k=0;k<=i;k++)
      {
      System.out.print(s.charAt(j));
        j++;
        if(j==n)
          j=0;
      }
      System.out.println("");
    }
  }
}