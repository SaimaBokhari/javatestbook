package practice;

import java.util.Arrays;

public class SortingAnArray {
    public static void main(String[] args) {

        int arr[] = {23,78,55,12,38,99,85};
        Arrays.sort(arr);

        for (int i=0; i<arr.length-1; i++) {
            System.out.print(" " +arr[i]);
        }

    }
}
