package day2;

/**
 * Created by n0076647 on 1/23/2018.
 */
public class MenuOfChampions {
    public static void main(String[] args) {

        String item1Name = "Slice of Big Rico Pizza";
        String item2Name = "Invisible Strawberry Pie";
        String item3Name = "Denver Omlet";
        String restaurantName = "NIGHT VALE";
        float item1Price = 500.00f;
        float item2Price = 2.00f;
        float item3Price = 1.50f;

        System.out.println("  .--.      .-'.      .--.      .--.      .--.      .--.      .`-.      .--.\n" +
                ":::::.\\::::::::.\\::::::::.\\::::::::.\\::::::::.\\::::::::.\\::::::::.\\::::::::.\\\n" +
                "'      `--'      `.-'      `--'      `--'      `--'      `-.'      `--'      `\n");

        System.out.println("            WELCOME TO RESTAURANT " + restaurantName + "!");
        System.out.println("              Today's Menu is...");

        System.out.println("  .--.      .-'.      .--.      .--.      .--.      .--.      .`-.      .--.\n" +
                ":::::.\\::::::::.\\::::::::.\\::::::::.\\::::::::.\\::::::::.\\::::::::.\\::::::::.\\\n" +
                "'      `--'      `.-'      `--'      `--'      `--'      `-.'      `--'      `\n");


        System.out.printf("\n" + item1Name + " $" + "%.2f", item1Price);
        System.out.printf("\n" + item2Name + " $" + "%.2f", item2Price);
        System.out.printf("\n" + item3Name + " $" + "%.2f", item3Price);

    }

}
