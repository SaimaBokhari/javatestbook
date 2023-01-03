package qamentor_questions;

public class MyClass {
    int x= 3;
    int y= 5;

    MyClass(){
        x += 1;
        System.out.println("-x" + x); // x becomes 4
    }
    MyClass(int i){    // i=3
        this ();
        this.y = i;    // y=i=3 so y=3
        x +=y;         // x=4 , y=3
        System.out.println("-x" + x); // -x7   becomes x=7
    }
    MyClass(int i, int i2){
        this(3);
        this.x -= 4;    // x=7-4 = 3
        System.out.println("-x" + x); // -x3 so x becomes 3
    }

    public static void main(String[] args) {
        MyClass mc1 = new MyClass(18,7);
    }

}
