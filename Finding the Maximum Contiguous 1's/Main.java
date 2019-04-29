import java.util.*;
class Main
{
  public static void main(String args[])
  {
 Scanner in=new Scanner(System.in);
    int n=in.nextInt();int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int cmx=0,c=0;
    if(a[0]==1) c=1; 
    for(int i=1;i<n;i++)
    {
      if(a[i]==1&&a[i-1]==1)
      {
        c=c+1;if(c>cmx) cmx=c;
      }
      else 
        c=0;
      
    } System.out.println(cmx);
  }
}