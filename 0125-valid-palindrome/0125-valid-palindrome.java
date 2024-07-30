class Solution {
    public boolean isPalindrome(String s) {
        
           String g = s.toLowerCase();
        
           StringBuilder sb = new StringBuilder();
        
           for(int i=0;i<s.length();i++){
               
                 char c = g.charAt(i);
               
                 if(('a'<=c && c<='z') || ('0'<=c && c<='9')){
                     sb.append(c+"");
                 }
                  
               
           }
        
        g = sb.toString();
        
        
      
        
        int i =0;
        int j = g.length()-1;
        
        while(i<=j){
            
            if(g.charAt(i)!=g.charAt(j)){
                return false;
            }
            
            i++;
            j--;
        }
        
        
        return true;
        
    }
}