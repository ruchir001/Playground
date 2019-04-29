import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
      String s=in.nextLine();int e=s.length();
    //  System.out.print(s.length());
      for(int i=s.length()-1;i>=0;i--)
      {
     //   System.out.print(s.charAt(i));
        if(s.charAt(i)==' ')
        {
        System.out.print(s.substring(i+1,e)+" ");e=i;
        }
          if(i==0)
        {
        System.out.print(s.substring(i,e));
        }
      }
    }
    
}