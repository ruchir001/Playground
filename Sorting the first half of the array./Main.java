import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner in=new Scanner(System.in);
    int n=in.nextInt();int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    for(int i=0;i<n/2;i++)
    {
    for(int j=i+1;j<n/2;j++)
    {
    if(a[j]<a[i])
    {
    int t=a[i];a[i]=a[j];a[j]=t;
    }
    }
    }
    for(int i=0;i<n;i++)
      System.out.print(a[i]+" ");    
  }
}