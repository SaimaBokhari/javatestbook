package forloops;

public class Pg39 {
    public static void main(String[] args) {

        /*
4. Note: i=i-1 and i-- have the same meaning

for ( char i = 'f'; i>'a'; i--){
System.out.print(i + " " );
i--;
}
What is the output?
A) f d b
B) f e d c b
C) e c
D) Run Time Error
         */

        for ( char i = 'f'; i>'a'; i--){
            System.out.print(i + " " );
            i--;
        }

        // Ans: A

        System.out.println();

        /*
        5. int y = 1;
for (int i = 0; i<4; i++) {
y += i;
}
System.out.println(y);
What is the output?
A) 5
B) 6
C) 7
D) 8
         */
        int y = 1;
        for (int i = 0; i<4; i++) {
            y += i;
        }
        System.out.println(y);

        // Ans: C (7)


        /*
        6. for ( int i = 5; ?????? ; i++ ){
System.out.print( i + " " );
}
What should we type instead of ?????? to make the output
5 6 7 8 9
A) i<10
B) i<=10
C) i<9
D) i==9
         */

        for ( int i = 5; i<10 ; i++ ){
            System.out.print( i + " " );
        }

        //Ans: A






    }
}
