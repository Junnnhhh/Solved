import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int start = 0;
        
        for(int i=0; i<nums.length; i++) {
            if(start == nums[i]) {
                start++;
            } else {
                break;
            }
        }
        
        return start;
    }
}
