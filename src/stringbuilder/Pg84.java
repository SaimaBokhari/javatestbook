package stringbuilder;

public class Pg84 {
    public static void main(String[] args) {
        /*
        7. Knowledge: append(char ch) is used to append the string representation of the char argument to
the given sequence. The char argument is appended to the contents of this StringBuilder
sequence.
public static void main(String[] args) {
StringBuilder stb = new StringBuilder("Learn ");
char[] ch = new char[] { 'J', 'A', 'V', 'A' };
stb.append(ch);
System.out.println(stb);
}
According to the given knowledge what is the output?
A) Learn JAVA
B) JAVA
C) JAVA Learn
D) Learn
         */

        StringBuilder stb = new StringBuilder("Learn ");
        char[] ch = new char[] { 'J', 'A', 'V', 'A' };
        stb.append(ch);
        System.out.println(stb);

        // Ans: A

        /*
        8. Which ones are true?

A) public static void main(String[] args) {
String str = "Learn";
str = str + "Java";
System.out.println(str);
}
The output is LearnJava
B) public static void main(String[] args) {
String str = "Learn";
System.out.println(str + "Java");
}
The output is LearnJava
C) public static void main(String[] args) {
String str = "Learn";
join("Java");
System.out.println(str);
}
public static String join(String str) {
return str + "Java";
}
The output is LearnJava
D) None
         */

        String str = "Learn";
 //       str = str + "Java";
 //       System.out.println(str);

 //       System.out.println(str + "Java");



        //Ans: A, B


    }
}
