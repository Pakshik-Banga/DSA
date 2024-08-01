class Solution {
    public int[] countBits(int n) {
        
        int ans[] = new int[n+1];
        
        if(n==0){
            ans[0] = 0;
            return ans;
        }
        
         ans[0] = 0;
         ans[1] = 1;
     
        
        
        int ind = 1;
        int count = 2;
        while(count<n+1){
            
            ans[count++] = ans[ind];
            
            if(count<n+1)ans[count++] = ans[ind] + 1;
            
            ind++;
            
        }
        
        return ans;
        
        
    }
}