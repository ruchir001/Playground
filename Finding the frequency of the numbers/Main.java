import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
 Scanner in=new Scanner(System.in);
      int n=in.nextInt();int a[]=new int[n];int t;
      int k=in.nextInt();
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      for(int i=0;i<n;i++)
      {
      for(int j=i+1;j<n;j++)
      {
      if(a[j]<a[i])
      {
        t=a[j];
        a[j]=a[i];a[i]=t;
      }
      
      }
      }
      int j=0,count=0;
      for(int i=1;i<=k;i++)
      {
       if(j>=n) {System.out.println(i+" 0");continue;} 
      if(a[j]!=i)
      {System.out.println(i+" 0");continue;}
       count=1;
        for(int x=j+1;x<n;x++)
        {
          
          if(a[x]==a[j]) {count++;}
          else break;
        }j=j+count;
      System.out.println(i+" "+count);
      }
    }   
}