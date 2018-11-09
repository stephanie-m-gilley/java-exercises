package org.launchcode.java.studios;

import java.util.HashMap;
import java.util.Map;



public class Charcount {
    public static void main(String[] args) {


        HashMap<Character, Integer> charCount = new HashMap<>();
        String testString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus";
        char[] strArray = testString.toUpperCase().toCharArray();

        for (char i : strArray) {

            if (Character.isLetter(i)) {

                if (charCount.containsKey(i)) {
                    charCount.put(i, charCount.get(i) + 1);
                } else {
                    charCount.put(i, 1);

                }
            }

        }

        for (Map.Entry<Character, Integer> i : charCount.entrySet()) {
            System.out.println(i.getKey() + ": " + i.getValue());
        }
    }
}

