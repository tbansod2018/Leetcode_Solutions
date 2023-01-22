package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestPrimeNoInRange2523 {
    public static void main(String[] args) {
//        System.out.println(isprime(124577));
        System.out.println(Arrays.toString(closestPrimes(4,6)));
    }

    static boolean isprime(int n)
    {
        if(n<2)
        {
            return false;
        }
        for(int i = 2 ; i*i<=n ; i++)
        {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static int[] closestPrimes(int left, int right) {
        ArrayList<Integer> arl = new ArrayList<>();
        for(int i = left ; i <= right ; i++)
        {
            if(isprime(i)){
                arl.add(i);
            }
        }
        if(arl.size() < 2)
        {
            return new int[]{-1,-1};
        }
        int j = 0;
        int min = arl.get(1) - arl.get(0);
        for(int i = 0 ; i < arl.size()-1; i ++)
        {
            if(arl.get(i+1) - arl.get(i) < min)
            {
                min = arl.get(i+1) - arl.get(i);
                j = i;
            }
        }
        return new int[] {arl.get(j) , arl.get(j+1)};

    }
}
