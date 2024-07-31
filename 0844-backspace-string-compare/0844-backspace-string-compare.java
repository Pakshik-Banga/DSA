class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        String s1 = conv(s);
        String s2 = conv(t);
        
        if(s1.equals(s2))return true;
        
        
        return false;
        
        
    }
    
    
    public static String conv(String s){
        
          String g = "";
          char c = ' ';
          for(int i=0;i<s.length();i++){
              
                c = s.charAt(i);
              
                if(c=='#' && g.length()>0){
                      g = g.substring(0,g.length()-1);
                }else if(c!='#'){
                    g += c+"";
                }
              
              
          }
        
        return g;
        
        
    }
}