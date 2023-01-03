package stringmethods;

public class Pg29 {
    public static void main(String[] args) {

        /*
        1. Note: toUpperCase() method converts all characters in a String to uppercase
Which ones are true?

A) String str = "Hello World!";
System.out.println(str.length() > str.charAt(6));
prints false on the console.

B) String str = "Hello World!";
System.out.println(str.contains("E") != str.equalsIgnoreCase("HELLO WORLD!"));
prints true on the console.

C) String str = "Hello World!";
System.out.println(str.charAt(2) == str.charAt(9));
prints false on the console.

D) String str = "Hello World!";
System.out.println(str.toUpperCase().charAt(0) == str.charAt(0));
prints false on the console.
         */
        //A
//        String str = "Hello World!";
//        System.out.println(str.length()> str.charAt(6));

        //B
//        String str = "Hello World!";
//        System.out.println(str.contains("E") != str.equalsIgnoreCase("HELLO WORLD!"));
//
//        //C
//        String str = "Hello World!";
//        System.out.println(str.charAt(2) == str.charAt(9));

//        //D
//        String str = "Hello World!";
//        System.out.println(str.toUpperCase().charAt(0) == str.charAt(0));

        // Ans: A, B and D are true.


        // Q.2

        /*
        Note: toLowerCase() method converts all characters in a String to lowercase
Which ones are false?

A) String str = "Hello World!";
System.out.println(str.toLowerCase().contains("world"));
prints true on the console.
B) String str1 = "Hello";
String str2 = "HELLO";
System.out.println(str1.equals(str2.toLowerCase()));
prints true on the console.
C) String str = "Java";
System.out.println(str.replace('a', 'i'));
prints Jiva on the console.
D) String str = "Java";
System.out.println(str.replace('v', 'J'));
prints vava on the console.
         */

        // A)
//        String str = "Hello World!";
//        System.out.println(str.toLowerCase().contains("world"));

        // B)
        String str1 = "Hello";
        String str2 = "HELLO";
        System.out.println(str1.equals(str2.toLowerCase()));

//        // C)
//        String str = "Java";
//        System.out.println(str.replace('a', 'i'));

//        // D)
         String str = "Java";
        System.out.println(str.replace('v', 'J'));

        // Ans: B






    }
}
