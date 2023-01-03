package multidimensionalarrays;

import java.util.Arrays;

public class Pg61 {
    public static void main(String[] args) {
        int arr[][] = { {3,2,1},{1,2,3} };
        for (int i = 1; i < arr.length; i++) {
            for (int k = 1; k < arr[0].length; k++) {
                if (arr[i][k] % 2 == 1){
                    arr[i][k] = arr[i][k] + 1;
                }
                if (arr[i][k] % 2 == 0){
                    arr[i][k] = arr[i][k] * 2;
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
   /*
   What is the output?

        A) [[3, 2, 1], [1, 4, 8]]
        B) [[4, 3, 2], [1, 4, 8]]
        C) [[4, 3, 2], [1, 2, 3]]
        D) [[3, 2, 1], [1, 2, 3]]

    */

// Ans: A

