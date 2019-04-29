import java.util.*;
class Main{
    public static void main(String args[])
    {
 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      StringBuilder s=new StringBuilder(Arrays.toString(a));
      s.deleteCharAt(0);      s.deleteCharAt(s.length()-1);
      for(int i=0;i<s.length();i++)
      {if(s.charAt(i)==' ')
        s.deleteCharAt(i);
      }
      StringBuilder s1=new StringBuilder(s);
      s1.reverse(); 
      if(s.toString().equals(s1.toString()))
        System.out.println("Yes");
      else System.out.println("No");
    }
}