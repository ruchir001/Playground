import java.util.Scanner;
class Main{
    public static void main(String args[]) {
  Scanner in=new Scanner(System.in);
      String str=in.next();
      StringBuffer str2=new StringBuffer(str);str2.reverse();
     // System.out.print(str+" "+str2);
      if(str.equals(str2.toString()))
        System.out.print("Yes");
      else
        System.out.print("No");
    } 
}