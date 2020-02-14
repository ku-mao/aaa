package edu;

public class Remove {

    //交换移除
    public int removeElement1(int[] nums, int val) {
        int n = nums.length;
        for(int i = 0 ; i < n ;){
            if(nums[i] == val){
                nums[i] = nums[n-1];
                n--;
            }
            else{
                i++;
            }
        }
        System.out.println(n);
        return n;
    }

    //覆盖移除
    public int removeElement2(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(i);
        return i;
    }

}
