package whileloops;

public class Pg43 {
    public static void main(String[] args) {

/*
3. Which ones of the followings print 2 4 6 8 on the console?

A) int k = 1;
while(k<5) {
System.out.print(2*k + " ");
k++;
}
B) int k = 1;
while(k<=8) {
if(k%2==0) {
System.out.print(k + " ");
}
k++;
}
C) for(int i=2; i<=8; i=i+2) {
System.out.print(i + " ");
}
D) for(int i=1; i<=8; i++) {
if(i%2==0) {
System.out.print(i + " ");
}
}
 */

        for(int i=1; i<=8; i++) {
            if(i%2==0) {
                System.out.print(i + " ");
            }
        }



        // Ans: A, B, C, D




    }
}
