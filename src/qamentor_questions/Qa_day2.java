package qamentor_questions;

public class Qa_day2 {
    public static void main(String[] args) {

        //Ask user to enter a positive integer and then find and print the sum of the
        // digits of that number by using while loop


//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a positive number");
//        int num = input.nextInt();
//
//        int sum = 0;
//        while (num>0){   // 24%10
//            sum=sum+num%10;
//            num/=10;
//        }
//        System.out.println(sum);

        //Type code to print repeated characters in a String by using while loop
        // Example: String str = "accessories";   ==>  ces

        String str = "accessories";
        String repeated = "";
        int i = 0;
        while (i < str.length()) {
            String st = str.substring(i, i + 1);
            if (str.indexOf(st) != str.lastIndexOf(st) && !repeated.contains(st))
                repeated = repeated + st;
                i++;
            }
            System.out.println(repeated);





    }
}