package nestedternaryswitch;

public class Pg25Pg26 {
    public static void main(String[] args) {

        // Q.7

        int i = 1;
        int j = 0;
        switch (i) {
            case 2 :
                j += 6;
            case 4 :
                j += 1;
            case 1 :
                j += 4;
            default :
                j += 0;
        }
        System.out.println("j = " + j);

        /*
        What is the output?
        A) j = 6
        B) j = 4
        C) j = 2
        D) j = 0

        Ans: A
         */

        // Q.8
        char ch = 'a';

        switch (ch){
            case 'a' :
            case 'A' :
                System.out.print(ch);
                break;
            case 'b' :
            case 'B' :
                System.out.print(ch);
                break;
            case 'c' :
            case 'C' :
                System.out.print(ch);
                break;
            case 'd' :
            case 'D' :
                System.out.print(ch);
        }
        /*
        What is the output?
        A) a
        B) a
           a
        C) a
           A
        D) a
           a
           A
           A

        Ans: A

         */







    }
}
