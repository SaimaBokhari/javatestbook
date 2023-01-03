package varargs;

public class Pg79Q6 {

    static void m2(String str, int... a) {
        System.out.println(str);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {

        m2("**********");
        m2("Java", 101, 102);
        // m2(100, 101, 102);
        // m2(101, 102);
    }

    /*
    Which ones are true if you type the following codes instead of ********** ?
A) m2("Java", 101, 102);
The output is Java
101 102
B) m2(100, 101, 102);
The output is 100
101 102
C) m2(101, 102);
The output is 101 102
D) m2(100, 101, "102");
Gives Compile Time Error
     */

    //Ans: A, D

}
