import java.util.Scanner;
class Main{
    public static void main(String args[]){
   		Scanner in=new Scanner(System.in);
      String s=in.nextLine().toLowerCase();
      int arr[]=new int[26];
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)==' ')
          continue;
      arr[s.charAt(i)-'a']=1;
      }
      for(int i=0;i<arr.length;i++)
      {
      if(arr[i]==0)
        System.out.print((char)('a'+i)+" ");
      }
       
    }
}