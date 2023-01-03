package forloops;

public class Pg38 {
    public static void main(String[] args) {

        /*
        1. Note: i=i+1 and i++ have the same meaning
for (int i = 1; i <= 6; i++) {
System.out.print(i + " ");
i++;
}

What is the output?
A) 1 3 5
B) 2 4 6
C) 1 2 3 4 5 6
D) Compile Time Error

         */

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + " ");
            i++;
        }

        // Ans: A

        System.out.println();

        /*
        2.
        for ( int j = 0; j <=10; ? ){
System.out.print( j + " " );
}
Which ones of the followings can be the ? to get 0 3 6 9 on the console as output?
A) j = j + 3
B) j = j - 3
C) j++
D) j--
         */

        for ( int j = 0; j <=10; j= j+3 ){
            System.out.print( j + " " );
        }
        // Ans: A

        /*
        3. for ( int j = 10; j >0; j++){
System.out.print("Hello");
}
How many times is Hello printed on the console?
A) 10
B) 11
C) 0
D) Infinitely many times
         */

        for ( int j = 10; j >0; j++){
            System.out.print("Hello");
        }
        // Ans: D










    }
}
