import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int j,k;
      for(int i=0;i<=n/2;i++)
      {
        for(j=0;j<i;j++)
          System.out.print(" ");
        System.out.print("*");
        for(k=j;k<n-i-2;k++)
          System.out.print(" ");
        if(i!=n/2)
        System.out.print("*");
        
        System.out.println("");
      }
  for(int i=n/2+1;i<n;i++)
      {
        for(j=0;j<n-i-1;j++)
          System.out.print(" ");
        System.out.print("*");
        for(k=j;k<i-1;k++)
          System.out.print(" ");
        System.out.print("*");
        
        System.out.println("");
      }
      }
}