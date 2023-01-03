package qamentor_questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Qa_day3 {
    public static void main(String[] args) {

        //Example 8 -[0,2,3,2,12,2] put all twos to the end---> [0 3 12 2 2 2 ]

        int arr[] = {0, 2, 3, 2, 12, 2};
        int brr[] = new int[arr.length];

        int idx = 0;
        int x = brr.length-1;

        for (int w : arr) {
            if (w != 2) {
                brr[idx] = w;
                idx++;   // [0, 3, 12, 0, 0, 0]
            }
        }
        for (int w : arr){
            if (w==2){
                brr[x]=w;
                x--;

            }
        }
        System.out.println(Arrays.toString(brr));  // [0, 3, 12, 2, 2, 2]


        List<String> s = new ArrayList<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");

        System.out.println(s.remove(2));



    }
}





