class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
      
           int m[] = new int[256];
           int r[] = new int[256];
        
           for(int i=0;i<magazine.length();i++){
               
                m[(int)magazine.charAt(i)]++;
               
           }
        
            for(int i=0;i<ransomNote.length();i++){
               
                r[(int)ransomNote.charAt(i)]++;
               
           }
        
         for(int i=0;i<ransomNote.length();i++){
             
                int t = (int)ransomNote.charAt(i);
             
                if(m[t]!=0){
                       m[t]--;
                       r[t]--;
                }else{
                    return false;
                }
             
             
         }
        
        
        int ch[] = new int[256];
        
        if(Arrays.equals(ch,r))return true;
        
        return false;
        
        
    }
}