import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int f=a/100;
      int l=a%10;
      System.out.println(f+l);
	}
}