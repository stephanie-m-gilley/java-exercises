package exercises;

import java.util.ArrayList;
import java.util.Arrays;


public class Hasfive {
    public static void main(String[] args){
        String five = ("Write a static method to print out each word in a list that has exactly 5 letters.");
        // java does not know spaces so to split you use "\\s+" inside split
        ArrayList<String> E = new ArrayList<>(Arrays.asList(five.split("\\s+")));

        for (String word : E) {
            if (word.length() == 5) {
                System.out.println(word);

            }
        }

    }
}
