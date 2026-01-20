package dev.rogergsferreira.javaoneforall.introduction;

public class Class02PrimitiveTypes {
    // Primitive types: byte, short, long, int, float, double, boolean, char
    // Cast: casting is forcing a number to be the type you put in parentheses
    // Cast or casting means "conversão de tipo"!
    static void main(String[] args) {
        int age = 10;
        long bigNumber = 100000L;
        float salaryFloat = 2000.0F;
        double salaryDouble = 2000.0;
        boolean trueValue = true;
        boolean falseValue = false;
        short ageShort = 29;
        byte ageByte = 39;
        char character = '\u0041'; // Letter A in ASCII table values
        String name = "Goku";

        var otherName = "Naruto";
        /*
         * var is not a data type itself,
         * but a reserved type name used for local variable type inference,
         * introduced in Java 10. It allows the compiler to automatically
         * determine the actual, static type of local variable based on
         * the type of the value assigned to it during initialization.
         */
        // The "var" type is only allowed in java 10 or higher versions

        System.out.println("The age is " + age + " years old.");
        System.out.println(character);
        System.out.println(salaryFloat);
        System.out.println(salaryDouble);
        System.out.println("Hi! I am " + name);
    }
}
