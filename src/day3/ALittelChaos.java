package day3;

import java.util.Random;

/**
 * Created by n0076647 on 1/24/2018.
 */
public class ALittelChaos {
    public static void main(String[] args) {
        Random randomizer = new Random();

        System.out.println("Random can make integers: " +
            randomizer.nextInt());
        System.out.println("Or a double: " +
            randomizer.nextDouble());
        System.out.println("Or even a boolean: " +
            randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result" +
            num);
        System.out.println("And use it over and over again" + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100");

        System.out.print(randomizer.nextInt(50) + 50 + ", ");
        System.out.print(randomizer.nextInt(50) + 50+ ", ");
        System.out.print(randomizer.nextInt(50) + 50+ ", ");
        System.out.print(randomizer.nextInt(50) + 50+ ", ");
        System.out.print(randomizer.nextInt(50) + 50+ ", ");
        System.out.print(randomizer.nextInt(50) + 50+ ", ");
        System.out.println(randomizer.nextInt(50)+50);
    }
}
