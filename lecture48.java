public class lecture48 {

    static boolean isDivisionpossible(int[] arr,int m,int mxChocolateallowed){
        //TC-->0(n)
        int noofStudents=1;     //base-atleast one student should be present
        int choc=0;             //no. of choc current student has
        for (int i=0;i< arr.length;i++){
            //mxChocolateallowed=mid;
            if (arr[i]>mxChocolateallowed) return false;   //current box is having more than maxchoc
            if (choc+arr[i]<=mxChocolateallowed){
                choc+=arr[i];
            }else{
                noofStudents++;
                choc=arr[i];
            }
        }
        if (noofStudents>m) return false;
        else return true;
    }
    static int distributechocolates(int[] arr,int m){
        //binary search logic TC-->0(n.logn)...n for above method and bs runs logn times
        if (arr.length<m) return -1;      //eg-2 boxes and 3 students not possible
        int ans=0,start=1,end=(int)1e9;  //generalised start and end
        while (start<=end){
            int mid=(start+end)/2;
            if (isDivisionpossible(arr,m,mid)){   //mxchocolate=mid value
                ans=mid;
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return ans;
    }

    static boolean istrackdivPossible(int[] arr1,int k,int mintrackdis){
        //Tc--> 0(n) since loops iterates till the length of array
        int kidsplaced=1;
        int lastkid=arr1[0];
        for (int i=1;i< arr1.length;i++){
            if (arr1[i]-lastkid>=mintrackdis){
                kidsplaced++;
                lastkid=arr1[i];
            }
        }
        if (kidsplaced>=k) return true;
        else return false;

    }
    static int racespots(int[] arr1,int k){
        //TC-->0(logn) n=10^9 * n= 0(nlogn)
        if (k>arr1.length) return -1;
        int ans=0,start=1,end=(int)1e9;     //start=0/1
        while(start<=end){
            int mid=(start+end)/2;
            if (istrackdivPossible(arr1,k,mid)){ //can k kids be placed such that no 2 kids have distnce lesser than mid
                ans=mid;
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr={5,3,1,4,2};
        int m=3;
        System.out.println(distributechocolates(arr,m));

        int[] arr1={1,2,4,8,9};
        int k=3;
        System.out.println(racespots(arr1,k));

    }
}
