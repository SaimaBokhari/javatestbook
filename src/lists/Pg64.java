package lists;

import java.util.ArrayList;
import java.util.List;

public class Pg64 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

//        list.remove(3);
//        list.remove("A");
//        System.out.println(list);


        /*
What is the output?
A) [B, C]
B) Run Time Error
C) [B, C, D]
D) Compile Time Error
 */

//Ans: A

        // Q.3

        System.out.println(list.remove(2));
        System.out.println(list.remove("C"));


        //Ans: A



    }
}
