package day3;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by n0076647 on 1/24/2018.
 */
public class LuckySevens {
    public static void main(String[] args) {
        int currentAmt, numberOfRolls, maxAmt, numberOfRollsAtMaxAmt, userInput;

        String userInputString;
        Scanner inputReader = new Scanner(System.in);

        do {
            System.out.println("How many dollars do you have?");
            userInputString = inputReader.nextLine();
            userInput = Integer.parseInt(userInputString);

            if (userInput < 1) {
                System.out.println("Starting bet must be 1 or greater");
            }
        } while (userInput < 1);

        currentAmt = userInput;
        maxAmt = userInput;
        numberOfRolls = 0;
        numberOfRollsAtMaxAmt = 0;

        while (currentAmt > 0) {
            //roll dice
            int diceOne, diceTwo, diceSum;
            Random randomGenerator = new Random();
            diceOne = randomGenerator.nextInt(6) + 1;
            diceTwo = randomGenerator.nextInt(6) + 1;
            diceSum = diceOne + diceTwo;

            numberOfRolls++;

            if (diceSum == 7) {
                currentAmt = currentAmt + 4;
            } else {
                currentAmt = currentAmt - 1;
            }

            if (currentAmt > maxAmt) {
                maxAmt = currentAmt;
                numberOfRollsAtMaxAmt = numberOfRolls;
            }
        }
        System.out.println("You are broke after " + numberOfRolls + " rolls.");

        System.out.println("You should have quit after " + numberOfRollsAtMaxAmt + " rolls when you had $" + maxAmt + ".");


    }
}
