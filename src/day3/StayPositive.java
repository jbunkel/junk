package day3;

import java.util.Scanner;

/**
 * Created by n0076647 on 1/24/2018.
 */
public class StayPositive {
    public static void main(String[] args) {
        int number;
        String strNumber;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("What number should I count down from?");
        strNumber = inputScanner.next();
        number = Integer.parseInt(strNumber);

        do {

            System.out.println(number);
            number--;
        } while (number >= 0);

        System.out.println("Whew, better stop there...!");
    }
}
