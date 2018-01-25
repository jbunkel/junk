package day3;

/**
 * Created by n0076647 on 1/24/2018.
 */
public class SpringForward {
    public static void main(String[] args) {
        System.out.println("It's Spring...!");
        for (int i = 1; i <= 10; i++) { //start at 0, stop at 9
            System.out.print(i + ", ");
        }

        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) { //start at 10, stop at 1
            System.out.print(i + ", ");
        }

    }
}
