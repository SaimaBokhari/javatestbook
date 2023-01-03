package practice;

import java.util.Scanner;

public class Fibonacci {
    /*
    Logic:
    Fibonacci is series of numbers in which first two numbers are fixed : 0 and 1
    The next numbers are obtained by adding the previous two numbers:
    1st numb:0  +  2nd numb=1 = 3rd number
        0       +      1      =    1
        1       +      2      =    3
        2       +      3      =    5
        3       +      5      =    8
        4       +      8      =    12  ....

        int first=0, second=1, next, number;
        for(int i=0;  i<number; i++){
            if(i<1){
            next=i;
            }else{
             next = first+second;
             first = second;
             second = next;
            }
            System.out.print(" "+next);
        }

     */
    public static void main(String[] args) {
        int first=0, second =1, i, number, next;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        number = input.nextInt();

        for (i=0; i<number; i++){
            if (i<1){
                next=i;
            }else{
                next = first+second;
                first = second;
                second = next;
            }
            System.out.print(" " +next);
        }



    }
}
