package day2;

/**
 * Created by n0076647 on 1/23/2018.
 */
public class TheOrderOfThings {
    public static void main(String[] args) {
        int number;
        String opinion, size, age, shape, color, origin, material, purpose;
        String noun;

        number = 5;
        opinion = "AWESOME";
        size = "teensy-weensy";
        age = "new";
        shape = "oblong";
        color = "BRIGHT yellow";
        origin = "AlphaCentaurian";
        material = "platinum";
        purpose = "good";

        noun = "dragons";

        // Using the + with strings, doesn't add it concatenates! (sticks them together)
        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape + " " + color
                + " " + origin + " " + material + " " + purpose + " " + noun);

        System.out.println(number + " " + opinion + " " + size + " " + age + " " + shape + " " + color
                + " " + origin + " " + material + " " + purpose + " " + noun);



    }
}
