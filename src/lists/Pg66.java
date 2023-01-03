package lists;

import java.util.ArrayList;
import java.util.List;

public class Pg66 {

    List<String> list1 = new ArrayList<String>();
    public static void main(String[] args) {
        Pg66 obj1 = new Pg66();
        obj1.myMethod(obj1.list1);
        obj1.list1.add("z");
        obj1.list1.add("t");
        System.out.println(obj1.list1);

    }

    public List<String> myMethod (List<String> list1){
        list1.add("x");
        list1.add("y");
        return list1;
    }

    /*
    What is the output?
A) [x, y, z, t]
B) [x, y]
C) [z, t]
D) Compile Time Error

Ans: A
     */
}
