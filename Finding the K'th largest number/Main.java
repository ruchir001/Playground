import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
 Scanner in=new Scanner(System.in);
      int n=in.nextInt();int a[]=new int[n];int t;
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      for(int i=0;i<n;i++)
      {
      for(int j=i+1;j<n;j++)
      {
      if(a[j]>a[i])
      {
        t=a[j];
        a[j]=a[i];a[i]=t;
      }
      
      }
      }
      int k=in.nextInt();
      System.out.println(a[k-1]);
    }   
}