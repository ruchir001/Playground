import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in=new Scanner(System.in);
    int n=in.nextInt();int a[]=new int[n];boolean flag=true;
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    for(int i=0;i<n;i++)
    {
    for(int j=i+1;j<n;j++)
    {
    if(a[j]>a[i])
    {
      flag=true;
      for(int k=i+1;k<j;k++)
        if(a[k]>a[j])
          flag=false;
      if(flag)
      System.out.println(a[i]+","+a[j]);
    
    }}
    }
  }
}