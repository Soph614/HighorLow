import java.util.Scanner;
import java.util.Random;

public class HighorLow
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); // names the scanner
        Random Randy = new Random(); // names the randomizer
        int randomValue = Randy.nextInt(10) + 1; // gives a boundary for the randomizer to randomize within
        boolean done = false; // sets the done value to false


        do // all of this should be done WHILE done does NOT equal true...while user is beginning or has entered the wrong value
        {
            System.out.println("Enter a number [1-10]: "); // collects the initial input
            if (in.hasNextInt()) // the following should happen if the input is an integer value
            {
                int userValue = in.nextInt(); // puts the input into an integer, "userValue"
                in.nextLine();
                if (userValue >= 1 && userValue <= 10) // checking to see if the integer is between 1 and 10 inclusive
                {
                    done = true; // user entered a good input, they've done their job, done gets set to true.
                    System.out.println("The number is " + randomValue + "."); // tells the user what the random number is
                    if(userValue == randomValue) // checks for an exact match
                    {
                        System.out.println("You're right on the money!"); // tells the user they guessed correctly
                    }
                    else if(userValue > randomValue) // checks for a higher value
                    {
                        System.out.println("You guessed too high.");
                    }
                    else // if their guess is lower than the random value
                    {
                        System.out.println("You guessed too low.");
                    }
                }
                else // if it's an integer outside of 1 and 10 inclusive
                {
                    System.out.println("You entered an incorrect value, '" + userValue + "'. You must enter a number between 1 and 10 inclusive.");
                }
            }
            else if (in.hasNextDouble())
            {
                double doubleTrash = in.nextDouble();
                System.out.println("You entered an incorrect value: " + doubleTrash);
            }
            else
            {
                String trash = in.nextLine();
                System.out.println("You entered an incorrect value: '" + trash + "'");
            }
        } while(!done);
    }
}