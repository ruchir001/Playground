import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int flag=1;
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int x=a[0]+a[1]+a[2];
    for(int i=3;i<n;i+=3)
    {
      if((a[i]+a[i+1]+a[i+2])!=x)
      {flag=0;break;}
    }
    if(flag==1)
      System.out.println("Perfect Batch");
    else 
      System.out.println("Not a Perfect Batch");
  }
}