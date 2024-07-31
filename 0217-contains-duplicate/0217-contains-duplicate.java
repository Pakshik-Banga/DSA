class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        Set<Integer> st = new HashSet<>();
        
        
        for(int e:nums){
            
                if(st.contains(e))return true;
            
              st.add(e);
            
            
        }
        
        return false;
        
        
    }
}