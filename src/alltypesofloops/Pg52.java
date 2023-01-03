package alltypesofloops;

import java.util.Scanner;

public class Pg52 {
    public static void main(String[] args) {

        /*
        7.
Scanner scan = new Scanner(System.in);
String s = "";
do {
System.out.println("Enter your password");
s = scan.nextLine();
if(s.length()>6 && s.charAt(0)=='A') {
System.out.println("It is okay");
}else {
System.out.println("Make the length longer than 6");
}
}while(!(s.length()>6));
scan.close();

Which ones are true for the given codes?
A) If user enters Alignment, the output is It is okay
B) If user enters Align, the output is Make the length longer than 6
C) If user enters Aligns, the output is
Make the length longer than 6
Enter your password
D) Compile Time Error
         */


        Scanner scan = new Scanner(System.in);
        String s = "";

        do {
            System.out.println("Enter your password");
            s = scan.nextLine();
            if(s.length()>6 && s.charAt(0)=='A') {
                System.out.println("It is okay");
            }else {
                System.out.println("Make the length longer than 6");
            }
        }while(!(s.length()>6));
        scan.close();


        // Ans: C

    }
}
