package practice;

import java.util.Scanner;

public class ArmstrongNumber {
    /*
    What's an Armstrong Number?
    If we add the cube of each number (in a given number) and get the original numer, it's called an ArmstrongNumber.
    153 = (1)3 + (5)3 + (3)3
    153 = 153

    int n, remainder, sum=0;
    int a=n;
    while(n>0){
    remainder= n%10;
    sum=sum+remainder*remainder*remainder;
    n=n/10;
    }
    if(a==sum){
    System.out.print("It's an Armstrong Number");
    }else{
         System.out.print("It's not an Armstrong Number");
    }

     */
    public static void main(String[] args) {
        int remainder, sum=0,a, n;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        n = input.nextInt();
        a=n;

        while(n>0){
            remainder=n%10;
            sum = sum+remainder*remainder*remainder;
            n=n/10;
        }
        if (a==sum){
            System.out.print("It's an Armstrong Number.");

        }else {
            System.out.print("It's not an Armstrong Number.");
        }


    }
}
