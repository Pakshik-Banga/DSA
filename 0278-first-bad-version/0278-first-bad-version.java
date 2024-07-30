/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
              
              int i = 1;
              int j = n;
        
            int mid = 0;
        
            int ans = 0;
            while(i<=j){
                
                mid = (j-i)/2 + i;
                
                if(isBadVersion(mid)){
                      ans = mid;
                      j = mid-1;
                }else{
                     
                      i = mid+1;
                }
                
                
            }
        
        
        return ans;
        
        
    }
}