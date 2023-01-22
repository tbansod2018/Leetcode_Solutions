package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideTeam {
    public static void main(String[] args) {
        int[] skill = {1,1,2,3};
        System.out.println(dividePlayers(skill));
    }
    public static long dividePlayers(int[] skill) {
        if(skill.length == 2){
            return (long) skill[0] *skill[1];
        }
        Arrays.sort(skill);
        ArrayList<ArrayList<Integer>> arl = new ArrayList<>();
        int i = 0 ;
        int j = skill.length-1;
        while (i<j){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(skill[i]);
            list.add(skill[j]);
            arl.add(list);
            i++;
            j--;
        }
        for(int k = 0 ; k < arl.size()-1 ; k++){
            if(arl.get(k).get(0)+arl.get(k).get(1) != arl.get(k+1).get(0)+arl.get(k+1).get(1) ){
                return -1;
            }
        }
        long ans = 0;
        for(int f = 0 ; f < arl.size();f++){
            ans+=  arl.get(f).get(0) * arl.get(f).get(1);
        }
        return ans;
    }


}
