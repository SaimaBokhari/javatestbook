package stringbuilder;

public class Pg82 {
        /*
5. Which ones are true?


A) public static void main(String[] args) {
StringBuilder str = new StringBuilder("LearnJava");
int index = str.indexOf("earn");
System.out.println(index);
}
The output is 1

B) public static void main(String[] args) {
StringBuilder str = new StringBuilder("LearnJava");
int index = str.indexOf("a", 4);
System.out.println(index);
}
The output is 6

C) public static void main(String[] args) {
StringBuilder str = new StringBuilder("LearnJava");
int index = str.indexOf("e", 4);
System.out.println(index);
}
Gives Compile Time Error

         */
        public static void main(String[] args) {
            StringBuilder str = new StringBuilder("LearnJava");
//            int index = str.indexOf("earn");
//            System.out.println(index);


//            int index = str.indexOf("a", 4);
//            System.out.println(index);

            int index = str.indexOf("e", 4);
            System.out.println(index);


            //Ans: A, B









    }
}
