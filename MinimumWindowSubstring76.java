package Leetcode;
//not complited

import java.util.ArrayList;
import java.util.List;

public class MinimumWindowSubstring76 {

    public static void main(String[] args) {
        String s = "abc";
        String t = "ab";
        System.out.println(minWindow(s,t));
//        List<Character> al = new ArrayList<>();
//        al.add('b');
//        al.add('a');
//        al.add('n');
//        al.add('c');
////        al.add('e');
//        System.out.println(al.contains('C'));


    }

    public static String minWindow(String s, String t) {
//        if(s == t)
//        {
//            return s;
//        }
        char[] arr = s.toCharArray();
        boolean isfound = false;
        List<Character> ans = new ArrayList<>();
        for(int i = 0; i < arr.length ; i++)
        {
            ans.add(arr[i]);
        }
        System.out.println(ans);

        int s1 = 0;
        int s2 = 100;

        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = i+t.length() ; j<arr.length ; j++)
            {
//                List<Character> arl = ans.subList(i,j);
//                System.out.println(ans.subList(i,j+1));
//                System.out.println(j-i+" "+(s2-s1));
//                System.out.println(s);
//                System.out.println();
                if(cont(i,j,ans.subList(i,j+1),t) && j-i<s2-s1)
                {
                    s1 = i;
                    s2 = j;
                    isfound = true;
                    System.out.println(i+""+j);
                    System.out.println(ans.subList(i,j));
                }
            }
        }
        if(!isfound)
        {
            return "";
        }
        System.out.println(s1+" "+s2);
        return s.substring(s1,s2+1);
    }

    public static boolean cont(int i, int j, List<Character> ans,String s) {
        for(int k = 0 ; k < s.length() ; k++)
        {
//            System.out.println(ans);
            if(!ans.contains(s.charAt(k)))
            {
                System.out.println(ans);
                System.out.println(s);
                System.out.println();
                return false;
            }
        }
//        System.out.println(ans);
        return true;
    }


}
