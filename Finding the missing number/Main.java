import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];int x=0,sum=0;Boolean flag;
      for(int i=0;i<n;i++)
      {
        x=in.nextInt();
        flag=true;
        for(int j=0;j<i;j++)
        {
          if(a[j]==x)
       flag=false;
        }
       if(flag){ a[i]=x; 
        sum=sum+a[i];}
      }
      System.out.println(((n*(n+1))/2)-sum);
    }
}