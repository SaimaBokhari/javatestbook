package statickeyword;

public class Test1 {
    //Pg 73, Q.7

    int y = 5;
    static int x=7;

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();

        t1.x = 17;
        t1.y = 15;

        System.out.println(t1.x);
        System.out.println(t2.x);
        System.out.println(t1.y);
        System.out.println(t2.y);

        // Ans: A

    }

}
