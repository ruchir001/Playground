import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  Scanner in=new Scanner(System.in);
    String s=in.nextLine();int count=0;
    for(int i=0;i<s.length();i++)
      if(s.charAt(i)==' ')
        count++;
    String a[]=s.split(" ",count+1);
    StringBuffer arr[]=new StringBuffer[count+1];
    for(int i=0;i<a.length;i++)
      arr[i]=new StringBuffer(a[i]);
    
    for(int i=0;i<arr.length;i++)
    {
    for(int k=i+1;k<arr.length;k++)
    {
    if(arr[k].toString().equals(arr[i].toString()))
      arr[k]=new StringBuffer(" ");
    }
    }
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i].toString().equals(" "))
        continue;
      System.out.print(arr[i]+" ");
    }
    }
}