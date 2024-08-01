class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        
        
          String g = strs[0];
        
          for(int i=1;i<strs.length;i++){
              
               g = str(g,strs[i]);
              
               if(g=="")return "";
              
              
          }
        
        return g;
        
        
    }
    
    public static String str(String s1,String s2){
        
        int n1 = 0;
        int n2 = 0;
        
        while(n1<s1.length() && n2<s2.length()){
            
               if(s1.charAt(n1)!=s2.charAt(n2)){
                     return s1.substring(0,n1);
               }
            
            n1++;
            n2++;
            
            
        }
        
        
        if(s1.length()<=s2.length()){
            
            return s1;
            
        }
        
        return s2;
        
        
    }
}