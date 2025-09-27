import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random Randy = new Random();
    int randomValue = Randy.nextInt(10) + 1;
    int userValue = 0;
    boolean done = false;
    System.out.println("Enter a number [1-10]: ");
    do
    {
        if (in.hasNextInt())
        {
            userValue = in.nextInt();
            if (userValue >= 1 && userValue <= 10)
            {
                System.out.println("The number is " + randomValue + ".");
                if(userValue == randomValue)
                {
                    System.out.println("You're right on the money!");
                }
                else if(userValue > randomValue)
                {
                    System.out.println("You guessed too high.");
                }
                else // if their guess is lower than the random value
                {
                    System.out.println("You guessed too low.");
                }


                done = true;
            }
            else
            {
                int trash = in.nextInt();
                in.nextLine();
                System.out.println("You entered an incorrect value, '" + trash + "'. You must enter a number between 1 and 10 inclusive.");
            }
        }
        else if (in.hasNextDouble())
        {
            double doubleTrash = in.nextDouble();
            in.nextLine();
            System.out.println("You entered an incorrect value: " + doubleTrash);
        }
        else
        {
            String trash = in.nextLine();
            in.nextLine();
            System.out.println("You entered an incorrect value: " + trash);
        }

    } while(!done);
    }
}