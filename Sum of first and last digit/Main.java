import java.util.Scanner;
class Main {
	public static void main (String[] args){
Scanner in=new Scanner(System.in);
      String a=in.next();
      int n=a.length();
      System.out.println(a.charAt(0)-'0'+a.charAt(n-1)-'0');
      
    }
}