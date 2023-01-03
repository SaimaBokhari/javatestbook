package nestedternaryswitch;

import java.util.Scanner;

public class Pg14toPg21 {
    public static void main(String[] args) {

        // Q.3)
        int num = 11;
//         num = num - 2; //9
//        num+=3; //9+3=12
//        num++; //12+1=13
//        System.out.println(num);

//        num = num + 2; //13
//        num--; //12
//        num--;  //11
//        System.out.println(num);

        num += 3;   // 11+3=14
        num += 2;   // 14+2=16
        num--;    // 15
        System.out.println(num);

        // Q.7)
        int result = 2 + 3 * (12 - 4 / 2) / 15 - 3;
        //  2+3*(10)/15-3
        // 2+30/15-3
        // 2+2-3 = 1
        System.out.println(result);

// Q.8)
        double x = 5, y = 2.0;
        double result1 = 5 / 2.0;
        System.out.println(result1);


        // Q.10)

        int age = 12;
        char initial = 'J';

        System.out.println(age + initial);


        // Q.3  Pg. 18
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        String day = scan.next();
        char ch1 = day.charAt(1);
        char ch2 = day.charAt(3);

        //A)
        System.out.println(ch1 + ch2);
        //B)
        System.out.println("Result: " + ch1 + ch2);
        //C)
        System.out.println("" + ch1 + ch2);

        // Q.10) Pg. 21
        int a = -5;
        int res = a < 0 ? (-1)*a : a;
        System.out.println(res);

        //A)

        if (a < 0) {
            System.out.println((-1) * a);
        } else {
            System.out.println(a);
        }

        // B)

        if (a > 0) {
            System.out.println(a);
        } else {
            System.out.println((-1) * a);
        }

        // C)

        if (a < 0) {
            System.out.println((-1) * a);
        } else {
            System.out.println(a);
        }







    }
}
