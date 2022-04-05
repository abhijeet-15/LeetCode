public class Q645 {
    class Solution {
        public int[] findErrorNums(int[] nums) {
            int i =0;
            while(i < nums.length){
                int correct = nums[i] -1;
                if(nums[i] != nums[correct]){
                    int temp = nums[i];
                    nums[i]= nums[correct];
                    nums[correct] = temp;
                }
                else
                    i++;
            }
          //  System.out.println(Arrays.toString(nums));

            for (int index = 0; index < nums.length; index++) {
                if (nums[index] != index + 1) {
                    return new int[] {nums[index], index+1};
                }
            }
            return new int[] {-1, -1};

        }
    }
}
