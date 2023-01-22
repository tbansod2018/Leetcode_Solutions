package Leetcode;

import java.util.Arrays;

public class LargestMultipleOfThree_1363 {
    public static void main(String[] args) {
        int [] digits = {8,6,7,1,0};
        System.out.println(largestMultipleOfThree(digits));

    }
    public static String largestMultipleOfThree(int[] digits) {
        int sum = 0;
        for(int i = 0 ; i < digits.length ; i++)
        {
            sum+=digits[i];
        }
        if(sum%3 != 0)
        {
            return "";
        }
        Arrays.sort(digits);
        StringBuilder s = new StringBuilder();
        for(int i = digits.length-1 ; i>=0 ; i--)
        {
            s.append(digits[i]);
        }
        return s.toString();
    }


}
