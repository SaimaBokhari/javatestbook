package stringbuilder;

import java.sql.SQLOutput;

public class Pg81 {
    public static void main(String[] args) {
        /*
        3. StringBuilder strBld = new StringBuilder("John ");
strBld.append("Woo ").append("Leo").deleteCharAt(6);
System.out.println(strBld);

What is the output?
A) John Wo Leo
B) John Woo Leo
C) John oo Leo
D) John W
         */

        StringBuilder strBld = new StringBuilder("John ");
        strBld.append("Woo ").append("Leo").deleteCharAt(6);
        System.out.println(strBld);

        // Ans: A


        /*
        4. Which one is false?

A) public static void main(String[] args) {
StringBuilder str = new StringBuilder("LearnJava");
str.deleteCharAt(3);
System.out.println(str.substring(2, 6));
}
The output is anJa
B) public static void main(String[] args) {
StringBuilder str = new StringBuilder("LearnJava");
str.setCharAt(5, 'L');
System.out.println(str);
}
The output is LearnLava

C) public static void main(String[] args) {
StringBuilder str = new StringBuilder(7);
str.append("Java");
System.out.println(str.capacity() + "," + str.length());
}
The output is 4,7
D) None
         */

//            StringBuilder str = new StringBuilder("LearnJava");
//            str.deleteCharAt(3);
//        System.out.println(str);    // LeanJava
//            System.out.println(str.substring(2, 6));

//        StringBuilder str = new StringBuilder("LearnJava");
//        str.setCharAt(5, 'L');
//        System.out.println(str);


        StringBuilder str = new StringBuilder(7);
        str.append("Java");
        System.out.println(str.capacity() + "," + str.length());


        // Ans: C



    }
}
