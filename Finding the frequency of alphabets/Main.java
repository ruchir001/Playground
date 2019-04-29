import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
  Scanner in=new Scanner(System.in);
      StringBuffer s=new StringBuffer(in.next().toLowerCase());
      
      for(int i=0;i<s.length();i++)
      {
        int count=1;
      for(int j=i+1;j<s.length();j++)
      {
      if(s.charAt(i)==s.charAt(j))
      {count++; s.delete(j,j+1);}
        
      }System.out.print(""+s.charAt(i)+count+" ");
      }
    }
}