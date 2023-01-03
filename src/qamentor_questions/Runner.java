package qamentor_questions;

public class Runner {
    public static void main(String[] args) {

        //Car car1 = new Car();


        Car car2 = new Car(5000, "Audi", "Q5");
        System.out.println(car2.make);
        System.out.println(car2.price$);
        System.out.println(car2);

        Car car3 = new Car(4000, "GMC", "Yukon");


//        Student st = new Student("Oliver", 21);
//        System.out.print(st.name);
//        System.out.print(" ," + st.age);

    }
}
