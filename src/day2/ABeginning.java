package day2;

import java.util.Random;

/**
 * Created by n0076647 on 1/23/2018.
 */
public class ABeginning {
    public static void main(String args[]) {
        System.out.println("Hello World!");
        System.out.println("Hello from the Guild");
        System.out.println("Typing code is easier than I thought ...");
        System.out.println("Typity Typity Type!");
        System.out.println("After I finish typing");
        System.out.println("I'll compile my code");
        System.out.println("And then when I run it,");
        System.out.println("The console will print out all my brilliant words!");
        System.out.println("And it all starts with \"Hello World !\"..");

        Random rGen = new Random();
        int rInt = rGen.nextInt(10);

        System.out.println(rInt);
    }
}
