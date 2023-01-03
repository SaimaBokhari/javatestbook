package stringbuilder;

public class Pg85 {
    public static void main(String[] args) {
        /*
        9. Note: Default capacity for empty StringBuilders is 16.
Note: When you add new characters into an empty StringBuilder, the number of characters will be
added to 16.
StringBuilder sb3 = new StringBuilder("Learn");
System.out.println("Before trim: " + sb3.capacity());
sb3.trimToSize();
System.out.println("After trim: " + sb3.capacity());

What is the output?
A) Before trim: 21
After trim: 5
B) Before trim: 5
After trim: 5
C) Before trim: 5
After trim: 21
D) Before trim: 16
After trim: 5
         */

        StringBuilder sb3 = new StringBuilder("Learn");
        System.out.println("Before trim: " + sb3.capacity());
        sb3.trimToSize();
        System.out.println("After trim: " + sb3.capacity());

        // Ans: A

        /*
        10. Which ones are true?

A) StringBuilder sb = new StringBuilder(9);
System.out.println(sb.length() + " - " + sb.capacity());
Output is 0 - 9
B) StringBuilder sb = new StringBuilder();
System.out.println(sb.length() + " - " + sb.capacity());
Output is 0 - 16
C) StringBuilder sb = new StringBuilder("Java");
System.out.println(sb.length() + " - " + sb.capacity());
Output is 4 - 20
D) StringBuilder sb = new StringBuilder("StringBuilder");
System.out.println(sb.delete(3, 6).toString() + " - " + sb.length());
Output is StrBuilder - 10
         */

//        StringBuilder sb = new StringBuilder(9);
//        System.out.println(sb.length() + " - " + sb.capacity());

//        StringBuilder sb = new StringBuilder();
//        System.out.println(sb.length() + " - " + sb.capacity());

//        StringBuilder sb = new StringBuilder("Java");
//        System.out.println(sb.length() + " - " + sb.capacity());

        StringBuilder sb = new StringBuilder("StringBuilder");
        System.out.println(sb.delete(3, 6).toString() + " - " + sb.length());


        // Ans: A, B, C, D

    }
}
