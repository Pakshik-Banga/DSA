class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
         int ind = -1;
        int count = 0;
        
        
        
        for(int i=0;i<n;i++){
        
             if(count==0){
                 
                     ind = i;
                     count = 1;
                 
             }else{
                 
                   if(nums[ind]==nums[i]){
                         count++;
                   }else{
                         count--;
                         
                   }
                 
             }
            
        }
        
        if(count==0)ind = n-1;
  
    
        return nums[ind];
          
      
    }
}