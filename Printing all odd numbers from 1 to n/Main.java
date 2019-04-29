import java.util.Scanner;
class Main {
	public static void main (String[] args){
Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      for(int i=0;i<=n/2;i++)
      {
        if((2*i+1)<=n)
      System.out.println(2*i+1);
      }
    }
}