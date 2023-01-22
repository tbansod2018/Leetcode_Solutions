package Leetcode;

import java.util.ArrayList;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-2147483648));
//        StringBuilder s = new StringBuilder("9646324351");
//        System.out.println(s.reverse());

    }
    public static int reverse(int x){
        Long lo = 0l;

        String s = x+"";
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length-1;
        while(i<j)
        {
            if(ch[i] == '-' || ch[i] == '+'){
                i++;
            }
            if(ch[j] == '-' || ch[j] == '+'){
                j--;
            }
            if(ch[i] != '-' && ch[i] != '+' && ch[j] != '-' && ch[j] != '+'){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
            }
        }
        StringBuilder str = new StringBuilder();
        for(int k = 0 ; k < ch.length ; k++)
        {
            str.append(ch[k]);
        }
        Long l = Long.parseLong(str.toString());
        if(l> 2147483647 || l<-2147483648)
        {
            return 0;
        }
        else {
            return Integer.parseInt(str.toString());
        }
    }
}
