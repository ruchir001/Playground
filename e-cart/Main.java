//import required packages here
import java.util.*;
class Item
{
  int price;
  public Item(int a)
  {price=a;}
  //create various method to return attribute value(s)
}
   
class Customer extends Item
{
  String product;
  int quantity;
  public Customer(String a,int b,int c)
  {
  super(c);
  product=a;quantity=b;
  }
  //create various method to return attribute value(s)
}

class Bill extends Customer
{
  public Bill(String a,int b,int c)
  {
  super(a,b,c);
  System.out.println("Total Price is : "+price*quantity);
  }
  //implement your logic to calculate total price
}
class Main
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    String x=in.nextLine(); int y=in.nextInt();int z=in.nextInt();
    Bill obj = new Bill(x,y,z);
    //write the logic here
  }
}