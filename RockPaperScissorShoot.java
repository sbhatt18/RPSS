/*
 * Name:Shivang Bhatt
 * Date: 10/2/19
 * Program Description: This is a Rock Paper Scissor Game, enter 1,2,3 for respective inputs 
 * and play game against computer
 */
package cs1;
import java.util.Scanner;//importing scanner class for input -SB

public class RockPaperScissorShoot {//creating class -SB
    public static void main (String [] args) {//creating main method -SB
 
        int number, guess;//Defining variables as an int datatype -SB
        number = (int) (Math.random() * 3);//multiplying Math.random by 3 so user gets whole #'s and setting it equal to number variable -SB
        Scanner input = new Scanner(System.in);//allows the user to read values from system.in -SB
 
        System.out.println("Rock Paper Scissor." +  "\nEnter 0 for scissor, 1 for rock or 2 for paper: ");//asking user to enter input for program -SB
        System.out.println("----------------------------------------------------------------------------");//Println for separation -SB
        guess = input.nextInt();
        
        if (number == 0) //if number = 0 than do following condition below in the block -SB
        	{//opening block -SB
        		System.out.println("User enters " + guess);// prints user enters + respective input -SB
        	}//closing block -SB 
        
        if (number == 1)//if number = 1 than do following condition below in the block -SB
        	{//opening block -SB
        		System.out.println("User enters " + guess);
        	}//closing block -SB
        
        else if (number == 2)//if number = 2 than do following condition below in the block -SB
          	{//opening block -SB
        		System.out.println("User enters " + guess);
        	}//closing block -SB
 
        if (number == 0 && guess == 0)//if number and guess = 0 than output following println statement -SB
            System.out.println("The computer is Scissors. You are Scissors too. It is a draw.");//print following in console if above condition is true -SB 
        if (number == 0 && guess == 1)//if number = 0 and guess = 1 than output following println statement -SB
            System.out.println("The computer is Scissors. You are Rock. You won.");//print following in console if above condition is true -SB 
        if (number == 0 && guess == 2)//if number = 0 and guess = 2 than output following println statement -SB
            System.out.println("The computer is Scissors. You are Paper. You lose.");//print following in console if above condition is true -SB 
        if (number == 1 && guess == 0)//if number = 1 and guess = 0 than output following println statement -SB
            System.out.println("The computer is Rock. You are Scissors. You lose.");//print following in console if above condition is true -SB 
        if (number == 1 && guess == 1)//if number = 1 and guess = 1 than output following println statement -SB
            System.out.println("The computer is Rock. You are Rock too. It is a draw.");//print following in console if above condition is true -SB 
        if (number == 1 && guess == 2)//if number = 1 and guess = 2 than output following println statement -SB
            System.out.println("The computer is Rock. You are Paper. You won.");//print following in console if above condition is true -SB 
        if (number == 2 && guess == 0)//if number = 2 and guess = 0 than output following println statement -SB
            System.out.println("The computer is Paper. You are Scissors. You won.");//print following in console if above condition is true -SB 
        if (number == 2 && guess == 1)//if number = 2 and guess = 1 than output following println statement -SB
            System.out.println("The computer is Paper. You are Rock. You lose.");//print following in console if above condition is true -SB 
        if (number == 2 && guess == 2)//if number = 2 and guess = 2 than output following println statement -SB
            System.out.println("The computer is Paper. You are Paper too. It is a draw.");//print following in console if above condition is true -SB 
        
    }//closing main method -SB
}//closing class -SB