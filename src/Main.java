
/*
*
*/
import java.util.Random;
import java.util.Scanner;
public class Main {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);

            //inform that random number guss by people
            Random random = new Random();
            long from = 1;
            long to = 100;
            int randomNumber = random.nextInt(int) (to - from + 1) + from;
            //intiate  the number guess by people
            int guessedNumber = 0;

            //give a two boundary of number
            System.out.printf("The number is between %d and %d.\n", from, to);

            //evaluate number and say its too high and its too long until u got good guss
            do
            {
                System.out.print("Guess what the number is: ");
                guessedNumber = scan.nextInt();
                if (guessedNumber > randomNumber)
                    System.out.println("Your guess is too high!");
                else if (guessedNumber < randomNumber)
                    System.out.println("Your guess is too low!");
                else
                    System.out.println("You got it!");
            } while (guessedNumber != randomNumber);
        }
    }

