package org.launchcode.java.studios;


import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius, pi, area;

        pi = 3.14;
        Scanner x = new Scanner(System.in);
        System.out.print("What is the radius?: ");
        radius = x.nextDouble();
        area = pi * radius * radius;

        System.out.println("The area is: " + area);



    }
}
