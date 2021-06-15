//import the scanner tool
import java.util.Scanner;
//declare class
public class Mission02Anderson{ 

   //declare main method
   public static void main (String[] args)
   {
      //Start scanning for user input
      Scanner in = new Scanner (System.in);
      //declare variable for the user's destinatio
      String des = ""; 
      //declare variable for the amount of miles
      double miles = 0.0;
      //declare variable for the speed limit
      double speed = 0.0;
      //declare variable for how much over the speed limit the user will go
      double over = 0.0; 
      //declare variable for how much time it will take the user going the speed limit to his destination
      double min = 0.0;
      //declare variable for how much time it will take the user going over the speed limit to his destination
      double minOver = 0.0;
      //declare variable for the minuets the user will save going over the speed limit
      double minSaved = 0.0;
      
      //prompt for input
      System.out.println("Please enter your destination:");
      //store user input in variable des
      des = in.nextLine();
      
      //prompt for input
      System.out.println("How many miles is it to " + des + "?:");
      //store user input in variable miles
      miles = in.nextDouble();
      
      //prompt for input
      System.out.println("What is the speed limit?:");
      //store user input in variable speed
      speed = in.nextDouble();
      
      //prompt for input
      System.out.println("How fast do you plan on driving over the speed limit (in mph ?:)");
      //store user input in variable over
      over = in.nextDouble();
      
      //Math it up
      //find the time in hours it will take going the speed limit
      min = miles / speed;
      //find the time in hours it will take going over the speed limit
      minOver = miles / (speed + over);
      //find the difference
      minSaved = min - minOver;
      
      //change hours into minuets
      min = min * 60;
      minOver = minOver * 60;
      minSaved = minSaved * 60;
      
      //read out the info to the user
      System.out.println("Time to " + des + " going the speed limit: " + min + " minutes");
      System.out.println("Time to " + des + " going " + over + " mph over the speed limit: " + minOver + " minutes");
      System.out.println("You will arrive in " + des + " " + minSaved + " minutes faster by driving " + over + " mph over the speed limit.");
      
   }
}