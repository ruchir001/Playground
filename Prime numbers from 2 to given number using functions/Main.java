import java.util.*;
class Main
{
  public static boolean prime(int a)
  {
    int fl=1;
  for(int i=2;i<a;i++)
    if(a%i==0) {return(false); }
    return(true);
  }
public static void main(String arr[])
{
  Scanner in=new Scanner(System.in);
      int n=in.nextInt();
  for(int i=2;i<=n;i++)
    if(prime(i))
  System.out.println(i);

}
}