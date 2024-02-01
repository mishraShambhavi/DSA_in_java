import java.util.ArrayList;

public class lecture33 {
    static boolean Linearsearch(int[] arr, int target, int idx){
        //base case
        if (idx>=arr.length) return false;
        //selfwork
        if (arr[idx]==target) return true;
        //smaller problem
        return (Linearsearch(arr, target, idx+1));
    }

    static int Findindexforsearchelementifpresent(int[] arr, int target, int idx){
        //base case
        if (idx>=arr.length) return -1;
        //selfwork
        if (arr[idx]==target) return idx;
        //smaller problem
        return (Findindexforsearchelementifpresent(arr, target, idx+1));
    }

      static void Findallindices(int[] arr,int target,int idx){
        //base case
          if (idx>=arr.length){
              return;     //return type void that's why only return
          }
          //self work
          if (arr[idx]==target){
              System.out.println(idx);
          }
          //smaller prob
          Findallindices(arr,target,idx+1);
      }

      //above question answer to be returned in an array List -->
      static ArrayList<Integer> allIndices(int[] arr,int target,int idx){
          ArrayList<Integer> ans= new ArrayList<>();
        //base case
          if (idx>=arr.length){
              return ans;   //return empty arraylist
          }
          //self work
          if (arr[idx]==target){
              ans.add(idx);
          }
          //smaller prob
          ArrayList<Integer> smallans= allIndices(arr,target,idx+1);
          ans.addAll(smallans);
          return ans;

    }

    public static void main(String[] args) {
        int[] arr={1,3,6,8,9,2,10,2};
        int target =2;
        if (Linearsearch(arr,target,0)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

        System.out.println(Findindexforsearchelementifpresent(arr,target,0));
        Findallindices(arr,target,0);
        System.out.println(allIndices(arr,target,0));

    }
}