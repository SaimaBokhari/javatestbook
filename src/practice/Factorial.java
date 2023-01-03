package practice;

import java.util.Scanner;

public class Factorial {
    /*
    Logic:
    int f=1, n;
    for( int i=1,i<n+1;i++){
    f=f*i;
    }
    System.out.print("Factorial of "+n+ "is "+f);
     */
    public static void main(String[] args) {

        int f=1, n;

        Scanner input = new Scanner(System.in );
        System.out.println("Enter a number");
        n=input.nextInt();

        for (int i=1;i<n+1;i++){
            f=f*i;
        }
        System.out.println("Factorial of "+n+ " is "+f);
    }
}
