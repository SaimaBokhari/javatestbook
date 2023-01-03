package nestedternaryswitch;

public class Pg24 {
    public static void main(String[] args) {
        // Q.4

//        char y = 'P';
//
//        String str = (y >'a' && y<'z') ? (y<'f'? "Good" : "Bad") : (y>'K' ? "Big" : "Small");
//        System.out.println(str);
        //Which ones sre true?
        // A) If y = 'c' then the value of str is Good.
        //B) If y = 'h' then the value of str is Bad
        //C) If y = 'K' then the value of str is Small
        //D) If y = 'P' then the value of str is Big

        // ans: A, B , C, D


        // Q.5
        int y= -17;
        boolean result = (y%2==0 || y<13) ? (true) : (y<0 ? true : false);
        System.out.println(result);

        /*
        Which one is false?

        A) if y = 12 then
        prints true on the console
        B) if y = -12 then
        prints true on the console
        C) if y = 15 then
        prints false on the console
        D) if y = -17 then
        prints false on the console

        Ans: D
         */

        // Q.6

        int a = 44;
        String reslt = (a%2!=0 && a>29) ? ("Good") : ("Bad");
        System.out.println(reslt);

        /*
        Which ones are true?

        A) If a = 33 then the output is Good
        B) If a = 29 then the output is Bad
        C) If a = 12 then the output is Bad
        D) If a = 44 then the output is Good

        Ans: A, B, C
         */

    }
}
