package nestedternaryswitch;

public class Pg28 {
    public static void main(String[] args) {

        // Q.10
        int variable = 1;
        switch (variable){
            case 1 :
                System.out.print("P");
            case 2 :
            case 3 :
                System.out.print("Q");
                break;
            case 4 :
                System.out.print("R");
            default :
                System.out.print("S");
        }

        /*
        What is the output?
A) P
B) S
C) PQ
D) PQR

Ans: C
         */







    }
}
