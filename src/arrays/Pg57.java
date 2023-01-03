package arrays;

import java.util.Arrays;

public class Pg57 {
    public static void main(String[] args) {
        /*
        7.
public class Test01 {
public static void main(String args[]){
String input = "Hello Welcome to TechPro Education";
String[] result1 = input.split(" ");
String[] result2 = input.split("X");
System.out.println(result1.length + "-" + result2.length);
}
}
What is the output?
A) 5-1
B) 4-0
C) 6-2
D) 4-2
         */

        String input = "Hello Welcome to TechPro Education";
        String[] result1 = input.split(" ");
        System.out.println(Arrays.toString(result1));

       String[] result2 = input.split("X");
        System.out.println(Arrays.toString(result2));
        System.out.println(result1.length + "-" + result2.length);

        //Ans: A

        /*
        8.
int arr[] = {21, 22, 23, 24, 25, 26};

Which one is false?

A) System.out.println(arr[1]);
prints 22 on the console
B) System.out.println(arr.length);
prints 6 on the console
C) System.out.println(arr[6]);
prints 26 on the console
D) for(int i=0; i<arr.length; i++) {
System.out.print(arr[i] + " ");
}
prints 21 22 23 24 25 26 on the console
         */

        int arr[] = {21, 22, 23, 24, 25, 26};

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Ans: C




    }
}
