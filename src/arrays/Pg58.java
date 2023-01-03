package arrays;

import java.util.Arrays;

public class Pg58 {
    public static void main(String[] args) {
        /*
        9.
String s = "Java, I like Java?"
String arr[] = s.split("");
int counter = 0;
for(int i=0; i<arr.length; i++) {
if(arr[i].equals("a")) {
counter++;
}
}
System.out.println("The number of the character: " + counter);

What is the output?
A) The number of the character: 3
B) The number of the character: 4
C) The number of the character: 5
D) The number of the character: 6
         */

//        String s = "Java, I like Java?";
//        String arr[] = s.split("");
//        int counter = 0;
//        for(int i=0; i<arr.length; i++) {
//            if(arr[i].equals("a")) {
//                counter++;
//            }
//        }
//        System.out.println("The number of the character: " + counter);

        // Ans: B


        /*
        10.
String s = "Java, I like Java?"
String arr[] = s.split("a");
System.out.println("The number of the character: " + (arr.length-1));

What is the output?
A) The number of the character: 3
B) The number of the character: 4
C) The number of the character: 5
D) The number of the character: 6
         */

        String s = "Java, I like Java?";
        String arr[] = s.split("a");

        System.out.println("The number of the character: " + (arr.length-1));

        //Ans: B


    }
}
