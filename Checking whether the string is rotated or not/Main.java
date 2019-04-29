import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
  Scanner in=new Scanner(System.in);
      String str=in.next();
      String s=in.next();
      str=str+str;
      if(str.contains(s))
        System.out.print("Yes");
      else
            System.out.print("No");

    }
}