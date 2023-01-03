package stringbuilder;

public class Pg80 {
    public static void main(String[] args) {
        /*
        1. StringBuilder strBld = new StringBuilder(6);
strBld.append("Learn");
strBld.append("Java");
System.out.println(strBld);

What is the output?
A) LearnJ
B) LearnJava
C) Run Time Error
D) Compile Time Error
         */

//        StringBuilder strBld = new StringBuilder(6);
//
//        strBld.append("Learn");
//        strBld.append("Java");
//        System.out.println(strBld);

        // Ans: B

        /*
        2. StringBuilder strBld = new StringBuilder("LearnJava");

Which ones are true for the given StringBuilder object?
A) strBld.substring(3);
System.out.println(strBld);
Prints LearnJava on the console

B) strBld.insert(0,"You");
System.out.println(strBld);
Prints YouLearnJava on the console

C) strBld.reverse();
System.out.println(strBld);
Prints avaJnraeL on the console

D) strBld.delete(5, 9);
System.out.println(strBld);
Prints Learn on the console
         */

        StringBuilder strBld = new StringBuilder("LearnJava");

        strBld.substring(3);
        System.out.println(strBld);

//        strBld.insert(0,"You");
//        System.out.println(strBld);

//        strBld.reverse();
//        System.out.println(strBld);

        strBld.delete(5,9);
        System.out.println(strBld);





    }
}
