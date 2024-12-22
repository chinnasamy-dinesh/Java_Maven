package org.learning.basic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TakingUserInput {

    public static void main(String[] args) throws IOException {

        // Java brings various Streams with its I/O package that helps the user perform all the Java input-output operations.
        // These streams support all types of objects, data types, characters, files, etc. to fully execute the I/O operations.

        myBufferedReader();
        myScanner();
    }

    public static void myBufferedReader () throws IOException {

        // Reads input from keyboard & File only Char, CHar Set & String can be used, store them in a buffer.
        // Keyboard input is obtained by InputStreamReader Class
        InputStreamReader learnISR = new InputStreamReader(System.in);

        // Creating BufferedReader Object by adding the InputStreamReader object to Convert Bytes to Stream of Character
        BufferedReader br = new BufferedReader(learnISR);

        // Another way to declare the InputStream in BufferReader (Reduce the Code Line)
        BufferedReader brAnother = new BufferedReader(new InputStreamReader(System.in));

        // Integer reading internally
        System.out.println("\nBuffer Reader:\nEnter Integer Input for BufferReader:");
        int bufferInteger = Integer.parseInt(br.readLine());

        // Float reading internally
        System.out.println("Enter Float Input for BufferReader:");
        float bufferFloat = Float.parseFloat(br.readLine());

        // String reading internally
        System.out.println("Enter String Input for BufferReader:");
        String bufferString = brAnother.readLine();

        // Printing the Integer, Float & String read Internally using Keyboard
        System.out.println("Integer Input: " + bufferInteger);
        System.out.println("Float Input: " + bufferFloat);
        System.out.println("String Input: " + bufferString);


        // File data is read from FileReader Class (Only the first line is captured from the Text File)
        FileReader fr = new FileReader("src/main/resources/basic/TakingUserInput.txt");
        br = new BufferedReader(fr);

        // Another way to declare the FileReader Class in bufferReader
        brAnother = new BufferedReader(new FileReader("src/main/resources/basic/TakingUserInput.txt"));

        // String Variable to store the File Data
        String readFileData = brAnother.readLine();

        // Printing the String only prints the first line on the File
        System.out.println("\nPrints only the First Line from the File:\n" + readFileData + "\n\nPrints all the Lines from the File:");

        // Printing all the Line from teh text file using a while loop and stopping the loop when the value of readfileData is null
        while((readFileData = br.readLine()) != null){
            System.out.println(readFileData);
        }

    }

    public static void myScanner(){

        // It is an advanced version of BufferedReader which was added in later versions of Java. The scanner can read formatted input.
        // It has different functions for different types of data types. {Integer: nextInt(), Float: nextFloat() & String : next() and nextLine()}

        // Scanner definition
        Scanner scn = new Scanner(System.in);

        // input is a String ( complete Sentence )
        // read by nextLine()function
        System.out.print("\nScanner:\nEnter String Line: ");
        String line = scn.nextLine();
        // print string
        System.out.println("Entered String Line: " + line + "\n");

        // input is a string ( one word )
        // read by next() function
        System.out.print("Enter a Single Char: ");
        String str = scn.next();
        // print String
        System.out.println("Entered String: " + str + "\n");

        // input is an Integer
        // read by nextInt() function
        System.out.print("Enter Int Value: ");
        int x = scn.nextInt();
        // print integer
        System.out.println("Entered Integer: " + x + "\n");

        // input is a floatingValue
        // read by nextFloat() function
        System.out.print("Enter Float Value: ");
        float f = scn.nextFloat();
        // print floating value
        System.out.println("Entered FloatValue: " + f);
    }

}


