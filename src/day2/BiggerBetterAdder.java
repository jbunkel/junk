package day2;

import java.util.Scanner;

/**
 * Created by n0076647 on 1/23/2018.
 */
public class BiggerBetterAdder {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        int curly;
        int moe;
        int larry;

        System.out.println("Enter curly number: ");
        curly = inputReader.nextInt();

        System.out.println("Enter moe number: ");
        moe = inputReader.nextInt();

        System.out.println("Enter larry number: ");
        larry = inputReader.nextInt();

        System.out.println("Curly: " + curly);
        System.out.println("Moe: " + moe);
        System.out.println("Larry: " + larry);

        int sum = curly + moe + larry;

        System.out.println("Sum: " + (sum + sum));


    }
}
