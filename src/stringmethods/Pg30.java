package stringmethods;

import java.util.Arrays;
import java.util.List;

public class Pg30 {
    public static void main(String[] args) {
        /*
        3. Which ones are true?

A) String str = "Learn java, earn money";
System.out.println(str.replace("earn", "?"));
Gives Compile Time Error because instead of 4 characters you cannot replace 1 character.
B) String str = "Learn java, earn money";
System.out.println(str.replace('Learn', '?'));
Gives Compile Time Error
C) String str = "Learn java, earn money";
System.out.println(str.replace("Learn", '?'));
Gives Compile Time Error
D) String str = "Teach more, learn more";
System.out.println(str.replace("more", "less"));
Prints Teach less, learn more on the console
         */

        //A)
//        String str = "Learn java, earn money";
//        System.out.println(str.replace("earn", "?"));

        //B)
//        String str = "Learn java, earn money";
//        System.out.println(str.replace('Learn', '?'));

        //C)
//        String str = "Learn java, earn money";
//        System.out.println(str.replace("Learn", '?'));
//
        // D)
//        String str = "Teach more, learn more";
//        System.out.println(str.replace("more", "less"));

        // Ans: A, D

        /*
        4. Which one is true?

A) String str = "Java";
System.out.println(str.replace("", "/"));
Prints J/a/v/a on the console
B) String str = "Java";
System.out.println(str.replace("", "/"));
Prints /J/a/v/a on the console
C) String str = "Java";
System.out.println(str.replace("", "/"));
Prints /J/a/v/a/ on the console
D) String str = "Java";
System.out.println(str.replace("", "/"));
Prints Java on the console
         */

       // A)
//        String str = "Java";
//        System.out.println(str.replace("", "/"));

        // B)
//        String str = "Java";
//        System.out.println(str.replace("", "/"));

        // C)
//        String str = "Java";
//        System.out.println(str.replace("", "/"));

        // D)
        String str = "Java";
        System.out.println(str.replace("", "/"));




    }
}
