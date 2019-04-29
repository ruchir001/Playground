import java.util.Scanner;
class Main{
  public static int search(int a[],int n,int b)
  {
    for(int i=0;i<n;i++)
      if(a[i]==b)
        return i;
    return -1;
  }
  public static void main(String args[]){
Scanner in =new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int x=in.nextInt();
    int y=in.nextInt();
    System.out.println(search(a,n,x));
    System.out.println(search(a,n,y));
    
    }
}