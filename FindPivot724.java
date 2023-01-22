package Leetcode;

public class FindPivot724 {
    public static void main(String[] args) {
        int[] nums = {2,1,-1};
        System.out.println(pivotIndex(nums));

    }
    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int rsum = 0;
        int lsum = 0;
        for(int i= 0 ; i < nums.length ; i++){
            sum+=nums[i];
        }
        for(int i = 0 ; i < nums.length;i++){
            lsum = sum-rsum-nums[i];
            if(lsum==rsum){
                return i;
            }
            rsum+=nums[i];
        }
        return -1;
    }

}
