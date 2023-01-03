package forloops;

public class Pg40Pg41 {
    public static void main(String[] args) {

        /*
        Note: ASCII value of 'A' is 65
for(int i = 65; i < 68 ; i++){
System.out.print((char)i);
}
A) ABC
B) 656667
C) CBA
D) 65B67
         */
//        for(int i = 65; i < 68 ; i++){
//            System.out.print((char)i);
//        }

        // Ans: A



        /*
        8.
for(int i = 65; i < 68 ; i--){
System.out.println(i);
}
How many numbers do you see on the console?
A) 3
B) 4
C) 5
D) Infinitely many
         */

//        for(int i = 65; i < 68 ; i--){
//            System.out.println(i);
//        }

        // And: D

        /*
        9.
String s = "Marra";
for(int i = s.length()-1; i > -1; i--){
char c = s.charAt(i)
if(s.indexOf(c)==s.lastIndexOf(c)){
System.out.print(c);
}
}

What do you see on the console?
A) arra
B) M
C) Mar
D) ara
         */

//        String s = "Marra";
//
//        for(int i = s.length()-1; i > -1; i--){
//
//            char c = s.charAt(i);
//
//            if(s.indexOf(c)==s.lastIndexOf(c)){
//                System.out.print(c);
//            }
//        }

        // Ans ; B

        /*
        10.
String s = "Love";
for(int i = s.length()-1; i >= 0; i--){
System.out.print(s.charAt(i));
}

What do you see on the console?
A) Love
B) evoL
C) LOVE
D) evol
         */

        String s = "Love";
        for(int i = s.length()-1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }

        // Ans: B



    }
}
