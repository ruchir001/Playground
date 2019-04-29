import java.util.Scanner;
class Main{
  public static void main(String args[]) {
Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String str2=in.next();
    int count=0,i=0;
   
    for(i=0;i<str.length();i++)
    {
    if((str.substring(i)).startsWith(str2))
    {count++;}
    }
    System.out.println(count);  
  } 
}