package stringmethods;

public class Pg35 {
    public static void main(String[] args) {
        /*
        15. String str = "Ayhan BEYHAN";

Which ones change the given String to AYHAN beyhan?

A) str = str.substring(0,5).toUpperCase();
str = str.substring(6).toLowerCase();
B) str = str.replace("Ayhan", "AYHAN");
str = str.replace("BEYHAN", "beyhan");
C) str = str.replace('Ayhan', 'AYHAN');
str = str.replace('BEYHAN', 'beyhan');
E) str = str.replace(str.substring(0), "AYHAN beyhan");
         */
        String str = "Ayhan BEYHAN";

        //A)
//        str = str.substring(0,5).toUpperCase();
//        str = str.substring(6).toLowerCase();
//        //B)
//        str = str.replace("Ayhan", "AYHAN");
//        str = str.replace("BEYHAN", "beyhan");
        // C)
//        str = str.replace('Ayhan', 'AYHAN');
//        str = str.replace('BEYHAN', 'beyhan');
        // E)
//        str = str.replace(str.substring(0), "AYHAN beyhan");
        System.out.println(str);

        // Ans: A, B,  D

        /*
        16. String s = "123-Start!!!";
Which ones are true?

A) System.out.println(s.replaceAll("\\W", "*"));
Prints 123*Start*** on the console
B) System.out.println(s.replaceAll("\\S", "*"));
Prints ************ on the console
C) System.out.println(s.replaceAll("[^Start]", "*"));
Prints ****Start*** on the console
D) System.out.println(s.replaceAll("\\A", "!!!"));
Prints !!!123-Start!!! on the console
         */

//         String s = "123-Start!!!";
//
//         //A)
//         System.out.println(s.replaceAll("\\W", "*"));
//
//        //B)
//        System.out.println(s.replaceAll("\\S", "*"));
//
//        //C)
//        System.out.println(s.replaceAll("[^Start]", "*"));
//
//        //D)
//        System.out.println(s.replaceAll("\\A", "!!!"));


        //Ans: All

        /*
        17. String s = "123-Start";
Which ones are true?
A) System.out.println(s.replaceAll("\\d", ""));
Prints 123 on the console
B) System.out.println(s.replaceAll("\\w", ""));
Prints nothing on the console.
C) System.out.println(s.replaceAll("[at]", "*"));
Prints 123_S**r* on the console.
D) System.out.println(s.replaceAll("\\Z", "*"));
Prints 123_Start* on the console.
         */


        String s = "123-Start";

        // A)
        System.out.println(s.replaceAll("\\d", ""));

        // B)
        System.out.println(s.replaceAll("\\w", ""));

        // C)
        System.out.println(s.replaceAll("[at]", "*"));

        // D)
        System.out.println(s.replaceAll("\\Z", "*"));

        //Ans: B,C,D

    }
}
