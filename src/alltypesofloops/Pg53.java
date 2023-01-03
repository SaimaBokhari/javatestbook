package alltypesofloops;

public class Pg53 {
    public static void main(String[] args) {

        /*
        8.
public static void main(String[] args) {
add(3.0,4.0); // Output A
add(5, 6); // Output B
add(7, 8.0); // Output C
subtract(9, 10); //Output D
}
public static void add(double n1, double n2) {
System.out.println(n1 + n2);
}
public static void add(int n1, int n2) {
System.out.println(n1 + n2);
}
public void subtract(int n1, int n2) {
System.out.println(n1 - n2);
}
Which ones are true for the given code?
A) Output A is 7
B) Output B is 11
C) Output C is 15.0
D) Output D is -1
         */

        add(3.0,4.0);    // Output A
        add(5, 6);       // Output B
        add(7, 8.0);     // Output C
   //      subtract(9, 10); //Output D
    }
    public static void add(double n1, double n2) {
        System.out.println(n1 + n2);
    }
    public static void add(int n1, int n2) {
        System.out.println(n1 + n2);
    }
    public void subtract(int n1, int n2) {
        System.out.println(n1 - n2);


    // Ans: A,B,C
    // D is not true because the method doesn't have "static" keyword, hence inaccessible.


    }
}
