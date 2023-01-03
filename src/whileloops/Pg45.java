package whileloops;

public class Pg45 {
    public static void main(String[] args) {

        /*
        6. Which ones of the followings print 0 on the console?
A) int i=1;
int product=0;
while(i<=4) {
product = product * i;
i++;
}
System.out.println(product);
B) int j=1;
int sum=0;
while(j<1) {
sum = sum + j;
j++;
}
System.out.println(sum);
C) int j=1;
int sum=0;
while(j==1) {
sum = sum + j;
j++;
}
System.out.println(sum);
         */

        int j=1;
        int sum=0;
        while(j==1) {
            sum = sum + j;
            j++;
        }
        System.out.println(sum);

        // Ans: A, B



    }
}
