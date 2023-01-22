package Leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
//{p=2, a=1, r=4, t=2, e=4, i=1, l=3}


public class IsomorphicString205 {
    public static void main(String[] args) {
        String s1 = "paper";
        String s2 = "title";
        System.out.println(isIsomorphic(s1,s2));
    }
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> m = new HashMap<>();
        Set<Character> s1 = new HashSet<>();
        Set<Character> s2 = new HashSet<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(!m.containsKey(s.charAt(i))){
                m.put(s.charAt(i),t.charAt(i));
            } else if (m.get(s.charAt(i)) != t.charAt(i)) {
                return false;
            }
            s1.add(s.charAt(i));
            s2.add(t.charAt(i));
        }
        return m.size() == s1.size() && m.size() == s2.size();
    }
}
