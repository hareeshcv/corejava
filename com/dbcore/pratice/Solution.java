package com.dbcore.pratice;

class Solution {
    public int removeDuplicates(int[] nums) {
        int i =0;
        for(int j=1;j<nums.length; j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];

            }
        }
        return i+1;
    }
    public static void main(String args[]){
    Solution s = new Solution();


        int[] nums = {1,1,2,3,3,4,5};
        int k = s.removeDuplicates(nums);
        for(int i=0;i<k;i++){  System.out.println(nums[i]);
        }
    }
}
