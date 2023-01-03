package qamentor_questions;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Qa_day1 {
    public static void main(String[] args) {


        // Type the code that shows how many different elements there are in a
        // list. Example: {10, 31, 15, 7, 15, 7, 7} ==> 4

        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(31);
        a.add(15);
        a.add(7);
        a.add(15);
        a.add(7);
        a.add(7);
        System.out.println(a);

        List<Integer> b = new ArrayList<>();

        int idx = 0;
        for(int w:a){
            if(!b.contains(w)){
                b.add(w);
            }
        }
        int numOfUniqueElements = b.size();
        System.out.println(numOfUniqueElements);

        //Type code to print different characters used in a String Example:
        // 'Mississippi' ==> Misp

        // 1st way:

//       String s = ("Mississippi");
//        String p = "";
//
//        int i=0;
//
//        while(i<s.length()){
//            String r = s.substring(i, i+1);
//            if(!p.contains(r)){
//                p = p+r;
//            }
//            i++;
//        }
//        System.out.println(p);

        //2.Way:

StringBuilder s = new StringBuilder("Mississippi");
StringBuilder p = new StringBuilder();
for (int i=0;i<s.length();i++){
    String r = s.substring(i,i+1);
    if (!p.toString().contains(r))
    p.append(r);
}
System.out.println(p);

        // Date of birth of Ali is 4th of June 1997. Type code to find the exact
        // date 2 years, 3 months, and 12 days after Ali's birthdate.

        LocalDate dobAli = LocalDate.of(1997, Month.JUNE, 04).plusYears(2).plusMonths(3).plusDays(12);
        System.out.println(dobAli);



    }
}
