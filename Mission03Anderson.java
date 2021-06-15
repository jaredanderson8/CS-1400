//import the scanner tool
import java.util.Scanner;
import java.util.Random;
//declare class
public class Mission03Anderson{ 

   //declare main method
   public static void main (String[] args)
   {
      //Start scanning for user input
      Scanner in = new Scanner (System.in);
      
      //create a random number generator
      Random r = new Random();
      
      //declare where the random number will be stored
      int theNumber = 0;
      //declare where the user's guess will be stored
      int guess = 0;
      //declare where the user's number of guesses will be stored
      int numberOfGuesses = 0;
      
      //store a random number in the variable theNumber and then add 1 
      theNumber = r.nextInt(100) + 1;
      
      //inform user
      System.out.println("Welcome to the Higher / Lower game! try to guess the number between 1 and 100.");
      //prompt for input
      
      while (guess != theNumber){
      
         System.out.println("Ener your Guess:");
         //store user input in guess
         guess = in.nextInt();
      
         //create different scenerios based on user input
         //if the guess in not a valid number
         if (guess < 1 || guess > 100)
         {
            //prompt user to try again
            System.out.println("Sorry, the gues needs to be a number between 1 and 100. please try a again:");
            
         }
         //if the guess is higher than the number but not higher than 100
         else if (guess > theNumber && guess <= 100)
         {
            System.out.println("The number is lower.");
            //increase the number of guesses
            numberOfGuesses++;
   
         }
         //if the guess is lower than the number but not lower than 1
         else if (guess < theNumber && guess >= 1)
            {
            System.out.println("The number is higher.");
            //increase the number of guesses
            numberOfGuesses++;
               
         } 
         //if the user guesses the number
         else if (guess == theNumber)
         {
            //increase the number of guesses
            numberOfGuesses++;
            //congradulate user
            System.out.println("The number was " + theNumber + "! You Guessed correctly! It took you " + numberOfGuesses + " tries." );           
            
         }
            
         //if the user somehow manages to enter a number not inluded above
         else 
         {
            System.out.println("what kind of number is that???");
              
         }
      }
      System.out.println("End");
   }
}
