package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MinScoreOfPath {
    public static void main(String[] args) {
        int n = 4;
        int[][] roads = {{1,2,2},{1,3,4},{3,4,7}};
        System.out.println(minScore(n,roads));
    }

    public static int minScore(int n, int[][] roads) {
        ArrayList<ArrayList<Integer>> arl = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        arl.addAll(helper(n,roads));
        for(int i = 0 ; i < arl.get(1).size() ; i++){
            ans.addAll(helper2(arl.get(1).get(i),roads));
        }
        ans.addAll(arl.get(0));
        return Collections.min(ans);

    }
    public static ArrayList<ArrayList<Integer>> helper(int n , int[][]roads){
        ArrayList<Integer> arl = new ArrayList<>();
        ArrayList<Integer> near = new ArrayList<>();
        for(int i = 0 ; i < roads.length ;i++){
            for(int j = 0 ; j < 3 ; j++){
                if(roads[i][j] == n){
                    arl.add(roads[i][2]);
                    if(j == 0){
                        near.add(roads[i][1]);
                    }else{
                        near.add(roads[i][0]);
                    }
                }

            }
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ans.add(arl);
        ans.add(near);
        return ans;

    }
    public static ArrayList<Integer> helper2(int n , int[][]roads){
        ArrayList<Integer> arl = new ArrayList<>();
        for(int i = 0 ; i < roads.length ;i++){
            for(int j = 0 ; j < 3 ; j++){
                if(roads[i][j] == n){
                    arl.add(roads[i][2]);

                }

            }
        }
        return arl;

    }
}
