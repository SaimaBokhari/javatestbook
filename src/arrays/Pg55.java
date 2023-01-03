package arrays;

import java.util.Arrays;

public class Pg55 {
    public static void main(String[] args) {

        /*
        1.
        int arr1[] = {1, 2, 3};
int arr2[] = {1, 2, 3};
int arr3[] = {3, 2, 1};

Which ones print true on the console?
A) System.out.println(Arrays.equals(arr1, arr3));
B) System.out.println(arr1==arr1);
C) System.out.println(Arrays.equals(arr1, arr2));
D) System.out.println(arr1.equals(arr2));
         */

        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3};
        int arr3[] = {3, 2, 1};


        System.out.println(Arrays.equals(arr1, arr3));
        System.out.println(arr1==arr1);
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(arr1.equals(arr2));

        //Ans: B, C

        /*
        2.
        int arr[] = {1, 23, 12, 2, 3};
Which code is correct to check if 12 is the element of the array arr or not?
A) Arrays.sort(arr);
System.out.println(Arrays.binarySearch(arr, 12));
B) System.out.println(Arrays.binarySearch(arr, 12));
C) Arrays.sort(arr);
System.out.println(Arrays.binarySearch(12));
D) System.out.println(Arrays.binarySearch(12));
         */

//        int arr[] = {1, 23, 12, 2, 3};
//
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.binarySearch(arr, 12));
//
//        System.out.println(Arrays.binarySearch(arr, 12));
//
////         Arrays.sort(arr);
//        System.out.println(Arrays.binarySearch(12));
//
//        System.out.println(Arrays.binarySearch(12));

        // Ans: A, B
        // C, D don't have the arr in the code , that's why compile time error

        /*
        3. int arr[] = {12, 23, 13, 2, 3};
Arrays.sort(arr);
System.out.println(Arrays.binarySearch(arr, 12));

What is the output?
A) 2
B) 3
C) [2, 3]
D) Gives Compile Time Error
         */

        int arr[] = {12, 23, 13, 2, 3};
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 12));


        // Ans: A




    }
}
