import java.util.*;
class Main
{
  public static void main(String args[])
  {
 Scanner in=new Scanner(System.in);
    String s=in.next();
    double d=0.0;int n=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='.') break;
      n++;
    }int j=0;
   for(int i=n;i>0;i--)
   {
     d=d+Math.pow(10,i-1)*(s.charAt(j)-'0');j++ ;  }
    if(n!=s.length())
    {
      j=1;
      for(int i=n+1;i<s.length();i++)
      {
            d=d+Math.pow(0.1,j)*(s.charAt(i)-'0');j++ ; 
      }
    }
    System.out.printf("%.6f",d);
  }
}