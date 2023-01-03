package qamentor_questions;

public class MyClass1 {
    int x;   // 2 , updated to 3
    static int y;   // 2, 3
    MyClass1(int i){
        x += i;  // 2  ... removes 2 and updated value is 3 mc.x will be 3
        y += i;  // 2  ... because y is static, it doesn't remove the previous value of y (2) , it adds 3 to 2 == 5
    }

    public static void main(String[] args) {
        new MyClass1(2);
        MyClass1 mc = new MyClass1(3);
        System.out.println(mc.x + "," + mc.y);
    }
}
