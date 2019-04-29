import java.util.Scanner;
class Main{
  public static int factorial(int n)
  {
    int s=1;
  for(int i=2;i<=n;i++)
    s=s*i;
    return(s);
  }
	public static void main (String[] args){
Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int x=n;
      int s=0;
      while(x>0)
      {
        s=s+factorial(x%10);
        x=x/10;
      }
      if(s==n)
        System.out.println("Yes");
      else
         System.out.println("No");
    }
}