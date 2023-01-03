package varargs;

public class Pg78 {

    public static void main(String[] args) {
        // Q.4
        m1(10);
        m1(11,12,13,14);
    }

    // Q.3
    /*
    3. Which ones give Compile Time Error?
A) public static void m4(int i, int... j, int... k) {
System.out.println(k.length);
}
B) public static void m4(int... j, int k) {
System.out.println(j.length);
}
C) private class Test02 {
}
D) protected class Test02 {
}
     */

    // Ans: All of the above


    // Q.4
    static void m1(int... a){
        System.out.println("==>" + a.length);

        for(int i : a){
            System.out.println(i + " ");
        }
        System.out.println();

        /*
        What is the output?
A) ==> 1
10
==> 4
11 12 13 14
B) ==> 10
1
==> 11 12 13 14
4
C) ==> 10
==> 11 12 13 14
         */

        // Ans: A

    }

}
