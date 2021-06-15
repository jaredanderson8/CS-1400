//import the necessary tools
import java.util.*;

//declare class
public class Mission8Anderson {
	//declare main method
	public static void main (String[] args)
	{
      //Start scanning for user input
		Scanner in = new Scanner (System.in);
      
      //create storage variables used for input and output
      double height  = 0;
      double weight = 0;
      double bmi = 0;
      
      //creat error variable
      boolean error = false;
      
      //prompt user
      System.out.println("Enter height in inches:");
      
      //loop test for errors in height
      do 
      {
         //test for errors
         try
         {
            //reset error value
            error = false;
           
            //recieve input
            height = in.nextDouble();
         }
         //error: text was entered
         catch (InputMismatchException e)
         {
            //set error var to true
            error = true;
            
            //prompt user
            System.out.println("Invalid inches value. Must be a number.");
            System.out.println("Re-enter height in inches:");
         }
         if (height <= 0 && error == false)
         {
            //set error var to true
            error = true;
            
            //prompt user
            System.out.println("Invalid inches value. Must be positive");
            System.out.println("Re-enter height in inches:");
         }
            //flush the buffer
            in.nextLine();
      }
      while (error);
      
      //prompt user
      System.out.println("Enter weight in pounds:");
      
      //loop test for errors in weight
      do 
      {
         //test for errors
         try
         {
            //reset error value
            error = false;
           
            //recieve input
            weight = in.nextDouble();
         }
         
         //error: text was entered
         catch (InputMismatchException e)
         {
            //set error var to true
            error = true;
            
            //prompt user
            System.out.println("Invalid pounds value. Must be a number.");  
            System.out.println("Re-enter weight in pounds:");
         }
         
         if (weight <= 0 && error == false)
         {
            //set error var to true
            error = true;
            
            //prompt user
            System.out.println("Invalid pounds value. Must be positive");
            System.out.println("Re-enter weight in pounds:");
         }
         
         //flush the buffer
         in.nextLine(); 
      }
      while (error);
      
      //prompt user
      System.out.println("Height = " + height + "\"");
      System.out.println("Weight = " + weight + " pounds");
      
      //calculate BMI
      height = height * height;
      weight = weight * 704;
      bmi = weight/height;
      
      //prompt user
      System.out.println("Body mass index = " + bmi);
      
      
   }
}