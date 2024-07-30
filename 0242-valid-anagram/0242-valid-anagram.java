class Solution {
    public boolean isAnagram(String s, String t) {
     
        int sl = s.length();
        int tl = t.length();
        
        if(sl!=tl)return false;
        
        
        Map<Character,Integer> m = new HashMap();
        char c = ' ';
        for(int i=0;i<sl;i++){
            c = s.charAt(i);
            if(m.containsKey(c)){
                m.put(c,m.get(c)+1);
            }else{
                m.put(c,1);
            }
        }
        
        for(int i=0;i<tl;i++){
            c = t.charAt(i);
            if(m.containsKey(c) && m.get(c)!=0){
                
                  m.put(c,m.get(c)-1);
                
            }else{
                return false;
            }
        }
        
        
        return true;
        
    }
}