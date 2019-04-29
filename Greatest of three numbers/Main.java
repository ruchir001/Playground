import java.util.Scanner;
class Main {
	public static void main (String[] args) {
Scanner s=new Scanner(System.in);
    int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      int ans=0;
      if(a>b&&a>c)
        ans=a;
      if(b>a&&b>c)
        ans=b;
      if(c>a&&c>b)
        ans=c;
      System.out.println(ans);
    }
}