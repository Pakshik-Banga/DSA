class Solution {
    public boolean isAnagram(String s, String t) {
     
        int sl = s.length();
        int tl = t.length();
        
        if(sl!=tl)return false;
        
        
      int sa[] = new int[256];
      int ta[] = new int[256];
        
    for(int i=0;i<sl;i++){
        sa[(int)s.charAt(i)]++;
        ta[(int)t.charAt(i)]++;
    }
        
    if(Arrays.equals(sa,ta))return true;
        
    return false;
        
        
    }
}