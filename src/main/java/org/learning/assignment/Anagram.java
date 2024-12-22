package org.learning.assignment;

// Given two strings s(userInput_s) and t(userInput_t), return true if t is an anagram of s, and false otherwise.

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Anagram obj = new Anagram();
        System.out.println(obj.isAnagram("ar","are"));
    }

    public boolean isAnagram(String s, String t) {

        // Converting the given strings s & t to lowercase
        s = s.toLowerCase();
        t = t.toLowerCase();

        // Converting the given strings s & t to Char Array
        char[] charArray_s = s.toCharArray();
        char[] charArray_t = t.toCharArray();

        // Hashmap to convert the given char Array to count the number of occurrence for each repeated chars
        HashMap<Character, Integer> count_s = new HashMap<>();
        HashMap<Character, Integer> count_t = new HashMap<>();

        // Initial conditio to check
        if (s.length() == t.length()) {

            // adding the Char[] for s to HashMap to find the count of each repeated chars using for each
            for(char count : charArray_s) {
                count_s.put(count,count_s.getOrDefault(charArray_s,0) + 1);
            }

            // adding the Char[] for t to HashMap to find the count of each repeated chars using for each
            for(char count : charArray_t) {
                count_t.put(count,count_t.getOrDefault(charArray_t,0) + 1);
            }

            // Condition to check  true if t is an anagram of s, or false as return statement
            return count_t.equals(count_s);
        } else {

            // returns False boolean if the length of t does not match length of s
            return false;
        }
    }

}
