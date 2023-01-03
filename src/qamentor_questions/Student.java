package qamentor_questions;

public class Student {
    String name;
    int age;
    String phone;

    public Student(){}

    public Student (String name, int age, String phone){
        this.name = name;
        this.phone = phone;
       //  this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("John", 25, "077-887799" );
        System.out.println(s2.name + "," + s2.age + ", " + s2.phone);  // John,0, 077-887799

    }


}


