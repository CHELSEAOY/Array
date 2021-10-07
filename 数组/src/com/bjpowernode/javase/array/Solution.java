package com.bjpowernode.javase.array;

class Solution {
    public void sortColors(int[] nums) {
        int begin = 0;
        int end = nums.length - 1;
        int current = 0;
        while(current<=end){
            if(nums[current]==0)
            {
                swap(begin,current,nums);
                current++;
                begin++;
            }
            else if(nums[current]==2)
            {
                swap(current,end,nums);
                end--;
            }
            else
            {
                current++;
            }
        }
    }
    private void swap(int i,int j,int[] nums)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}