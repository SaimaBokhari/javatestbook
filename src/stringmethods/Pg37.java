package stringmethods;

public class Pg37 {
    public static void main(String[] args) {

        /*
        20.
        String s = "Java is Java";
Which ones are true?

A) System.out.println(s.lastIndexOf('v'));
Prints 11 on the console
B) System.out.println(s.lastIndexOf("va"));
Prints 10 on the console
C) System.out.println(s.toUpperCase().lastIndexOf("V"));
Prints -1 on the console
D) System.out.println(s.toLowerCase().lastIndexOf("j"));
Prints 8 on the console
         */
//        String s = "Java is Java";
//
//        // A)
//        System.out.println(s.lastIndexOf('v'));
//
//        //B)
//        System.out.println(s.lastIndexOf("va"));
//
//        // C)
//        System.out.println(s.toUpperCase().lastIndexOf("V"));
//
//        //D)
//        System.out.println(s.toLowerCase().lastIndexOf("j"));


        //Ans: B, D


        /*
        21. String s = "Learn";
String t = "Java";
String u = "";
String v = " ";
Note: u is empty String, v has space character


Which one is false?

A) System.out.println(s.concat(t)).length());
Prints 9 on the console
B) System.out.println("" + s.length() + t.length());
Prints 9 on the console
C) System.out.println(s.concat(t.length()));
Prints Learn4 on the console
D) System.out.println(u.isEmpty() == v.isBlank());
Prints true on the console
         */

        String s = "Learn";
        String t = "Java";
        String u = "";
        String v = " ";

        // A)
        //System.out.println(s.concat(t)).length());

        //B)
        System.out.println("" + s.length() + t.length());

        // C)
        // System.out.println(s.concat(t.length()));

        //D)
        System.out.println(u.isEmpty() == v.isBlank());






        // Ans: A, C give Compile Time Error, B is false , D is true










    }
}
