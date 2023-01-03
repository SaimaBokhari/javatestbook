package lists;

import java.util.ArrayList;
import java.util.List;

public class Pg68 {
    public static void main(String[] args) {
        /*
        Q.10

        int arr[] = {2, 4, 6, 8};
List<Integer> list = new ArrayList<>();
int i = 0;
do {
list.add(arr[i]);
i++;
} while (i < arr.length);
System.out.println(list);
}

What is the given code snippet doing?

A) Converting an array to a list
B) It gives Compile Time Error
C) Converting a list to an array
D) It gives Run Time Error
         */

        int arr[] = {2, 4, 6, 8};
        List<Integer> list = new ArrayList<>();
        int i = 0;
        do {
            list.add(arr[i]);
            i++;
        } while (i < arr.length);
        System.out.println(list);


        // Ans: A




    }
}
