/**
 *
 * Title: Learning Reference Data Types (Array, String, Class, Interface, Enumeration & Annotation) in Java
 * <p>
 * Author: Dinesh Chinnasamy
 *
 */

package org.learning.basic.DataTypes.ReferenceDataType;
import java.lang.String;

public class Strings {

    public static void main(String[] args) {
        Strings obj = new Strings();
        obj.learningString();
    }

    /*  Strings are the type of objects that can store the character of values and in Java,
        every character is stored in 16 bits i,e using UTF 16-bit encoding.
        A string acts the same as an array of characters in Java.*/
    void learningString() {
        // Creating String Variable & Value

        String mySentence = "This Method gives a basic of string in java.";
        System.out.println("My Sentence: " + mySentence);

        // Convert all the string value to Upper Case & Lower Case
        System.out.println("String Uppercase: " + mySentence.toUpperCase());
        System.out.println("String Lowercase: " + mySentence.toLowerCase());

        //finding the length of the given string value
        System.out.println("Length of the String: " + mySentence.length());



    }

}
