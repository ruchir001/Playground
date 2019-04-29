import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
 Scanner in=new Scanner(System.in);
    StringBuffer s=new StringBuffer(in.nextLine());
    String s1=in.next();
    for(int i=0;i<s1.length();i++)
    {
    for(int j=0;j<s.length();j++)
    {
    if(s.charAt(j)==s1.charAt(i))
      s.deleteCharAt(j);
    }
    }
    System.out.println(s);
  }
}