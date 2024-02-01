import java.util.ArrayList;

public class lecture35 {
    static ArrayList<String> getSSQ(String s){  //s->abc
        ArrayList<String> ans= new ArrayList<>();

        //base case
        if (s.length()==0){
            ans.add("");
            return ans;
        }
        //recursive work
        char curr =s.charAt(0); //a..then b
        ArrayList<String> smallans=getSSQ(s.substring(1)); //abc-->bc-->c-->" "
        //smallans=["bc","b","c"," "]

        //selfwork
        for (String ss:smallans){
            ans.add(ss);   //ans=["bc","b","c"," "] =bc
            ans.add(curr+ss);  //ans=["abc","ab","ac","a"]
        }
        return ans;   //ans=["abc","ab","ac","a","bc","b","c"," "]

    }
    static void printSSQ(String s,String currAns){  //s=abc, currAns=" "
        //base case
        if (s.length()==0){
            System.out.println(currAns);
            return;
        }
        //recursive work
        char curr =s.charAt(0); //a
        String remString=s.substring(1); //bc
        //selfwork
        //curr character-->chooses to be a part of currAns
        printSSQ(remString,currAns+curr);
        //curr character-->doesnt chooses to be a part of currAns
        printSSQ(remString,currAns);
    }

    static void SubsetSum(int[] arr,int n,int idx,int currSubsetSum){
        //base case-->
        if (idx>=n){
            System.out.println(currSubsetSum);
            return;
        }
        //curr index -->chooses to be a part of currSubsetSum
        SubsetSum(arr,n,idx+1,currSubsetSum+arr[idx]);
        //curr index -->does not choose to be a part of currSubsetSum
        SubsetSum(arr,n,idx+1,currSubsetSum);
    }

    public static void main(String[] args) {
//        ArrayList<String> ans= getSSQ("abc");   //write string in "" then only it will accept
//        for (String ss:ans){
//            System.out.println(ss);
//        }
//        //2nd que
//        printSSQ("abc"," ");
        //3rd que
        int[] arr={2,4,5};
        SubsetSum(arr,arr.length,0,0);

    }
}
