/**
 *
 * Title: Learning Operators in Java
 * Summary: Operators are the building blocks of Java expressions, allowing you to perform calculations, comparisons, and more.
 * Author: Dinesh Chinnasamy
 *
 */

package org.learning.basic.Operators;

public class Operators {

    static int a = 15, b = 10, c = 25;

    public static void main(String[] args) {
      arithmeticOperators();
      unaryOperators();
      assignmentOperator();
      relationalOperator();
      logicalOperator();
      ternaryOperator();
      shiftOperator();
    }

    public static void arithmeticOperators() {

        // They are used to perform simple arithmetic operations on primitive and non-primitive data types.

        // Arithmetic operators on Strings
        String num1 = "15";
        String num2 = "10";

        // Convert Strings to integers
        int a1 = Integer.parseInt(num1);
        int b1 = Integer.parseInt(num2);

        System.out.println("Arithmetic Operators");
        System.out.println("Value of a & a1 = 15, b & b1 = 10, c = 25");
        System.out.println("Addition = " + (a + b + c));
        System.out.println("Subtraction = " + (a - b - c));
        System.out.println("Multiplication = " + (a * b * c));
        System.out.println("Division = " + (a / (c / b)));
        System.out.println("Modulo = " + (a % b) % c);
        System.out.println("String to Integer = " + (a1 + b1));
    }

    public static void unaryOperators() {

        // Unary operators need only one operand. They are used to increment, decrement, or negate a value. (+, -, ++, --, !)
        boolean c = true;

        // – : Unary minus, used for negating the values.
        int b = -a;
        System.out.println("\nUnary Operators");
        System.out.println("Value of a & a1 = 15, b & b1 = 10, c = 25");
        System.out.println("(-) Negates the Positive value to Minus: " + b);

        // + : Unary plus indicates the positive value (numbers are positive without this, however).
        // It performs an automatic conversion to int when the type of its operand is the byte, char, or short. This is called unary numeric promotion.
        System.out.println("(+) Indicates a positive value: " + a);

        // ++ : Increment operator, used for incrementing the value by 1. There are two varieties of increment operators.
        //  Post-Increment: Value is first used for computing the result and then incremented.
        //  Pre-Increment: Value is incremented first, and then the result is computed.
        b = a++;
        System.out.println("Post-increment++: " + b);
        b = ++a;
        System.out.println("++Pre-increment: " + b);

        // –– : Decrement operator, used for decrementing the value by 1. There are two varieties of decrement operators.
        //  Post-decrement: Value is first used for computing the result and then decremented.
        //  Pre-Decrement: The value is decremented first, and then the result is computed.
        int b1 = a--;
        System.out.println("Post-decrement--: " + b1);
        b1 = --a;
        System.out.println("--Pre-decrement: " + b1);

        // ! : Logical not operator, used for inverting a boolean value.
        System.out.println("(!)Inverts a boolean value: " + (!c));

    }

    public static void assignmentOperator(){
        //  ‘=’ Assignment operator is used to assign a value to any variable. variable = value;

        // General Format variable = value;
        int var = 1;

        // Add and assign.
        var += 1;
        System.out.println("\nAssignment Operator\nvalue of var = 1\nAdd assign by 1: " + var);

        // Subtract and assign
        var -= 1;
        System.out.println("Subtract assign by 1: " + var);

        // Multiply and assign
        var *= 2;
        System.out.println("Multiply assign by 2: " + var);

        // Divide and assign.
        var /= 2;
        System.out.println("Divide assign by 2: " + var);

        // Modulo and assign.
        var %= 1;
        System.out.println("Modulo assign by 1: " + var);

    }

    public static void relationalOperator(){
        // Relational operators compare values and return boolean results:

        // == , Equal to
        System.out.println("\nRelational Operator\nValue of a & a1 = 15, b & b1 = 10, c = 25\na equal to b:" + (a == b));

        //!= , Not equal to
        System.out.println("a not equal to b:" + (a != b));

        //< , Less than
        System.out.println("a less than b:" + (a < b));

        //<= , Less than or equal to
        System.out.println("a less than or equal to b:" + (a <= b));

        //> , Greater than
        System.out.println("a greater than b:" + (a > b));

        //>= , Greater than or equal to
        System.out.println("a greater than or equal to b:" + (a >= b));
    }

    public static void logicalOperator(){
        // Logical Operators are used to perform logical conditions 'AND (&&)','OR (||)' and 'Not (!)'operations

        // &&, Logical AND: returns true when both conditions are true.
        System.out.println("\nLogical Operators\nValue of a & a1 = 15, b & b1 = 10, c = 25");
        System.out.println("a greater than b AND b less than c: " + ((a>b) && (b<c)));

        //||, Logical OR: returns true if at least one condition is true.
        System.out.println("a greater than b AND c less than b: " + ((a>b) || (c<b)));

        //!, Logical NOT: returns true when a condition is false and vice versa
        System.out.println("Not condition a less than b: " + (!(a<b)));
    }

    public static void ternaryOperator(){
        //  Ternary Operator is a shorthand version of the if-else statement. I
        //  Three operands and hence the name Ternary. The general format is condition ? if true : false

        System.out.println("\nTernary Operator\nValue of a = 10 and value b = 9");
        System.out.println("is a greater than b with statement:" + (a>b ? "A is greater than B" : "A is less than b"));
        System.out.println("is a less than b as boolean outcome:" + (a<b ? "true" : "false"));
    }

    public static void shiftOperator(){
        // Using left shift multiples the variable by power of 2;
        System.out.println("left shift Multiples by Power of 2 a<<1 : " + (a << 1));

        // Using right shift divides the variable of power of 2;
        System.out.println("Right shift Multiples by Power of 2 a>>1 : " + (a >> 1));
    }

}
