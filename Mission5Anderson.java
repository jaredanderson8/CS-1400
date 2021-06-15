//import the necessary tools
import java.util.Scanner;
import java.util.Random;

//declare class
public class Mission5Anderson {
	//declare main method
	public static void main (String[] args)
	{

		//Start scanning for user input
		Scanner in = new Scanner (System.in);
		//create a random number generator
	    Random r = new Random();
	      
		//create variable to store the user's throw
		String user = " ";
		//create variables to store the computer's throw
		int comp = 0;
		String compOut = " ";
		
		//declare variable for number of total rounds to be played
		int totalRounds = 0;
		//declare variable for number of total rounds played
		int rounds = 0;
		//variable for user wins
		int wins = 0;
		//variable for computer wins
		int compWins = 0;
		//trash variable
		String trash = " ";
		
		//temp variable
		boolean t = false;
	
		//prompt user
		System.out.println("Welcome to Rock, Paper, Scissors!");
		//System.out.println("Please Enter an odd number of rounds you would like to play:");
		
		
		// 
		//ask for number of rounds again if the user put in a even number
		while (t == false) 
		{ 	
			//store the users input as a number of rounds
			System.out.println("Please Enter an odd number of rounds you would like to play:");
			totalRounds = in.nextInt();
			if ((totalRounds % 2) == 0 || totalRounds < 1)
			{
				System.out.println("Sorry, you need to enter an odd number. Please try again:");
			}
			else
			{
				t = true;
			}
		}
		//clear buffer
		trash = in.nextLine();
		// conduct multiple rounds until total rounds is equal to the total rounds
		while (rounds != totalRounds)
		{
			//prompt user
			System.out.println("Rock, Paper, or Scissors?:");
			user = in.nextLine();
			
			//check if the user's input is valid
			if (user.equalsIgnoreCase("Rock") || user.equalsIgnoreCase("Paper") || user.equalsIgnoreCase("Scissors"))
			{
				//generate throw for the computer
				comp = r.nextInt(3);
				
				//convert randomly generated numbers into rock, paper, or scissors
				if (comp == 0)
				{
					compOut = "Rock";
				}
				else if (comp == 1)
				{
					compOut = "Paper";
				}
				else if (comp == 2)
				{
					compOut = "Scissors";
				}
				else
				{
					System.out.println("Error: rnd sucks");
					break;
				}
				System.out.print("Computer Chooses " + compOut + ".");
				
				//check for user win
				if ((user.equalsIgnoreCase("Rock") && comp == 2) || (user.equalsIgnoreCase("Paper") && comp == 0) || (user.equalsIgnoreCase("Scissors") && comp == 1))
				{
					//prompt user
					System.out.println("   You Win!");
					//increase number of user wins and rounds
					wins++;
					rounds++;
				}
				//check for computer win
				else if ((user.equalsIgnoreCase("Rock") && comp == 1) || (user.equalsIgnoreCase("Paper") && comp == 2) || (user.equalsIgnoreCase("Scissors") && comp == 0))
				{
					//prompt user
					System.out.println("   You Lose.");
					//increase number of computer wins and rounds
					compWins++;
					rounds++;
				}
				//else it must be a tie
				else
				{
					//prompt user
					System.out.println("   It's a tie.");
				}	
				
			}
			else
			{
				//prompt user
				System.out.println("Sorry, '" + user + "' is not a valid entry.");
			}
		}
		//print out results
		System.out.println("User wins: " + wins);
		System.out.println("Computer wins: " + compWins);
		if (wins > compWins)
		{
			System.out.println("You won the Game!");
		}
		else if (compWins > wins)
		{
			System.out.println("The Computer won the Game!");
		}
		else
		{
			System.out.println("Error: Some how you tied with the computer");
		}
	}
	
}
