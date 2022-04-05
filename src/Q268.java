/*Given an array nums containing n distinct numbers in the range [0, n],
return the only number in the range that is missing from the array.
 */


public class Q268 {
    class Solution {
        public int missingNumber(int[] nums) {
            int i = 0;
            while( i < nums.length) {
                int correct = nums[i];

                if(nums[i] == nums.length)
                    i++;

                else if(nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i] = nums[correct];
                    nums[correct] = temp;
                }

                else
                    i++;
            }

            for(int j= 0; j < nums.length; j++){
                if(nums[j] != j)
                    return j;
            }
            return  nums.length;
        }
    }
}
