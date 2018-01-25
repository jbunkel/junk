package day2;

import java.util.Scanner;

/**
 * Created by n0076647 on 1/23/2018.
 */
public class DoItBetter {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int miles, hotdogs, languages;

        System.out.println("How many miles can you run?");
        miles = inputReader.nextInt();
        System.out.println("Oh!  Well I can run " + ((miles * 2) + 1));

        System.out.println("\nHow many hotdogs can you eat?");
        hotdogs = inputReader.nextInt();
        System.out.println("Oh!  Well I can eat " + ((hotdogs * 2) + 1));

        System.out.println("\nHow many languages can you speak?");
        languages = inputReader.nextInt();
        System.out.println("Oh!  Well I can speak " + ((languages * 2) + 1));

    }
}
