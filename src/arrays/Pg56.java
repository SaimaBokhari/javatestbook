package arrays;

import java.util.Arrays;

public class Pg56 {
    public static void main(String[] args) {
        /*
        4.
        int arr[] = {12, 23, 12, 2, 3};
Arrays.sort(arr);
System.out.println(Arrays.binarySearch(arr, 5));

What is the output?
A) Gives Compile Time Error
B) Gives Run Time Error
C) -3
D) -2
         */

//        int arr[] = {12, 23, 12, 2, 3};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.binarySearch(arr, 5));


        /*
        5. String s = "I liked to move it move it";

Which ones are true for the given String?

A) String arr[] = s.split(" "); (Note: There is space between double quotes)
System.out.println(arr.length);
Prints 7 on the console
B) String arr[] = s.split("move");
System.out.println(arr[1]);
Prints 'it' on the console (Note: Before and after it there is 1 space)
C) String arr[] = s.split("it");
System.out.println(Arrays.toString(arr));
Prints [I liked to move , move ] on the console
         */

//        String s = "I liked to move it move it";
//        String arr[] = s.split("it");
//        System.out.println(Arrays.toString(arr));

        // Ans: A, B, C

        /*
        6. String phoneNumber = "+1-407-640-1256";

Which ones print just 407 on the console?

A) System.out.println(phoneNumber.substring(3, 6));
B) String arr[] = phoneNumber.split("-");
System.out.println(arr[1]);
C) System.out.println(phoneNumber.substring(3));
D) String arr[] = phoneNumber.split("407");
System.out.println(arr[0]);
         */

        String phoneNumber = "+1-407-640-1256";

        String arr[] = phoneNumber.split("407");
        System.out.println(arr[0]);

        //Ans: A, B



    }
}
