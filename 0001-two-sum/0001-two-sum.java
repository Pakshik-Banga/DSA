class Solution {
    public int[] twoSum(int[] nums, int target) {
        
          Map<Integer,Integer> m = new HashMap<>();
        
          int t = 0;
          int ans[] = new int[2];
          for(int i=0;i<nums.length;i++){
              
              t = target - nums[i];
              
              if(m.containsKey(t)){
                  
                      ans[0] = m.get(t);
                      ans[1] = i;
                  return ans;
                  
              }else{
                  
                  m.put(nums[i],i);
              }
                 
              
          }
        
        return ans;
        
    }
}