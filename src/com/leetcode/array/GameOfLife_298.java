package leetcode.array;

public class GameOfLife_298 {
	public static void gameOfLife(int[][] board) 
    {
        for(int i=0; i <board.length ; i++)
        {
            for(int j=0; j<board[0].length ; j++)
            {
                int neighbours=0;
                //check left direction
                if(isSafe(board,i,j-1))neighbours++;
                
                //check right direction
                if(isSafe(board,i,j+1))neighbours++;
                
                //check top direction
                if(isSafe(board,i-1,j))neighbours++;
                
                //check down direction
                if(isSafe(board,i+1,j))neighbours++;
                
                //check left top corner direction
                if(isSafe(board,i-1,j-1))neighbours++;
                //check right top corner direction
                if(isSafe(board,i-1,j+1))neighbours++;
                //check left nottom corner
                if(isSafe(board,i+1,j-1))neighbours++;
                //check right direction
                if(isSafe(board,i+1,j+1))neighbours++;
                
                
                //if its a live cell
                if(board[i][j]==1)
                {
                    if(neighbours<2)
                    {
                        board[i][j]=-1;
                    }
                    else if((neighbours==2 ||neighbours==3 ))
                    {
                        board[i][j]=1;
                    }
                    else
                    {
                        board[i][j]=-1;
                    }
                    
                }
                else
                {
                    if(neighbours==3)
                    {
                        board[i][j]=2;
                    }
                }
                
            }
        }
        for(int i=0; i <board.length ; i++)
        {
            for(int j=0; j<board[0].length ; j++)
            {
                if(board[i][j]==-1){
                    board[i][j]=0;
                }
                else if(board[i][j]==2){
                    board[i][j]=1;
                }
            }
        }
        
        
    }
     public static boolean isSafe(int[][] board,int row ,int col)
     {
         //-1 means that the cell died in this instant and previously it was so alive so we 
    	 //basically want the previous instance, if it was alive it was safe
         return row>=0 && row<board.length && col>=0 && col<board[0].length && (board[row][col]==1 ||board[row][col]==-1);
     }

	

}
