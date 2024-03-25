import java.util.ArrayList;
import java.util.List;

public class lecture63 {

    static int maze(int startrow,int startcol,int endrow,int endcol){
        if (startrow>endrow || startcol>endcol) return 0;
        if (startrow==endrow && startcol==endcol) return 1;
        int downways=maze(startrow+1,startcol,endrow,endcol);
        int rightways=maze(startrow,startcol+1,endrow,endcol);
        int tottalways=downways+rightways;
        return tottalways;
    }
    static void print(int startrow,int startcol,int endrow,int endcol,String s){
        if (startrow>endrow || startcol>endcol) return;
        if (startrow==endrow && startcol==endcol){
            System.out.println(s);
            return ;
        }
        print(startrow+1,startcol,endrow,endcol,s+"D");
        print(startrow,startcol+1,endrow,endcol,s+"R");
    }
    static void print2(int startrow,int startcol,int endrow,int endcol,String s,boolean[][] isVisited){
        if (startrow<0 || startcol<0) return; //leftmost and uppermost bounds
        if (startrow>endrow || startcol>endcol) return; //rightmost and downmost bounds

        if (isVisited[startrow][startcol] == true)return;  //very important

        if (startrow==endrow && startcol==endcol){ //reached destination
            System.out.println(s);
            return ;
        }
        isVisited[startrow][startcol]=true;
        //lexicography journey
        print2(startrow+1,startcol,endrow,endcol,s+"D",isVisited);
        print2(startrow ,startcol-1,endrow,endcol,s+"L",isVisited);
        print2(startrow,startcol+1,endrow,endcol,s+"R",isVisited);
        print2(startrow-1,startcol,endrow,endcol,s+"U",isVisited);


        //BACKTRACKING
        isVisited[startrow][startcol]=false;
    }
    static void print3(int startrow,int startcol,int endrow,int endcol,String s,int[][] maze){
        if (startrow>endrow || startcol>endcol) return;
        if (startrow==endrow && startcol==endcol){
            System.out.println(s);
            return ;
        }
        if (maze[startrow][startcol]==0) return;
        print3(startrow+1,startcol,endrow,endcol,s+"D",maze);
        print3(startrow,startcol+1,endrow,endcol,s+"R",maze);
    }
    static void print4(int startrow,int startcol,int endrow,int endcol,String s,int[][] maze){
        if (startrow<0 || startcol<0) return; //leftmost and uppermost bounds
        if (startrow>endrow || startcol>endcol) return; //rightmost and downmost bounds

        if (maze[startrow][startcol] == -1)return;  //very important

        if (startrow==endrow && startcol==endcol){ //reached destination
            System.out.println(s);
            return ;
        }
        if (maze[startrow][startcol]==0)return;
        maze[startrow][startcol]=-1;
        //lexicography journey
        print4(startrow+1,startcol,endrow,endcol,s+"D",maze);
        print4(startrow ,startcol-1,endrow,endcol,s+"L",maze);
        print4(startrow,startcol+1,endrow,endcol,s+"R",maze);
        print4(startrow-1,startcol,endrow,endcol,s+"U",maze);


        //BACKTRACKING
        maze[startrow][startcol]=1;
    }
    static void permutations(String s,String t,List<String> l){
        if (s.equals("")){
            l.add(t);          //sout(t)
            return;
        }
        for (int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String left=s.substring(0,i);  //i-1 tak jata
            String right=s.substring(i+1);
            String rem=left+right;
            permutations(rem,t+ch,l);   //t initially was empty
        }
    }
    static List<List<Integer>> PermutationViaBackTrack(int[] nums){
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] isvalid=new boolean[nums.length]; //initially false
        helper(nums,ds,isvalid,ans);
        return ans;
    }
    static void helper(int[] nums,List<Integer> ds,boolean[] isvalid,List<List<Integer>> ans){
        if (ds.size()==nums.length){
            List<Integer> list=new ArrayList<>();
            for (int i=0;i<ds.size();i++){
                list.add(ds.get(i));
            }
            ans.add(list);
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (isvalid[i]==false){
                ds.add(nums[i]);
                isvalid[i]=true;
                helper(nums,ds,isvalid,ans);
                isvalid[i]=false;
                ds.remove(ds.size()-1);
            }
        }
    }
    static List<List<Integer>> PermutationMethod2(int[] nums){
        List<List<Integer>> ans= new ArrayList<>();
        helperMethod2(nums,0,ans);
        return ans;
    }
    static void helperMethod2(int[] nums,int idx,List<List<Integer>> ans){
        if(idx== nums.length-1){
            List<Integer> l=new ArrayList<>();
            for (int i=0;i< nums.length;i++){
                l.add(nums[i]);
            }
            ans.add(l);
            return;
        }
        for (int i=idx;i<nums.length;i++){
            swap(i,idx,nums);
            helperMethod2(nums,idx+1,ans);
            swap(i,idx,nums);
        }
    }
    static void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    static void nqueen(char[][] board,int row){
        int n= board.length;
        if (row==n){ //printing configuration
            for (int i=0;i<n;i++){
                for (int j=0;j<n;j++){
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int j=0;j<n;j++){
            if (isSafe(board,row,j)){
                board[row][j]='Q';
                nqueen(board,row+1);
                board[row][j]='X';  //BT
            }
        }
    }
    static boolean isSafe(char[][] board,int row,int col){
        //check row
        for (int j=0;j< board.length;j++){
            if (board[row][j]=='Q') return false;
        }
        //check col
        for (int i=0;i< board.length;i++){
            if (board[i][col]=='Q') return false;
        }
        //check northeast
        int n= board.length;
        int i=row;
        int j=col;
        while (i>=0 && j<n){
            if (board[i][j]=='Q')return false;
            i--;
            j++;
        }
        //check southeast
        i=row;
        j=col;
        while (i<n && j<n){
            if (board[i][j]=='Q') return false;
            i++;
            j++;
        }
        //check northwest
        i=row;
        j=col;
        while (i>=0 && j>=0){
            if (board[i][j]=='Q') return false;
            i--;
            j--;
        }
        //check southwest
        i=row;
        j=col;
        while (i<n && j>=0){
            if (board[i][j]=='Q') return false;
            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        //QUESTION 1

        //RAT IN A MAZE-2 DIRECTIONS
        int rows=3;
        int cols=3;
        int count=maze(1,1,rows,cols);  //1 based index
        System.out.println(count);
        System.out.println("2 Direction only");
        //printing maze path
        print(1,1,rows,cols,"");  //1 based index

        //RAT IN A MAZE -4 DIRECTIONS
        System.out.println("4 Direction ");
        boolean[][] isVisited=new boolean[rows][cols]; //by default-->whole matrix is filled with false
        print2(0,0,rows-1,cols-1,"",isVisited); //0 based indexing

        //RAT IN A DEAD MAZE -2
        //for row-4 ,col-6
        System.out.println("dead maze 2 direction");
        int[][] maze={{1,1,1,},{1,1,1},{0,1,1}};
        print3(0,0,rows-1,cols-1,"",maze);

        //RAT IN A DEAD MAZE-4
        //for row-4 ,col-6
        System.out.println("dead maze 4 direction");
//        boolean[][] isVisited=new boolean[rows][cols]; //already in scope above
//        int[][] maze={{1,0,1,1,1,1},{1,1,1,1,0,1},{0,1,1,1,1,1},{0,0,1,0,1,1}};
        print4(0,0,rows-1,cols-1,"",maze);

        //QUESTION 2
        System.out.println("permutations of '1 2 3'");
        String str="123";
        List<String > l=new ArrayList<>();
        permutations(str,"",l);
        for (int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
        //method1
        System.out.println("permutations via backtracking of '1 2 3'");
        int[] nums={1,2,3};
        System.out.println(PermutationViaBackTrack(nums));
        //method2
        System.out.println("permutations via backtracking method-2 of '1 2 3'");
        System.out.println(PermutationMethod2(nums));

        //QUESTION 3
        System.out.println("N Queen Configuration");
        int n=4;
        char[][] board=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        nqueen(board,0);
    }
}
