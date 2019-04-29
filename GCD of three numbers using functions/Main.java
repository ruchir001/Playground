import java.util.Scanner;
public class Main{
public static int small(int a,int b,int c)
{
 	if(a<b&&a<c)
        return a;
      if(b<a&&b<c)
        return b;
      if(c<a&&c<b)
        return c;
return(0);
}
  public static void main (String[] args)
	{
Scanner s=new Scanner(System.in);
    int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
    int x=small(a,b,c);
    int max=1;
    for(int i=2;i<=x;i++)
    {
    if(a%i==0&&b%i==0&&c%i==0)
      max=i;
    }
    System.out.println(max);
    }
}