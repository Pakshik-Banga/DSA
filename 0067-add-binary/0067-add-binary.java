class Solution {
    
    static char carry = '0';
    public String addBinary(String a, String b) {
        
        int na = a.length();
        int nb = b.length();
        
        
       
        int ia = na-1;
        int ib = nb-1;
        
        char f1 = '0';
        char f2 = '0';
        char carry = '0';
        String ans ="";
        
        while(ia>=0 || ib>=0){
            
            f1 = (ia<0)?'0':a.charAt(ia);
            f2 = (ib<0)?'0':b.charAt(ib);
            
            if(carry=='0'){
                if(f1=='0' && f2=='0'){
                      ans = '0' + ans;
                    
                }else if(f1=='0'|| f2=='0'){
                      ans = '1' + ans;
                }else{
                    ans = '0' + ans;
                    carry = '1';
                }
            }else{
                
                  if(f1=='0' && f2=='0'){
                      ans = '1' + ans;
                      carry = '0';
                    
                }else if(f1=='0'|| f2=='0'){
                      ans = '0' + ans;
                      carry = '1';
                }else{
                    ans = '1' + ans;
                    carry = '1';
                }
                
            }
            
            ia--;
            ib--;
            
            
        }
        
        
        if(carry=='1'){
            ans = '1' + ans;
        }
        
        return ans;
        
        
    }
    
    
}