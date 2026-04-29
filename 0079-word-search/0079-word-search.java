class Solution {
     boolean fun(char[][]board,String word,int r,int c){
        if(word.length()==0){
            return true;
        }
        if(r<0||r>=board.length ||c<0||c>=board[0].length)return false;
        
        if(board[r][c]!=word.charAt(0))return false;
        char ch=board[r][c];
        board[r][c]=' ';
        boolean flag=false;
        //for any true condition we will use or operator:
       flag|= fun(board,word.substring(1),r-1,c);
       flag|= fun(board,word.substring(1),r+1,c);
       flag|= fun(board,word.substring(1),r,c-1);
       flag|= fun(board,word.substring(1),r,c+1);
       //now for undo CHANGES=BACKTRACK
       board[r][c]=ch;
       return flag;
}
    public boolean exist(char[][] board, String word) {
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                //rem about the edge cases that hmesha ek char toh hoga            //hi hoga
                if(board[i][j]==word.charAt(0)){
                   if( fun(board,word,i,j)) return true;

                }
            }
        }
        return false;

        
    }
}