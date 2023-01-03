package stringmethods;

public class Pg34 {
    public static void main(String[] args) {

        /*
        12. String str= "Canan Can";
Which ones print "true" on the console?

A) System.out.println(str.startsWith("c"));
B) System.out.println(str.endsWith("n"));
C) System.out.println(str.startsWith("a",3));
D) System.out.println(str.endsWith("Can"));
         */

//        String str= "Canan Can";
//
//        //A
//        System.out.println(str.startsWith("c"));
//        //B
//        System.out.println(str.endsWith("n"));
//        //C
//        System.out.println(str.startsWith("a",3));
//        //D
//        System.out.println(str.endsWith("Can"));

        //Ans: B, C, D

        /*
        13.
        String str = "Java is easy";
Which ones are true?

A) System.out.println(str.substring(5));
Prints s easy
B) System.out.println(str.substring(11));
Prints y
C) System.out.println(str.substring(5, 9));
Prints is e
D) System.out.println(str.substring(8, 8));
Nothing is printed on the console
         */

        String str = "Java is easy";

        //A)
        System.out.println(str.substring(5));
        //B)
        System.out.println(str.substring(11));
        //C)
        System.out.println(str.substring(5, 9));
        //D)
        System.out.println(str.substring(8, 8));

        //Ans: B, C, D

        /*
        14.
        String text = "Max wants to go TJ-Maximum";

System.out.println(text.replace("Max", "Carl"));

What is the output?

A) Carl wants to go TJ-Maximum
B) Carl wants to go TJ-Carlimum
C) None of the givens
D) Carl wants to go Carl
         */

        String text = "Max wants to go TJ-Maximum";

        System.out.println(text.replace("Max", "Carl"));

        //Ans: B








    }
}
