/*Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.*/

public class Q287 {
    class Solution {
        public int findDuplicate(int[] nums) {
            int i = 0;
            while( i < nums.length){
                int correct = nums[i] - 1;

                if(nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }
                else
                    i++;
            }

            for(int j = 0 ; j < nums.length; j++ ){
                if(nums[j] != j+1)
                    return nums[j];
            }

            return -1;
        }
    }
}
