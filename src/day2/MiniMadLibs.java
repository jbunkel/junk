package day2;

import java.util.Scanner;

/**
 * Created by n0076647 on 1/23/2018.
 */
public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        String noun1, adjective1, noun2, number1, adjective2, pluralNoun1, pluralNoun2, pluralNoun3, verbPresent, verbPast;


        System.out.println("Give me a noun");
        noun1 = inputReader.next();

        System.out.println("Give me an adjective");
        adjective1 = inputReader.next();

        System.out.println("Give me another noun");
        noun2 = inputReader.next();

        System.out.println("Give me a number");
        number1 = inputReader.next();

        System.out.println("Give me another adjective");
        adjective2 = inputReader.next();

        System.out.println("Give me a pluralNoun");
        pluralNoun1 = inputReader.next();

        System.out.println("Give me another plural noun");
        pluralNoun2 = inputReader.next();

        System.out.println("Give me one more plural noun");
        pluralNoun3 = inputReader.next();

        System.out.println("Give me a present tense verb");
        verbPresent = inputReader.next();

        System.out.println("Give me same verb past tense");
        verbPast = inputReader.next();

        System.out.println(noun1 + ": the "+2+" frontier. These are the voyages of the starship "+3+". Its "+4+"-year mission: to explore strange "+5+" "+6+", to seek out "+5+" "+7+" and "+5+" "+8+", to boldly "+9+" where no one has "+10+" before.");


    }
}
