/**
 *
 * Title: Learning Reference Data Types (Array, String, Class, Interface, Enumeration & Annotation) in Java
 * <p>
 * Author: Dinesh Chinnasamy
 *
 */

package org.learning.basic.DataTypes.ReferenceDataType;

import java.util.Arrays;


public class Array {

    public static void main(String[] args) {
        Array obj = new Array();
        obj.learningArrayDeclarationType1();
 //       obj.learningArrayDeclarationType2();
        obj.learningArrayDeclarationType3();
        obj.learningArrayDeclarationType4();
        obj.learningMultiDimensionalArray();
        obj.learningArrayProperties();

    }

    // It provides the fixed-size data structure that stores the elements of the same type.
    void learningArrayDeclarationType1() {
        //Array Declaration type 1
        int[] arrayDeclaration1 = new int[5];
        arrayDeclaration1[0] = 1;
        arrayDeclaration1[1] = 2;
        arrayDeclaration1[2] = 3;
        arrayDeclaration1[3] = 4;
        arrayDeclaration1[4] = 5;
        // Output to provide a particular element within the array size of 5
        System.out.println("Index 4 of Array Declaration Type 1: "+arrayDeclaration1[4]);
        // Output to print all the Array elements in the Array.
        System.out.println("Arrays in Array Declaration Type 1: "+Arrays.toString(arrayDeclaration1));
    }

/*    void learningArrayDeclarationType2() {
        //Array Declaration type 2
        int arrayDeclaration2[];
        arrayDeclaration2 = new int[5];
        arrayDeclaration2[0] = 5;
        arrayDeclaration2[1] = 4;
        arrayDeclaration2[2] = 3;
        arrayDeclaration2[3] = 2;
        arrayDeclaration2[4] = 1;
        // Output to provide a particular element within the array size of 5
        System.out.println("Index 4 of Array Declaration Type 2: "+arrayDeclaration2[4]);
        // Output to print all the Array elements in the Array.
        System.out.println("Arrays in Array Declaration Type 2: "+Arrays.toString(arrayDeclaration2));
    }*/

    void learningArrayDeclarationType3() {
        //Array Declaration type 3
        char[] arrayDeclaration3 = new char[] {'a','b','c','d','e'};
        // Output to provide a particular element within the array size of 5
        System.out.println("Index 4 of Array Declaration 3: "+arrayDeclaration3[4]);
        // Output to print all the Array elements in the Array.
        System.out.println("Arrays in Array Declaration Type 3: "+Arrays.toString(arrayDeclaration3));
    }

    void learningArrayDeclarationType4() {
        //Array Declaration type 4
        String[] arrayDeclaration4 = {"Dinesh","Nerthee","Joshvik","Appa","Amma"};
        // Output to provide a particular element within the array size of 5
        System.out.println("Index 4 of Array Declaration 4: "+arrayDeclaration4[4]);
        // Output to print all the Array elements in the Array.
        System.out.println("Arrays in Array Declaration Type 4: "+Arrays.toString(arrayDeclaration4));
    }

    void learningMultiDimensionalArray(){

        // 2 Dimensional Array
        String[][] twoDimensionalArray = {{"1","Dinesh"},{"2","Nerthee"},{"3","Joshvik"},{"4","Diner"}};
        System.out.println("2 Dimensional Array variable in row 2 column 1: " + twoDimensionalArray[1][1]);

        // 3 Dimensional Array
        String[][][] threeDimensionalArray = {{{"1","Dinesh","B+"}},{{"2","Nerthee","B+"}},{{"3","Joshvik","O+"}},{{"4","Diner","N/A"}}};
        System.out.println("2 Dimensional Array variable in row 3 column 2 cell 2: " + threeDimensionalArray[1][0][2]);
    }

    void learningArrayProperties () {

        int[] arrayDeclaration1 = {1,2,3,4};
        String[] arrayDeclaration4 = {"Dinesh","Nerthee","Joshvik","Appa","Amma"};

        // Finding the length of the Array
        System.out.println("Integer Arrays:" + Arrays.toString(arrayDeclaration1));
        System.out.println("Length of Array Declaration Type 1: " + arrayDeclaration1.length);

        // Clone Array
        String[] cloneArrayDeclaration4 = arrayDeclaration4.clone();
        System.out.println("Declared String Arrays: " + Arrays.toString(arrayDeclaration4));
        System.out.println("Cloning the array: " + Arrays.toString(cloneArrayDeclaration4));


    }

}
