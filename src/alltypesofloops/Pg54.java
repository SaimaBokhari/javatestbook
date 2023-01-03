package alltypesofloops;

public class Pg54 {
    public static void main(String[] args) {
        /*
        9. int i=1;
do{
if(i != 3){
System.out.print(i + " ");
} else {
continue;
}
i++;
}while(i<5);


What is the output?
A) 1 2
B) 1 2 4 5
C) 1 2 3 4
D) 1 2 4
         */
//        int i=1;
//        do{
//            if(i != 3){
//                System.out.print(i + " ");
//            } else {
//                continue;
//            }
//            i++;
//        }while(i<9);
//

        //Ans: A

        /*
        10. int i=1;
do{
if(i == 3){
continue;
} else if(i == 5){
System.out.print(i + " ");
break;
} else{
System.out.print(i + " ");
}
i++;
}while(true);
What is the output?
A) 1 2 4 5
B) 1 2 4 5 6 7 ... goes to infinity
C) 1 2 4
D) Gives compile time error
         */


        int i=1;
        do{
            i++;
            if(i == 3){
                continue; // skip
            } else if(i == 5){
                System.out.print(i + " ");
                break;
            } else{
                System.out.print(i + " ");
            }

        }while(true);

        // Ans: 1 2 4






    }
}
