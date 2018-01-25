package day4;

import java.util.Scanner;

/**
 * Created by n0076647 on 1/25/2018.
 */
public class VoteExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userAge;
        boolean oldEnoughToVote;

        for (int i = 0; i < 2; i++){
            userAge = getUserAge(scanner);

            displayResultOfVotingAge(userAge);
        }
    }

    private static void displayResultOfVotingAge(int userAge) {
        if(oldEnoughToVote(userAge)){
            System.out.println("You are old enough to vote");
        } else {
            System.out.println("not");
        }
    }

    private static boolean oldEnoughToVote(int userAge) {
        return userAge >= 18;
    }

    private static int getUserAge(Scanner scanner) {
        int userAge;
        System.out.println("How old are you?");
        String userAgeString = scanner.nextLine();
        userAge = Integer.parseInt(userAgeString);
        return userAge;
    }
}
