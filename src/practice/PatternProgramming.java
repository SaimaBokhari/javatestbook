package practice;

public class PatternProgramming {
    /*
    Nested loop
    for(int i=1; i<=5; i++){
       for(int j=1; i<=i; j++){
          System.out.print(j+ " ");
       }
       System.out.println(" ");
    }

     */
    public static void main(String[] args) {
        for (int i=1; i<=7; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println(" ");
        }


        for (int i=1; i<=7; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }

        for (int i=1; i<=7; i++){
            for (int j=1; j<=i; j++){
                System.out.print("=>" + " ");
            }
            System.out.println(" ");
        }


    }
}
