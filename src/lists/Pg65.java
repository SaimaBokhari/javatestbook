package lists;

import java.util.ArrayList;
import java.util.List;

public class Pg65 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

// Note: get() method returns the list element whose index is given as a parameter
//Ans: A


        /* Q.5

        int arr[] = new int[5];
ArrayList<Integer> list = new ArrayList<Integer>();
for (int i = 1; i <= arr.length; i++) {
list.add(i);
}
System.out.println(list);
}

What is the output?
A) [1, 2, 3, 4, 5]
B) [ ]
C) Compile Time Error
D) [1, 2, 3, 4]
         */

        int arr[] = new int[5];
        List<Integer> list1 = new ArrayList<Integer>();
        for (int i = 1; i <= arr.length; i++) {
            list1.add(i);
        }
        System.out.println(list1);







    }
}
