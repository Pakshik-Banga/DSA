class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        
            
        flood(image,sr,sc,color,image[sr][sc]);
        return image;
        
    }
    
    public void flood(int[][] image,int sr,int sc,int color,int col){
        
           if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=col){
               
               return ;
           }
        
                  image[sr][sc] = -1;
        
                  flood(image,sr+1,sc,color,col);
        
                  flood(image,sr-1,sc,color,col);

                  flood(image,sr,sc+1,color,col);

                  flood(image,sr,sc-1,color,col);

                  image[sr][sc] = color;
        
                
        
    }
    
    
}