package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hashmp {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        Scanner in = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter student id or ENTER to finish");

        do {
            System.out.print("Student Name: ");
            newStudent = in.nextLine();

            if (!newStudent.equals("")){
                System.out.print("Student ID: ");
                Integer newId = in.nextInt();
                students.put(newId, newStudent);

                in.nextLine();

            }

        } while(!newStudent.equals(""));

        System.out.println("Class Students and ID's: ");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }



    }
}
