package statickeyword;

public class Try {

    // Pg69, 70
    static int a = 10;

    public static void main(String[] args) {

        // Q.1
        Try t1 = new Try();
        Try t2 = new Try();

//        t1.a = a+2;
//        t2.a = a+3;
//        System.out.println(t1.a);
//        System.out.println(t2.a);

        //Q.2

        t1.a = 12;
        t2.a = 13;
        System.out.println(t1.a);
        System.out.println(t2.a);


    }
}

