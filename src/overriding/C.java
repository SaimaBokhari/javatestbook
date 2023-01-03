package overriding;
//Pg 101, Q.1
public class C {
    public static void main(String[] args) {
        //A
        B obj1 = new B();
        obj1.display();
        System.out.println(obj1.i);

        // B
        A obj2 = new B();
        obj2.display();
        System.out.println(obj2.i);

        // C

        A obj3 = new A();
        obj3.display();
        System.out.println(obj3.i);

        // D
//        B obj4 = new A();
//        obj4.display();
//        System.out.println(obj4.i);

        //Ans: D is false as it gives compile time error



    }
}
