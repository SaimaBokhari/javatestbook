package lists;

import java.util.ArrayList;
import java.util.List;

public class Pg63 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("F");
        list.add("D");

        list.set(2, "C");
        System.out.println(list);

        list.add(1,"*");
        System.out.println(list);

        list.contains("F");
        System.out.println(list);

        System.out.println(list.isEmpty());


        //Ans: A

    }
}
