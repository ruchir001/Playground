import java.util.Scanner;
class Main{
	public static void main (String[] args){
Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      
          System.out.println(1);
      for(int i=2;i<=n/2;i++)
      {
        if(n%i==0)
          System.out.println(i);
      }
      
          System.out.println(n);
    }
}