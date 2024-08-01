class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        
        int ans[] = new int[n];
        
        int i = 0;
        int j = n-1;
        int ind = n-1;
        
        while(i<=j){
            int n1 = Math.abs(nums[i]);
            int n2 = Math.abs(nums[j]);
            
            if(n1<=n2){
                ans[ind--] = n2*n2;
                j--;
            }else if(n1>n2){
                ans[ind--] = n1*n1;
                i++;
            }
             
        }
        
        return ans;
        
    }
}