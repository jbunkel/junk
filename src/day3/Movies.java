package day3;

import java.util.Scanner;

/**
 * Created by n0076647 on 1/24/2018.
 */
public class Movies {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int yearBorn;
        String userName;
        boolean firstLineDone = false;

        System.out.println("Hey, let's play a game! What's your name?");
        userName = inputReader.next();

        System.out.println("Hi " + userName + ", when were you born?");
        yearBorn = inputReader.nextInt();

        System.out.println("well " + userName);

        if (yearBorn < 2005) {
            System.out.println("Did you know that Pixar's Up");
        }
        if (yearBorn < 1995) {
            System.out.println("and that Harry Potter");
        }
        if (yearBorn < 1985) {
            System.out.println("and that Space Jam");
        }
        if (yearBorn < 1975) {
            System.out.println("and that Jurassic Park");
        }
        if (yearBorn < 1965) {
            System.out.println("and that MASH");
        }

    }
}
