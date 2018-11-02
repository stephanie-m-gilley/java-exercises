package exercises;

import java.util.Scanner;

public class Num_types {
    public static void main(String[] args) {
        double length, width, area;
        Scanner x = new Scanner(System.in);
        System.out.print("What is the length?: ");
        length = x.nextDouble();
        System.out.print("What is the width?: ");
        width = x.nextDouble();

        area = length * width;
        System.out.println("The area is: " + area);
    }
}
