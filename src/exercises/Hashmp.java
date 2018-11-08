package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmp {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<
                >();

        Scanner in = new Scanner(System.in);
        Integer newId;

        System.out.println("Enter student id or ENTER to finish");

        do {
            System.out.print("Student ID: ");
            newId = in.nextInt();

            if (!newId.equals("")){
                System.out.print("Student Name: ");
                String newStudent = in.nextLine();
                students.put(newId, newStudent);

                in.nextLine();

            }

        } while(newId.equals(""));

        System.out.println



    }
}
