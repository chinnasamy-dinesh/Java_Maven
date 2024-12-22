/**
 *
 * Title: Learning Primitive Data Types in Java
 * <p>
 * Author: Dinesh Chinnasamy
 *
 */

package org.learning.basic.DataTypes;

public class PrimitiveDataType {
    public static void main(String[] args) {

        PrimitiveDataType obj = new PrimitiveDataType();

        // any variable in java has to have a type information

        obj.learningIntegerTypes();
        obj.learningFractionTypes();
        obj.learningCharType();
        obj.learningBooleanType();
        obj.learningTypeCasting();
    }

    void learningIntegerTypes () {
        byte byteVariable = 127; // Signed 8-bit (-127 to 127)
        short shortVariable = -32767; // Signed 16-bit (-32767 to 32768)
        int integerVariable = 214748364; // Signed 32-bit (-2,147,483,647 to 2,147,483,648)
        long longVariable = 1314291314; // Signed 64-bit (-9.22337E+17 to 9.22337E+18)
        System.out.println("Byte: "+byteVariable);
        System.out.println("Short: "+shortVariable);
        System.out.println("Int: "+integerVariable);
        System.out.println("Long: "+longVariable);
    }

    void learningFractionTypes() {
        float floatVariable = 13.1429f; // 32-bit single precision
        double doubleVariable = 13.1429; // 64-bit double precision
        System.out.println("Float: "+floatVariable);
        System.out.println("Double: "+doubleVariable);
    }

    void learningCharType() {
        char charVariable = 'a'; // 16-bit Unicode character
        System.out.println("Char: "+charVariable);
    }

    void learningBooleanType(){
        boolean isBooleanVariable = true; // true or false statement
        System.out.println("isBooleanVariable: "+isBooleanVariable);
    }

    void learningTypeCasting() {
        int typecast2Byte = (byte)214748364; // only can be applied on higher datatype to lower-datatype
        System.out.println("int2byte: "+typecast2Byte);
    }

}
