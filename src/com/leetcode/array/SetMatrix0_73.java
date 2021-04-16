package leetcode.array;

public class SetMatrix0_73 {
	 public void setZeroes(int[][] matrix) {
	        
	       
	        boolean makeFirstRow0=false;
	        boolean makeFirstCol0=false;
	        if(matrix[0][0]==0)
	        {
	            makeFirstRow0=true;
	            makeFirstCol0=true;
	        }
	        
	        //marking whatever needed to be 0
	        for(int i =0 ;i < matrix.length;i++)
	        {
	            for(int j=0; j < matrix[0].length ; j++)
	            {
	                if(i==0 && matrix[i][j]==0)
	                {
	                    makeFirstRow0=true;
	                }
	                if(j==0 && matrix[i][j]==0)
	                {
	                    makeFirstCol0=true;
	                }
	                if(matrix[i][j]==0)
	                {
	                    makeRowAndColumn0(matrix,i,j);
	                  
	                }
	            }
	        }
	        
	        //this is for inner grid
	        for(int i =1 ;i < matrix.length;i++)
	        {
	            for(int j=1; j < matrix[0].length ; j++)
	            {
	                if(matrix[i][0]==0 || matrix[0][j]==0)
	                    matrix[i][j]=0;
	            
	            }
	            
	            
	        }
	        //we also need to check if the first matrix[0][0] row/column is having any 0
	        //we need to make the entire row/column 0 then
	        if(makeFirstCol0)
	        {
	            for(int i =0 ;i < matrix.length;i++)
	            {
	                matrix[i][0]=0;
	            }
	        }
	        if( makeFirstRow0)
	        {
	            for(int i =0 ;i < matrix[0].length;i++)
	            {
	                matrix[0][i]=0;
	            }
	        }
	        
	    }
	    
	    public void makeRowAndColumn0(int[][] matrix,int row,int column) 
	    {
	       matrix[0][column]=0;
	       matrix[row][0]=0;
	    }
	    
	    

}
