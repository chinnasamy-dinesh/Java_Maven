package org.learning.FlowControl;

public class LearningLoops {

    public static void main(String[] args) {
        forLoop();
        nestedForLoop();
        forEach();
        whileLoop();
        doWhileLoop();
    }

    public static void forLoop() {
        // for loop to print numbers from 1 to 5
        System.out.println("Printing 1 to 5 using For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("" + i);
        }

        System.out.println("Loop has ended.\n");
    }

    public static void nestedForLoop() {
        System.out.println("Nested For Loop with 1 to 3:");
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void forEach() {
        // Array declaration
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Printing arr elements using for each loop:");
        // Using for-each loop to
        // print each element
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println("\n");
    }

    public static void whileLoop() {
        // Initialize the counter variable
        int c = 1;
        System.out.println("While loop to print numbers from 1 to 5");
        while (c <= 5) {
            System.out.println(c);
            // Increment the counter
            c++;
        }
        System.out.println();
    }

    public static void doWhileLoop() {
        // initial counter variable
        int c = 0;
        System.out.println("Do While Loop to Print Illustrate One Time:");
        do {

            // Body of loop that will execute minimum
            // 1 time for sure no matter what
            System.out.println("Print Statement");
            c++;
        }

        // Checking condition
        // Note: It is being checked after
        // minimum 1 iteration
        while (c < 0);
    }
}




