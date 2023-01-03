package stringbuilder;

public class pG83 {
    public static void main(String[] args) {
        /*
        6. public static void main(String[] args) {
StringBuilder str = new StringBuilder("LearnJava");
str.reverse();
System.out.println(str);
}

Which output is the same with the given code?

A) public static void main(String[] args) {
String str2 = "LearnJava";
String str3 = "";
for(int i = str2.length()-1; i>=0; i--) {
str3 = str3 + str2.charAt(i);
}
System.out.println(str3);
}
B) public static void main(String[] args) {
String str2 = "LearnJava";
String str3 = "";
for(int i = 0; i<=str2.length()-1; i++) {
str3 = str3 + str2.charAt(i);
}
System.out.println(str3);
}
C) public static void main(String[] args) {
String str2 = "LearnJava";
String str3 = "";
for(int i = str2.length()-1; i>=0; i++) {
str3 = str3 + str2.charAt(i);
}
System.out.println(str3);
}


         */


        StringBuilder str = new StringBuilder("LearnJava");
        str.reverse();
        System.out.println(str);

        //A
        String str2 = "LearnJava";
        String str3 = "";
//        for(int i = str2.length()-1; i>=0; i--) {
//            str3 = str3 + str2.charAt(i);
//        }
//        System.out.println(str3);

        System.out.println();


        // B
        for(int i = 0; i<=str2.length()-1; i++) {
            str3 = str3 + str2.charAt(i);
        }
        System.out.println(str3);

        // C
        for(int i = str2.length()-1; i>=0; i++) {
            str3 = str3 + str2.charAt(i);
        }
        System.out.println(str3);



        // Ans: A




    }
}
