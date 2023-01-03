package whileloops;

public class Pg47 {
    public static void main(String[] args) {
        /*
        9.
int x = 1, y = 15;
while (x < 4) {
y--;
x++;
}
System.out.println(x + ", " + y);

What is the output?

A) 4, 12
B) 5, 13
C) 3, 11
D) Compile Time Error
         */

        int x = 1, y = 15;
        while (x < 4) {
            y--;  // 14, 13,12
            x++;  // 2,3,4
        }
        System.out.println(x + ", " + y);


        // Ans: A

        /*
        10.
int m = 10;
int n = 2;
int sum = 0;
while(m > n) {
m--;
n = n + 2;
sum = sum + m + n;
}
System.out.println(sum);

What is the output?

A) 42
B) 40
C) 38
D) 36
         */

        int m = 10;
        int n = 2;
        int sum = 0;
        while(m > n) {           // 10>2, 9>2,
            m--;                // 9, 8,7,6 loop breaks
            n = n + 2;          // 4, 6,8
            sum = sum + m + n;  // 13,27,42
        }
        System.out.println(sum);

        // Ans: A


    }
}
