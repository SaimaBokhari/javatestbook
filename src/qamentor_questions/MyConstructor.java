package qamentor_questions;

public class MyConstructor {
    int x= 3;
    MyConstructor(){
        System.out.println("-x" + x);  // -x5
    }

    MyConstructor(int x){
        this();
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        MyConstructor mc1 = new MyConstructor(4);  // -x4
        MyConstructor mc2 = new MyConstructor(); // -x5

    }
}
