import java.util.Scanner;
public class Game
{
    public static void main(String args[])
    {
        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);          
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome user to  Guess Number Game \nYou Will Be Ask To Guess A Number To Win The Game \nYou have Maximum 5 Attemp Limit");
        do {
            System.out.print("Enter a guess number between 1 to 100\n");
            if(userInput.hasNextInt()) {
                userGuessNumber = userInput.nextInt();
                if (userGuessNumber == secretNumber)
                {    
                    System.out.println(" Wow!, Your Number is Correct. You Win the Game!");
                    break;
                }
                else if (userGuessNumber < secretNumber)
                    System.out.println("Oops! Your  Guess Number is too small.");
                else if (userGuessNumber > secretNumber)
                    System.out.println(" Ooh! Your Guess Number is too Big.");
                if(attempt == 5) {
                    System.out.println("You have crossed  maximum attempt. Attempt it  Again");
                    break;
                }
                attempt++;
            }else {
                System.out.println("Enter a Valid Integer Number");
                break;
            }
        } while (userGuessNumber != secretNumber);
    }
}