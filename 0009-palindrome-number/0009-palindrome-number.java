class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0)return false;
        if(x==0)return true;
        
        
        int num = 0;
        int y = x;
        
        while(y!=0){
            
            int r = y%10;
            
            num = num*10 + r;
            y = y/10;
            
            
        }
        
        if(x==num)return true;
        
        
        return false;
        
        
        
    }
}