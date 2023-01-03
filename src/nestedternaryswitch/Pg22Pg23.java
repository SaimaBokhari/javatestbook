package nestedternaryswitch;

import java.util.Scanner;

public class Pg22Pg23 {
    public static void main(String[] args) {
        // Q1. ... anw is D)



        //Q.2
        int y = 1;
        int x = (y > 5) ? (y<10 ? 2+y : 3*y) : (y>10 ? 2*y : 3+y);
        System.out.println(x);  // if y=10  then x=30
                                // if y=4  then x=7
                                // if y=11  then x=22
                                // if y=1  then x=4
        // A and D are true

        // Q.3

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of the day");
        int numOfDay = input.nextInt();

        switch(numOfDay){
        case 1:
        System.out.println("Sunday");
        case 2:
        System.out.println("Monday");
        case 3:
        System.out.println("Tuesday");
        case 4:
        System.out.println("Wednesday");
        case 5:
        System.out.println("Thursday");
        case 6:
        System.out.println("Friday");
        case 7:
        System.out.println("Saturday");
        break;
        default:
        System.out.println("Enter a valid day number");
    }

    // correct ans is B



    }
}
