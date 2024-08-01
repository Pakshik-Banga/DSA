class Solution {
    public int missingNumber(int[] nums) {
        
        int n = nums.length;
        
        int num = 0;
        for(int i=1;i<=n;i++){
            num ^= i;
        }
        
        for(int e:nums){
            num ^= e;
        }
        
        return num;
        
        
    }
}