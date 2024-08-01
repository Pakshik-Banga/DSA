class Solution {
    public void moveZeroes(int[] nums) {
     
        int ind = -1;
        
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0){
                
                if(ind==-1)ind = i;
                
                 continue;
            }
            
            
            if(ind!=-1){
                nums[ind] = nums[i];
                nums[i] = 0;
                ind++;
            }
            
            
            
        }
        
        
        
        
    }
    
    
}