package practice;

public class CallByValue {
    /*
    Calling a method by passing a value is called Call by Value.
    Original value will not change.
     */
    int marks = 77;   // class variable

    void subject(int marks){
        marks = marks-8;  // local variable
        System.out.println(marks);
    }


    public static void main(String[] args) {
        CallByValue s1 = new CallByValue();   // creating a new class object
        System.out.println("Before any changes in marks: " + s1.marks);

        s1.subject(98);

        System.out.println("After changes: "+ s1.marks); // the original value will not change

    }
}
