import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
 Scanner in=new Scanner(System.in);
      char c=in.next().charAt(0);char a;
int k=in.nextInt();
      if(c>='A'&&c<='Z')
      {
        if(c-k<'A')
          c=(char)('Z'-(k-(c-'A')));
      else
        c=(char)(c-k);
      }
      else
      {
         if(c-k<='a')
          c=(char)('z'-(k-(c-'a'))+1);
      else
        c=(char)(c-k);
      
      }
      System.out.println(c);
      }
}