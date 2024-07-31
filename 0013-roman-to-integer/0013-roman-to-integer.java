class Solution {
    public int romanToInt(String s) {
        
    
    int ans = 0;
        
    int n = s.length();
        
    char c = ' ';
        
        
    for(int i=n-1;i>=0;i--){
        
      int t =   check(c,s.charAt(i));
        
      if(t!=0){
          
          ans += t;
          continue;
          
      }
        
        c = s.charAt(i);
        ans += num(c);
        
       
        
    }
        
       
        return ans;
        
        
        
        
    }
    
    public static int num(char c){
        
        if(c=='I')return 1;
        if(c=='V')return 5;
        if(c=='X')return 10;
        if(c=='L')return 50;
        if(c=='C')return 100;
        if(c=='D')return 500;
        if(c=='M')return 1000;
       
return 0;
        
        
    }
    
    public static int check(char c1,char c2){
        
        if(c2=='I' && c2==' ')return 0;     
        if(c1=='V' && c2=='I')return -1;
        if(c1=='X' && c2=='I')return -1;
        if(c1=='L' && c2=='X')return -10;
        if(c1=='C' && c2=='X')return -10;
        if(c1=='D' && c2=='C')return -100;
        if(c1=='M' && c2=='C')return -100;

        return 0;
        
        
    }
    
    
}