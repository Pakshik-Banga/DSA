class Solution {
    public boolean isValid(String s) {
        
            
        
          Stack<Character> st = new Stack<>();
        
          char c = ' ';
        
           for(int i=0;i<s.length();i++){
               
                 c = s.charAt(i);
               
                  if(isOpen(c)){
                      st.add(c);
                  }else{
                      
                        if(st.isEmpty())return false;
                      
                        if(match(st.peek(),c)){
                              st.pop();
                        }else{
                            return false;
                        }
                      
                      
                  }
                
           }
        
        
        if(st.isEmpty())return true;
        
        return false;
        
    }
    
    
    public static boolean isOpen(char c){
        
          if(c == '(' || c == '[' || c=='{'){
              return true;
          }
        
        return false;
        
    }
    
    
    public static boolean match(char c1,char c2){
        
        
        if(c1=='(' && c2==')')return true;
        if(c1=='[' && c2==']')return true;
        if(c1=='{' && c2=='}')return true;
        
        return false;

        
    }
    
}