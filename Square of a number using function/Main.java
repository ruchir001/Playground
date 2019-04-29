import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    return(num*num);
  }
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(square(n));

    } 
}