import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
for(int i=0;i<n;i++)
  System.out.print("*");
System.out.println();
for(int i=0;i<n-2;i++)
{
System.out.print("*");
for(int j=0;j<n-2;j++)
System.out.print(" ");
  System.out.print("*");
 System.out.println(); 
}
for(int i=0;i<n;i++)
  System.out.print("*");
      
    }}