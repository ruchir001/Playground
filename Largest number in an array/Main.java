import java.util.Scanner;
class Main{
    public static void main(String args[]){
  Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
      int max=0;
    for(int i=0;i<n;i++)
    {a[i]=in.nextInt();if(a[i]>max) max=a[i];}
      System.out.println(max);
    }
}