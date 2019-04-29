import java.util.*;
class Main
{
  public static void main(String args[])
  {
  Scanner in=new Scanner(System.in);
    int a=in.nextInt();int n=1;
    
    if(a<0){System.out.print("-");a=-a;}
    int ax=a;
    while(ax>1)
    {
      ax=ax/10;n++;
    }
    char str[]=new char[n];
    for(int i=n-1;i>=0;i--)
    {
      str[i]=(char)(a%10+'0');
      a=a/10;
    }
     for(int i=0;i<n;i++)
    System.out.print(str[i]);
  }
}