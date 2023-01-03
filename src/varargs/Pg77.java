package varargs;

public class Pg77 {

    public static void main(String[] args) {

        // Q.1
        System.out.println(m1(true, false, true));
        System.out.println(m1(false,true));
        System.out.println(m1(true, false, true,true));
       //  System.out.println(m1());


        //Q.2
        System.out.println(m3("Result:",2,3,4));
//        System.out.println(m3("Result:", 2,2.5));  // This should be false coz the data types don't match.
        System.out.println(m3("Result:"));
        System.out.println(m3("Result:", 2));

    }

    // Q.1

    public static int m1(boolean b1, boolean... b2){
        return b2.length;
    }
    //Q.2

    public static int m3(String x, int... y){
        int p= 1;
        for(int w : y){
            p = p* w;
        }
        return p;
    }






}