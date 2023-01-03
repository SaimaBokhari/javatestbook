package alltypesofloops;

public class Pg48 {
    public static void main(String[] args) {

        /*
        1.
int x = 4;
long y = x * 4 - (x + 1);
if(y<11) {
System.out.println("Too Low");
} else if(x>11){
System.out.println("Too High");
} else {
System.out.println("Just Right");
}

What is the output?

A) Just Right
B) Too High
C) Too Low
D) Compile Time Error
         */

//        int x = 4;
//        long y = x * 4 - (x + 1);
//
//        if(y<11){
//            System.out.println("Tow Low");
//        }else if(x>11){
//            System.out.println("Too High");
//        }else{
//            System.out.println("Just right");
//        }

        // Ans: A

        /*
        2.
int x = 6;
int result = x > 3 ? x < 5 ? 11 : 9 : 8;
System.out.println(result);

What is the output?

A) 11
B) 9
C) 8
D) Compile Time Error

         */

        int x = 6;
        int result = x > 3 ? x < 5 ? 11 : 9 : 8;
        System.out.println(result);


        // Ans: B




    }
}
