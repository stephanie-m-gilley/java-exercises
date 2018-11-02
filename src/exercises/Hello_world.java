package exercises;

import java.util.Scanner;

public class Hello_world {
    public static void main(String[] args) {
        String usr_name;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        usr_name = input.nextLine();

        System.out.println("Hello " + usr_name);

    }

}
