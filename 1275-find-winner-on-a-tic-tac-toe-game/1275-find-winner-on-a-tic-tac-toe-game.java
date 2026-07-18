class Solution {
    public static boolean check(char[][] board, char ch)
    {
        for(int i=0;i<3;i++)
        {
            if(board[i][0]==ch && board[i][1]==ch && board[i][2]==ch)
                return true;
        }
        for(int j=0;j<3;j++)
        {
            if(board[0][j]==ch && board[1][j]==ch && board[2][j]==ch)
                return true;
        }
        if(board[0][0]==ch && board[1][1]==ch && board[2][2]==ch)
            return true;
        if (board[0][2] == ch && board[1][1] == ch && board[2][0] == ch)
            return true;
        return false;

    }
    public String tictactoe(int[][] moves) {
        char[][] board = new char[3][3];
        for(int i=0;i<moves.length;i++)
        {
            int r=moves[i][0],c=moves[i][1];
            if(i%2==0)
                board[r][c]='A';
            else
                board[r][c]='B';
        }
        if(check(board,'A'))
            return "A";
        if(check(board,'B'))
            return "B";
        if(moves.length==9)
            return "Draw";
        return "Pending";
    }
}