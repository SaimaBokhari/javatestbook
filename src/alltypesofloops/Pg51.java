package alltypesofloops;

public class Pg51 {
    public static void main(String[] args) {

        /*
        6.
int a = 80;
int b = 20;
while(a>=b){
a -= 10;
b += 10;
System.out.println(a + "," + b);
}
What is the output?
A) 70,30
60,40
50,50
40,60
B) 70,30
60,40
50,50
C) 60,40
50,50
40,60
D) Compile Time Error
         */


        int a = 80;
        int b = 20;
        while(a>=b){
            a -= 10;   // 70,60,50,40
            b += 10;   // 30,40,50,60
            System.out.println(a + "," + b);
        }

        //Ans: A



    }
}
