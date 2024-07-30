class Solution {
    public int climbStairs(int n) {
        
        if(n==1)return 1;
        if(n==2)return 2;
        
       int a = 1;
       int b = 2;
       int c = 0;
        
        for(int i=0;i<n-2;i++){
              int temp = b;
              c = a + b;
              b = c;
              a = temp;
                   
            
        }
        
        return c;
        
        
    }
    
   
    
}