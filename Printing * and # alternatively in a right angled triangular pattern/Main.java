import java.util.Scanner;
class Main { 
	public static void main(String[] args){
   Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int x=0;
     for(int i=0;i<n;i++)
    {
    for(int j=0;j<=i;j++)
    {
     if(x==0)
     {System.out.print("*");x=1;}
      else if(x==1)
        {System.out.print("#");x=0;}
    }
       System.out.println("");
    }
 
    }
}