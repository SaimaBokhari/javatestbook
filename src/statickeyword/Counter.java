package statickeyword;

public class Counter {
    //Pg 72, Q.6

    int count = 0;
    Counter(){
        count +=2;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        //Ans: A because int count variable is not static.
    }


}
