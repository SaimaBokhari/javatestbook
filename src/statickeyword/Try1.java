package statickeyword;

public class Try1 {
    public static void main(String[] args) {

        //Pg 70, Q.4
        m1(33);
        m1(33,44);
        //m1(33.3, 44);
        //m1(33.3);
    }

    public static void m1(float x){
        System.out.println("Method 1");
    }

    public static void m1(int x, double y){
        System.out.println("Method 2");
    }

// Ans: C and D

}
