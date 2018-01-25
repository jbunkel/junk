package day4;

import java.util.Scanner;

/**
 * Created by n0076647 on 1/25/2018.
 */
public class Factorizor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int numberOfFactors = 0;
        int perfectNumberSum = 0;

        do {
            System.out.println("What number would you like to factor");
            userInput = scanner.nextInt();

            if (userInput <= 0){
                System.out.println("Number must be greater than zero.");
            }
        } while (userInput <= 0);

        System.out.println("The factors of " + userInput + " are:");

        for (int i = 1; i<userInput;i++){
            if (userInput % i == 0) {
                perfectNumberSum += i;
                numberOfFactors++;
                System.out.println(i);
            }
        }

        if (userInput == perfectNumberSum) {
            System.out.println(userInput  + " is a perfect number.");
        } else {
            System.out.println(userInput + " is not a perfect number.");
        }

        if (numberOfFactors == 1) {
            System.out.println(userInput + " is a prime number");
        } else {
            System.out.println(userInput + " is not a prime number");
        }
    }
}
