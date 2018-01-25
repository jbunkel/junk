package day1;

import java.util.Scanner;

/**
 * Created by n0076647 on 1/25/2018.
 */
public class WindowMaster {
    public static void main(String[] args) {
        String height = "";
        String width = "";
        float heightNbr;
        float widthNbr;
        float area;
        float perimeter;
        float cost;

        Scanner myScanner = new Scanner(System.in);

        //height
        System.out.println("Height of window in feet:");
        height = myScanner.nextLine();
        heightNbr = Float.parseFloat(height);

        //width
        System.out.println("Width of window in feet:");
        width = myScanner.nextLine();
        widthNbr = Float.parseFloat(width);

        //calculate the area of the window
        area = heightNbr * widthNbr;

        // calculate the perimeter of the window
        perimeter = 2 * (heightNbr + widthNbr);

        // calculate the total cost - use a hard coded value for
        // material cost
        cost = ((3.50f * area) + (2.25f * perimeter));

        System.out.println("Window height = " + height);
        System.out.println("Window width = " + width);
        System.out.println("Window area = " + area);
        System.out.println("Window perimeter = " + perimeter);
        System.out.println("Total Cost =  " + cost);

    }
}
