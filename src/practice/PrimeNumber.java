package practice;

import java.util.Scanner;

public class PrimeNumber {
    /*
    What is prime number?
    A number which is divisible by 1 and itself only. e.g. 3, 5, 7, 13
    int n, a =0;
    for(int i=2; i<=n-1; i++){
    a=a+1;
    }
    if(a>0){
        System.out.print("It's not a Prime number");
        }else{
         System.out.print("It's a Prime number");
        }
     */
    public static void main(String[] args) {
        int n, a=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        n = input.nextInt();
        for (int i=2; i<=n-1; i++){
            if (n%i==0){  // 7%2==1 not equal 0
                a=a+1;   // so a= 0+1 => 1
            }
        }
        if (a>0){
            System.out.print("It's not a Prime number");
        }else{
            System.out.print("It is a Prime number");
        }
    }

}
