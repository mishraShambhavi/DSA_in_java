public class lecture64 {
    static boolean helper(int[][] grid, int row,int col,int num){
        int n= grid.length;
        //base case
        if (grid[row][col]==n*n-1){
            return true;
        }
        int i,j;
        //2 up 1 right
        i=row-2;
        j=col+1;
        if (i>=0 && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //2 down 1 right
        i=row+2;
        j=col+1;
        if (i<n && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //2 up 1 left
        i=row-2;
        j=col-1;
        if (i>=0 && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //2 down 1 left
        i=row+2;
        j=col-1;
        if (i<n && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //2 right 1 up
        i=row-1;
        j=col+2;
        if (i>=0 && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //2 left 1 up
        i=row-1;
        j=col-2;
        if (i>=0 && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //2 right 1 down
        i=row+1;
        j=col+2;
        if (i<n && j<n && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        //2 left 1 down
        i=row+1;
        j=col-2;
        if (i<n && j>=0 && grid[i][j]==num+1) return helper(grid,i,j,num+1);
        return false;
    }
    static boolean checkvalidgrid(int[][] grid){
        if (grid[0][0]!=0) return false;
        return helper(grid,0,0,0);
    }
    static int maxknights=-1;
    static int number =5;
    static void nKnights(char[][] board,int row,int col,int numofknights){
        int n= board.length;
        if (row==n) { //printing configuration
//            if (numofknights==number){
//                for (int i = 0; i < n; i++) {
//                    for (int j = 0; j < n; j++) {
//                        System.out.print(board[i][j]);
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
            maxknights=Math.max(maxknights,numofknights);
            return;
        }
        if (isSafe(board,row,col)){
            board[row][col]='K';
            if (col< board.length-1) nKnights(board,row,col+1,numofknights+1);
            else nKnights(board,row+1,0,numofknights+1);
            board[row][col]='x';  //BT
        }
        if (col< board.length-1) nKnights(board,row,col+1,numofknights);
        else nKnights(board,row+1,0,numofknights);

    }
    static boolean isSafe(char[][] grid,int row,int col){
        int n= grid.length;
        //base case
        if (grid[row][col]==n*n-1){
            return true;
        }
        int i,j;
        //2 up 1 right
        i=row-2;
        j=col+1;
        if (i>=0 && j<n && grid[i][j]=='K') return false;
        //2 down 1 right
        i=row+2;
        j=col+1;
        if (i<n && j<n && grid[i][j]=='K') return false;
        //2 up 1 left
        i=row-2;
        j=col-1;
        if (i>=0 && j>=0 && grid[i][j]=='K') return false;
        //2 down 1 left
        i=row+2;
        j=col-1;
        if (i<n && j>=0 && grid[i][j]=='K') return false;
        //2 right 1 up
        i=row-1;
        j=col+2;
        if (i>=0 && j<n && grid[i][j]=='K') return false;
        //2 left 1 up
        i=row-1;
        j=col-2;
        if (i>=0 && j>=0 && grid[i][j]=='K') return false;
        //2 right 1 down
        i=row+1;
        j=col+2;
        if (i<n && j<n && grid[i][j]=='K') return false;
        //2 left 1 down
        i=row+1;
        j=col-2;
        if (i<n && j>=0 && grid[i][j]=='K') return false;
        return true;
    }

    static boolean isValidSuduko(char[][] board){
        int n= board.length;
        for (int i=0;i<9;i++){
            for (int j=0;j<9;j++){
                if (board[i][j]=='.') continue;
                char num=board[i][i];
                board[i][j]='.';
                if (isValid(board,i,j,num)==false) return false;
                board[i][j]=num;
            }
        }
        return true;
    }
    static boolean isValid(char[][] board,int row,int col,char num){
        //check row
        for(int j=0;j<9;j++){
            if (board[row][j]==num) return false;
        }
        //check col
        for(int i=0;i<9;i++){
            if (board[i][col]==num) return false;
        }
        //check 3x3 matrix
        int startRow=row/3*3;
        int startCol=col/3*3;
        for (int i=startRow;i<startRow+3;i++){
            for (int j=startCol;i<startCol+3;j++){
                if (board[i][j]==num) return false;
            }
        }
        return true;
    }
    static void sodukoSolver(char[][] board,int row,int col,char[][] grid){
        if (row==9){
            for (int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    grid[i][j]=board[i][j];
                }
            } return;
        }
        if (board[row][col]!='.'){
            if (col<8) sodukoSolver(board,row,col+1,grid);
            else sodukoSolver(board,row+1,0,grid);
        }else{      //board[row][col]=='.'  khali place where we have to fill number
            for (char ch='1';ch<='9';ch++){
                if (isValid(board,row,col,ch)){  //means its true
                    board[row][col]=ch;
                    if (col<8) sodukoSolver(board,row,col+1,grid);
                    else sodukoSolver(board,row+1,0,grid);
                    board[row][col]='.';   //BT
                }
            }
        }
    }
    static void solve(char[][] board){
        char[][] grid=new char[9][9];
        sodukoSolver(board,0,0,grid);
        for (int i=0;i<9;i++){
            for(int j=0;j<9;j++){
             board[i][j]=grid[i][j];
            }
        }
    }

    public static void main(String[] args) {
        //QUESTION 1
        int[][] grid={{0,11,16,5,20},{17,4,19,10,15},{12,1,8,21,6},{3,18,23,14,9},{24,13,2,7,22}};
        int[][] grid3={{0,3,6},{5,8,1},{2,7,4}};
        System.out.println(checkvalidgrid(grid));

        //QUESTION 2
        System.out.println("N Knight Configuration");
        int n=3;
        char[][] board=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='x';
            }
        }
        nKnights(board,0,0,0);
        System.out.println(maxknights);

        //QUESTION 3



    }
}
