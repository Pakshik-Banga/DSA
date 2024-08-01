class Solution {
    public int singleNumber(int[] nums) {
        
        int num = 0;
        
        for(int e:nums){
            num ^= e;
        }
        
        return num;
        
        
    }
}