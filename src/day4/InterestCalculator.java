package day4;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by n0076647 on 1/25/2018.
 */
public class InterestCalculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double intRate=0;
        double principalAmt=0;
        int numYears=0;
        int numCompoundPeriodsPerYear = 4;
        double currentBalance = 0;
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.US);

        intRate = getValidInterestRate();

        principalAmt = getValidPrincipalAmount();

        numYears = getValidNumYears();

        currentBalance = principalAmt;

        for (int i=1;i<=numYears;i++) {
            System.out.print("Year " + i + ": ");
            System.out.print(" Principal at start of year: " + format.format(currentBalance));
            double balanceForYear = currentBalance;
            for (int ii=1;ii<=numCompoundPeriodsPerYear; ii++) {
                balanceForYear = (balanceForYear * (1 + (intRate/numCompoundPeriodsPerYear) / 100));
            }
            System.out.print(", Interest for year: " + format.format((balanceForYear - currentBalance)));
            currentBalance = balanceForYear;
            System.out.println(", Principal at end of year: " + format.format(currentBalance));
        }
    }

    private static int getValidNumYears() {
        int numYears;
        do {
            System.out.println("Please enter number of years.");
            String numYearsString = scanner.next();
            numYears = Integer.parseInt(numYearsString);

            if (numYears <= 0){
                System.out.println("Please enter amount greater than zero.");
            }
        } while (numYears<=0);
        return numYears;
    }

    private static double getValidPrincipalAmount() {
        double principalAmt;
        do {
            System.out.println("Please enter principal amount to be invested.");
            String principalAmtString = scanner.next();
            principalAmt = Double.parseDouble(principalAmtString);

            if (principalAmt <= 0){
                System.out.println("Please enter amount greater than zero.");
            }
        } while (principalAmt<=0);
        return principalAmt;
    }

    private static double getValidInterestRate() {
        double intRate;
        do {
            System.out.println("Please enter annual interest rate.");
            String intRateString = scanner.next();
            intRate = Double.parseDouble(intRateString);

            if (intRate <= 0){
                System.out.println("Please enter amount greater than zero.");
            }
        } while (intRate<=0);
        return intRate;
    }
}
