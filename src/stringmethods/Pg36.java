package stringmethods;

public class Pg36 {
    public static void main(String[] args) {
        /*
        18.
        String s = " Tom Hanks ";
Note: There are 3 space characters at the beginning, 2 space characters at the end, a single space
character between Tom and Hanks

Which one is true?

A) String s1 = s.trim();
System.out.println(s1);
Prints TomHanks on the console
B) String s1 = s.trim();
System.out.println(s1);
Prints Tom Hanks on the console
C) String trimmedString = s.trim();
System.out.println(s);
Prints Tom Hanks on the console
D) String trimmedString = s.trim();
System.out.println(s);
Prints TomHanks on the console
         */

 //       String s = " Tom Hanks ";

        // A)
//        String s1 = s.trim();
//        System.out.println(s1);

        //B)
//        String s1 = s.trim();
//        System.out.println(s1);
//
//        //C)
//        String trimmedString = s.trim();
//        System.out.println(s);
//
//        //D)
//        String trimmedString = s.trim();
//        System.out.println(s);

        // Ans: B

        /*
        19. String s = "Java is Java";

Which one is true?

A) System.out.println(s.indexOf('a'));
Prints 2 on the console
B) System.out.println(s.indexOf("Java"));
Prints 0 on the console
C) System.out.println(s.indexOf('a', 4));
Prints 10 on the console
D) System.out.println(s.indexOf("va", 2));
Prints 10 on the console
         */

        String s = "Java is Java";

        // A)
        System.out.println(s.indexOf('a'));

        // B)
        System.out.println(s.indexOf("Java"));

        // C)
        System.out.println(s.indexOf('a', 4));

        //D)
        System.out.println(s.indexOf("va", 2));

        //Ans: B



    }
}
