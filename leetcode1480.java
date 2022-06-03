class Solution {
    
    public void search(int[] nums, int idx) {
        if(idx < nums.length) {
            nums[idx]+=nums[idx-1];
            search(nums, idx+1);
        }
    }
    
    public int[] runningSum(int[] nums) {                
        search(nums, 1);
        
        return nums;
    }
}
