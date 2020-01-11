package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	cal.calculateCalories(bread);//call the function which calculate the calories for only bread
                       // 	System.out.println(cal.returnCalories());
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	cal.calculateCalories(bread,jam);//call the function which calculate the calories for only bread & jam
                        	//System.out.println(cal.returnCalories());
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	cal.calculateCalories(bread,jam,butter);//call the function which calculate the calories for  bread,jam & butter
                      //  	System.out.println(cal.returnCalories());
                        	break;
                        }
                        System.out.printf("%.3f",cal.calculateEnergy());
                      System.out.println(" kJ of energy generated from "+cal.returnCalories()+" calories");
            }
}
class Calories {
            int cal;
            int calculateCalories(int a) {
            	return cal=74*a;
            }
            int calculateCalories(int a,int b) {
            	return cal=74*a+26*b;
            }
            int calculateCalories(int a,int b,int c) {
            	return cal=74*a+26*b+102*c;
            }
            double calculateEnergy() {
            	return(cal*4.1868);
            }
            
            int returnCalories() {
            	return(cal);
            }
            
            
            
            
}