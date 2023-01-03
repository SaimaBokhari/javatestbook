package alltypesofloops;

public class Pg49 {
    public static void main(String[] args) {
        /*
        3.
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
        while(m > n) {
            m--;
            n = n + 2;
            sum = sum + m + n;  // 14+13+12+11+10+9+7
        }
        System.out.println(sum);

        // Ans: A

        /*
        4.
int i = 1;
int x = 2;
while(i < 4){
x = x + i;
i++;
}
System.out.print(x);

What is the output?
A) 7
B) 8
C) 9
D) 10
         */

        int i = 1;
        int x = 2;
        while(i < 4){
            x = x + i;   // 2+1=3, 3+2=5, 5+3=8, loop breaks
            i++;
        }
        System.out.print(x);


        // Ans: B




    }
}
