package whileloops;

public class Pg46 {
    public static void main(String[] args) {
        /*
        7.
        for(int i=1; i<=5; i++) {
for(int j=(5-i); j>1; j--) {
System.out.print(i+j);
}
System.out.println();
}

What is the output?
A) 543
54
5
B) 432
43
4
C) 5
4
3
D) 4
3
2
         */

        for(int i=1; i<=5; i++) {
            for(int j=(5-i); j>1; j--) {
                System.out.print(i+j);
            }
            System.out.println();
        }

        //Ans: A


        /*
        8. public static void main(String[] args) {
int x = 0;
while(x < 10){
x++;
}
String message = x > 10 ? "Greater than" : "Less than";
System.out.println(message+" "+x);
}

What is the output?

A) Less than 10
B) Greater than 10
C) Compile Time Error
D) Run Time Error
         */

        int x = 0;
        while(x < 10){
            x++;
        }
        String message = x > 10 ? "Greater than" : "Less than";
        System.out.println(message+" "+x);

        //Ans: A




    }
}
