package multidimensionalarrays;

public class Pg62 {
    public static void main(String[] args) {
        int arr[][] = {{5, 12}, {3, 8, 4}, {6, 3}};
        System.out.println(m(arr));
    }
    public static int m(int[][] arr) {
        int r, c;
        int i, k = 0;
        for (r = 0; r < arr.length; r++) {
            for (c = 0; c < arr[0].length; c++) {
                i = arr[r][c];
                if (i > k)
                    k = i;
            }
        }
        return k;
    }
}
    /* What is the output?
        A) 12
        B) 8
        C) 3
        D) 5

     */

