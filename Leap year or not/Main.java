import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
int a=in.nextInt();
  int f=0;
    if(a%400==0) f=1;
        else if (a%100==0);
      else if (a%4==0)
        f=1;
      if(f==1)
      System.out.println("Leap year");
      else
      System.out.println("Non Leap year");
    }
}