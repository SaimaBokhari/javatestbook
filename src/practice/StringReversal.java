package practice;

import java.util.Scanner;

public class StringReversal {
    /*
    Logic:
    String original;
    String reverse = "";
    int length = original.length();

    for(int i=length-1; i>=0; i--){
    reverse = reverse+original.charAt(i);
    }
    System.out.println(reverse);

     */
    public static void main(String[] args) {
        String str;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string to be reversed");
        str =input.nextLine();

        // to find the length of the given string
        int length = str.length();
        // To store the reverse string we create an empty string
        String reverse = "";

        for (int i=str.length()-1; i>=0;i--){
            reverse=reverse+str.charAt(i);
        }
        System.out.println(reverse);

    }
}

