import java.util.Scanner;
class Main{
    public static void main(String args[]) {
 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int v=in.nextInt();
      for(int i=0;i<n-1;i++){
        for(int j=i+1;j<n;j++){
          if(a[i]+a[j]==v)
            System.out.println(a[i]+", "+a[j]);
        }}
    }
}