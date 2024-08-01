public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        
        int x = 0;
        
        for(int i=0;i<32;i++){
            
                if((n&1)==0){
                      x = (x<<1);
                }else{
                    x = (x<<1) | 1;
                }
            
              n = n>>1;
            
        }
        
        
        return x;
        
    }
}