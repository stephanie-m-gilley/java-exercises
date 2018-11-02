package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        double gas, miles, milespg;

        Scanner input = new Scanner(System.in);
        System.out.print("How many gallons did you use?: ");
        gas = input.nextDouble();
        System.out.print("How many miles did you drive?: ");
        miles = input.nextDouble();

        milespg = miles / gas;

        System.out.println("You got " + milespg + " miles per galllon");
    }
}
