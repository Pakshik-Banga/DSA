class Solution {
    public int maxProfit(int[] prices) {
        
           int min = prices[0];
           int pro = 0;
        
            int fpro = 0;
        
          for(int i=1;i<prices.length;i++){
              
              
                  if(prices[i]>=min){
                        pro  = Math.max(prices[i] - min,pro);
                         
                  }else{
                      fpro = Math.max(pro,fpro);
                      min = prices[i];
                      pro  = 0;
                  }
              
                      
          }
        
        
        return Math.max(fpro,pro);
        
        
        
        
    }
}