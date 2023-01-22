package Leetcode;

import java.util.ArrayList;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("498828660196","840477629533"));
        System.out.println((498828660196l)*(800000000000l));
    }
    public static String multiply(String num1, String num2) {
        Long a = Long.parseLong(num1);
        Long b = Long.parseLong(num2);
        ArrayList<Long> arl = new ArrayList<>();
        for(int i = 0 ; i < num2.length() ; i++){
            arl.add((long) (a*(b%10)*Math.pow(10,i)));
            b/=10;
        }
        Long sum = 0l;
        for(int i = 0 ; i < arl.size() ; i++){
            sum+=arl.get(i);

        }
        System.out.println(arl);
        return sum+"";
    }
}
