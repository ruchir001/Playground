import java.util.*;
class Main
{
  public static void main(String args[])
  {
 Scanner in=new Scanner(System.in);
    int n=in.nextInt();int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int cmx=0,c=a[0];
    for(int i=1;i<n;i++)
    {
    if(a[i]>a[i-1])
    {  c=c+a[i]; if(c>cmx) cmx=c;}
     else
     {
       c=a[i];
     }
    }
    System.out.println(cmx);
  }
}