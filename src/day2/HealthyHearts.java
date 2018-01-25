package day2;

import java.util.Scanner;

/**
 * Created by n0076647 on 1/23/2018.
 */
public class HealthyHearts {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int age;
        int maxRate;
        double lowerBeat;
        double higherBeat;

        System.out.println("What is your age?");
        age = inputReader.nextInt();
        maxRate = 200- age;


        System.out.println("Your maximum heart rate should be " + maxRate + " beats per minute");
        System.out.println("Your target HR Zone is "+maxRate * .5 +" - " + maxRate * .85 +" beats per minute");


    }
}
