package alltypesofloops;

public class Pg50 {
    public static void main(String[] args) {
        /*
        5.
int y = 0;
for(int i = 1; i < 4; i++){
y = y + i;
}
System.out.println(y);

Which ones of the followings print the same with the given code on the console?
A) int y = 0;
System.out.println(y+6);
B) int y = 0;
int i = 1;
while(i<4){
y = y + i;
i++;
}
System.out.println(y);
C) int y = 0;
int i = 2;
while(i<5){
y = y + i;
i++;
}
System.out.println(y);
D) int y = 1;
int z = y+=5;
System.out.println(z);
         */


//        int y = 0;
//        for(int i = 1; i < 4; i++){
//            y = y + i;
//        }
//        System.out.println(y);

        int y = 1;
        int z = y+=5;
        System.out.println(z);


        //Ans: A, B, D



    }
}
