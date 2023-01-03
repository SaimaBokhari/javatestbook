package practice;

import java.util.Scanner;

public class Palindrome {
    /*
    What is Palindrome?
    When the reverse of a number is same as the number, it's called Palindrome

    153 = 351 = F    It is not a palindrome.
    121 = 121 = T    It is a palindrome.
    15451 = 15451 = T    It is a palindrome.

    int remainder, sum=0, a, n;
    a=n;
    while(n>0){
    remainder=n%10;
    sum = (sum*10)+remainder;
    n=n/10;
    }
    if(a==sum){
    System.out.print("It's a Palindrome");
    }else{
    System.out.print("It's not a Palindrome");
    }

     */
    public static void main(String[] args) {
        int remainder, sum=0, a, n;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        n = input.nextInt();
        a=n;

        while(n>0){
            remainder=n%10;
            sum = (sum*10)+remainder;
            n=n/10;
        }
        if (a==sum){
            System.out.print("It's a Palindrome");
        }else{
            System.out.print("It's not a Palindrome");
        }


    }
}
