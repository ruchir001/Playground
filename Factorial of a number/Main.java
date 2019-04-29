import java.util.Scanner;
import java.math.*;
class Main{
	public static void main (String[] args){
Scanner in=new Scanner(System.in);
     int n=in.nextInt();
      int s=1;
      for(int i=2;i<=n;i++)
      {
      s=s*i;
      }
      System.out.println(s);
    }
}