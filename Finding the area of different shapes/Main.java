import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
      int c=in.nextInt();int a,b;
    switch(c)
    {
      case 1: a=in.nextInt();System.out.println(a*a);break;
      case 2: a=in.nextInt();b=in.nextInt();System.out.println(a*b);break; 
      case 3: a=in.nextInt();b=in.nextInt();System.out.println(0.5*a*b);break; 

      case 4: a=in.nextInt();System.out.println(3.14*a*a);break;
    }
    }
}