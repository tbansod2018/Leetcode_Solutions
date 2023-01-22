package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateZeros1089 {
    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void duplicateZeros(int[] arr) {
        ArrayList<Integer> arl = new ArrayList<>();
        for (int j : arr) {
            if (j == 0) {
                arl.add(0);
            }
            arl.add(j);
        }
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = arl.get(i);
        }
    }
}
