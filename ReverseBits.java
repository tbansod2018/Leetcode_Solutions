package Leetcode;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits(1001));

    }
    public static int reverseBits(int n) {
        StringBuilder s1 = new StringBuilder(n+"");
        s1 = s1.reverse();
        int ans = 0;
        for(int i = s1.length()-1 ;  i>=0 ; i++)
        {
            ans+= Integer.parseInt(s1.charAt(i)+"") * Math.pow(10,i);
        }
        return ans;
    }
}
