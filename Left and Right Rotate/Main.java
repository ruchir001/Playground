import java.util.Scanner;
class Main 
{
  public static void rotate(int arr[],int n,int r,int x)
  {
    int t;
  if(x==0)//right
  {
    for(int j=0;j<r;j++){
    t=arr[n-1];
      for(int i=n-1;i>0;i--)
    {
    arr[i]=arr[i-1];
    }
      arr[0]=t;
    }
  }
    else
    {
    for(int j=0;j<r;j++){
    t=arr[0];
    for(int i=0;i<n-1;i++)
    {
    arr[i]=arr[i+1];
    }
      arr[n-1]=t;
    }
  
    }
  }
  public static void main(String args[])
    {
  Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    int oa[]=new int[n];int os=0;
    int ea[]=new int[n];int es=0;
    for(int i=0;i<n;i++)
    {a[i]=in.nextInt();
    if(i%2==0)
    {
      oa[os]=a[i];os++;
    }
      else
    {ea[es]=a[i];es++;}   
    }
    int  r=in.nextInt();
    rotate(oa,os,r,0);
    rotate(ea,es,r,1);int ej=0,oj=0;
    for(int i=0;i<n;i++)
    {
      if(i%2==0)
      {if(oj<os)
      {System.out.print(oa[oj]+" ");oj++;}}
      else
      {
        if(ej<es)
        {System.out.print(ea[ej]+" ");ej++;}
      }
    }
  }
}