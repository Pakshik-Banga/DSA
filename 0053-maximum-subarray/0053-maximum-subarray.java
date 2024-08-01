class Solution {
    public int maxSubArray(int[] nums) {
        
        int a = nums[0];
        int b = nums[0];
        int ans = nums[0];
        
        
        for(int i=1;i<nums.length;i++){
            
              a = Math.max(a,b) + nums[i];
              b = nums[i];
            
              ans = Math.max(ans,Math.max(a,b));
            
        }
        
        return ans;
        
        
    }
}