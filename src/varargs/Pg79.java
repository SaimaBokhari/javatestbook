package varargs;

public class Pg79 {

    // Q.5
    public static void main(String[] args) {
        //Q.5
        System.out.println(m2(1,2,3,4));

    }

    public static int m2(int i, int j, int...k){
        System.out.println(k.length);
        return i;
    }

    /*
    Which one is false?
A) m2(1, 2, 3, 4);
Prints 4 on the console
B) m2(1, 2, 3, 4, 5);
Prints 3 on the console
C) m2(1, 2);
Prints 0 on the console
D) m2(1);
Gives Compile Time Error
     */


    //Ans: A is false


}
