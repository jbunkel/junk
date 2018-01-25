package day2;

import java.util.Scanner;

/**
 * Created by n0076647 on 1/23/2018.
 */
public class AllTheTrivia {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        String size, planet1, planet2, element;

        System.out.println(" 1,024 Gigabytes is equal to one what? ");
        size = inputReader.next();

        System.out.println("In our solar system which is the only planet that rotates clockwise? ");
        planet1 = inputReader.next();

        System.out.println("The largest volcano ever discovered in our solar system is located on which planet? ");
        planet2 = inputReader.next();

        System.out.println("What is the most abundant element in the earth's atmosphere? ");
        element = inputReader.next();

        System.out.println("Wow, 1,024 Gigabytes is a "+ planet1 +"!");
        System.out.println("I didn't know that the largest ever volcano was discovered on "+size+"!");
        System.out.println("That's amazing that "+planet2+" is the most abundant element in the atmosphere...");
        System.out.println(element + " is the only planet that rotates clockwise, neat");
    }
}
