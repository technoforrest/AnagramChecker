/**
 * This program computes whether two strings are anagrams or not
 * CPSC 224-01, Spring 2018
 * Programming Assignment #1
 *
 * @author Danielle Forrest
 * @version v1.0 1/23/18
 */

import java.util.Arrays;
import java.util.Scanner;


public class AnagramCheck {
    /**
     * This method determines if two strings are anagrams of each other
     *
     * @param str1 the first string determined by the user in main
     * @param str2 the second string determined by the user in main
     *
     * @return true if strings are anagrams of each other and false if they are not anagrams
     */
    public static Boolean isAnagram(String str1, String str2) {

        Boolean anagram;
        // Get lengths of both strings
        int str1Length = str1.length();
        int str2Length = str2.length();

        if (str1Length == str2Length) {
            char str1Arr[] = str1.toCharArray();
            char str2Arr[] = str2.toCharArray();

            // Sort both strings
            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);

            //compare sorted strings
            if (Arrays.equals(str1Arr, str2Arr)) {
                anagram = true;
            } else {
                anagram = false;
            }

        } else {
            anagram = false;
        }

        return anagram;
    }

    public static void main(String[] args) {
        // Ask users to input two strings.
        System.out.println("Please input a string 1.");
        Scanner strScnr = new Scanner(System.in);
        String str1 = strScnr.nextLine();
        System.out.println("Please input a string 2.");
        String str2 = strScnr.nextLine();

        //check for null strings
        //if strings are null
        if (str1.equals("") || str2.equals("")) {
            while (str1.equals("") || str2.equals("")) {
                System.out.println("User must enter a string length greater than zero!");
                System.out.println("Please input a string 1.");
                str1 = strScnr.nextLine();
                System.out.println("Please input a string 2.");
                str2 = strScnr.nextLine();
            }
        }
        String origStr1 = str1;
        String origStr2 = str2;
        str1 = str1.replaceAll(" ", "");
        str1 = str1.toLowerCase();
        str2 = str2.replaceAll(" ", "");
        str2 = str2.toLowerCase();

        // Call the method isAnagram.
        if (isAnagram(str1, str2)) {
            System.out.println(origStr1 + " is anagram of " + origStr2 + ".");
        } else
            System.out.println(origStr1 + " is not anagram of " + origStr2 + ".");

    }
}
