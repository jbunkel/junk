package day2;

import java.util.Scanner;

/**
 * Created by n0076647 on 1/23/2018.
 */
public class PassingTheTuringTest {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);

        String name, color, food;
        int number;

        System.out.println("");

        System.out.println("Hello there!");
        System.out.println("What's your name? ");
        name = inputReader.next();

        System.out.println("Hi, " + name +"!  What's your favorite color? ");
        color = inputReader.next();

        System.out.println("Huh, " + color + "? Mine's Electric Lime.");

        System.out.println("I really like limes. They're my favorite fruit, too.");
        System.out.println("What's YOUR favorite fruit, "+ name + "?");
        food = inputReader.next();

        System.out.println("Really? "+ food + "? That's wild!");
        System.out.println("Speaking of favorites, what's your favorite number?");
        number = inputReader.nextInt();

        System.out.println(number + " is a cool number. Mine's -7.");
        System.out.println("Did you know "+ number + " * -7 is "+ (number * -7) +"? That's a cool number too!");

        System.out.println("Well, thanks for talking to me, " + name +"!");


    }



}
