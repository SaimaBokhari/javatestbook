package lists;

import java.util.ArrayList;
import java.util.List;

public class Pg67 {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<Character>();
        for (char i = 'a'; i <= 'e'; i++) {
            list.clear();
            list.add(i);
        }
        System.out.println(list);

        /*What is the output?
        A) [ ]
        B) [ e ]
        C) [a, b, c, d, e]
        D) Compile Time Error

         */

        // Ans: B


        /*
        8. Which ones give Compile Time Error?
A) List<Character> list = new ArrayList<Character>();
B) List<int> list = new ArrayList<>();
C) ArrayList<> list = new ArrayList<String>();
D) ArrayList<boolean> list = new ArrayList<>();
         */

         // Ans: B,C,D

/*
9. public static void main(String[] args) {
List<Integer> list = new ArrayList<>();
list.add(3);
list.add(5);
list.add(7);
list.add(9);
int i = 0;
int x = 0;
while(i<list.size()) {
x = x + list.get(i);
i++;
}
System.out.println(x);
}

What is the output?
A) 24
B) Compile Time Error
C) 9
D) 15
 */
        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(9);
        int i = 0;
        int x = 0;
        while(i<list1.size()) {
            x = x + list1.get(i);
            i++;
        }
        System.out.println(x);

        //Ans: A




    }

}
