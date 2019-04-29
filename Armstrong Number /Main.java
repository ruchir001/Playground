import java.util.Scanner;
import java.math.*;
class Main{
	public static void main (String[] args){
Scanner in=new Scanner(System.in);
      String n=in.next();
     int l=n.length();
      double s=0;
      for(int i=0;i<l;i++)
      {
      s=s+Math.pow((n.charAt(i)-'0'),l);
      }
      int nn=Integer.parseInt(n);
      if(s==nn)
      System.out.println("Armstrong Number");
      else
System.out.println("Not a Armstrong Number");
      
    }
}