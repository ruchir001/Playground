import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
      String x=in.nextLine();
      String y=in.nextLine();
      int n=in.nextInt();String arr[]=y.split(" ",n);
    for(int i=0;i<arr.length;i++)
      System.out.println(arr[i]);
    }
}