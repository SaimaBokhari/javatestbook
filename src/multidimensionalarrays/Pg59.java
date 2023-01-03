package multidimensionalarrays;

public class Pg59 {
    public static void main(String[] args) {
        /*
        1. public class Test01 {
public static void main(String[] args) {
int[][] x = {{2, 1}, {1, 7, 1}};
System.out.println(m(x[1]));
}
public static int m(int[] m) {
int result = 0;
for (int i = 0; i < m.length; i++){
result += m[i];
}
return result;
}
}

What is the output?
A) 8      B) 9        C) 10        D) 11
         */

//        int[][] x = {{2, 1}, {1, 7, 1}};
//        System.out.println(m(x[1]));   // (m(1,7,1))
//    }
//    public static int m(int[] m) {
//        int result = 0;
//        for (int i = 0; i < m.length; i++){   // 0<2, 1<2,
//            result += m[i];                   // 1+7+1
//        }
//        return result;

        // Ans: B

        /*
        2. public class Test02 {
public static void main(String[] args) {
int[][] x = {{1, 2}, {3, 4, 5}};
System.out.println(m(x));
}
public static int m(int[][] m) {
int result = 3;
for (int i = 0; i < m.length; i++) {
for (int j = 0; j < m[i].length; j++) {
result += m[i][j];
}
}
return result;
}
}
A) 15      B) 16       C) 17       D) 18
         */

        int[][] x = {{1, 2}, {3, 4, 5}};
        System.out.println(m(x));
    }

    public static int m(int[][] m) {
        int result = 3;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                result += m[i][j];
            }
        }
        return result;
    }
}



        // Ans: D
