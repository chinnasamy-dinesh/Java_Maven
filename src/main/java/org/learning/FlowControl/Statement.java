package org.learning.FlowControl;

public class Statement {
    public static void main(String[] args) {
        ifStatement();
        ifElseStatement();
        nestedIfStatement();
        ifElseIFLadder();
    }

    public static void ifStatement(){

        // i is initialized to 10
        int i = 10;

        System.out.println("If Statement:");
        // using if-condition is checked. 10<15, yields true. "10 is less than 15" gets printed.
        if (i < 15){
            System.out.println("10 is less than 15");
        }

        // "Outside if-block" is printed.
        System.out.println("Outside if-block");
    }

    public static void ifElseStatement(){

        System.out.println("\nIf Else Statement:");
        // i is initialized to 10
        int i = 10;

        // using if-condition is checked. 10<15, yields true. "10 is less than 15" gets printed.
        if (i < 15){
            System.out.println("10 is less than 15");
        } else {
            // yields False "10 is not less than 15" is printed
            System.out.println("10 is not less than 15");
        }

        // "Outside if-block" is printed.
        System.out.println("Outside if-block");
    }

    public static void  nestedIfStatement(){

        // Nested if statement
        System.out.println("\nNested If Statement:");
        int a = 25;
        double w = 65.5;

        if (a >= 18){
            if (w >= 50.0){
                System.out.println("You are eligible to donate blood.");
                } else {
                System.out.println("You must weigh at least 50 kilograms to donate blood.");
                }
        } else {
            System.out.println("You must be at least 18 years old to donate blood.");
            }
    }

    public static void ifElseIFLadder(){

        System.out.println("\nIf Else IF Ladder Statement:");
        int i = 20;

        // if-else-if ladder to check the value of i == 10 is checked, It evaluates to false because i is 20
        if (i == 10) {
            System.out.println("i is 10");
        } else if (i == 20) // The second else if condition i == 20 is checked:, It evaluates to true because i is 20.
            {
                // "i is 20" gets printed.
                System.out.println("i is 20");
            } else {
        System.out.println("i is neither 10 nor 20");
        }
    }

}
