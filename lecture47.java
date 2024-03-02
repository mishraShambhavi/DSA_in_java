public class lecture47 {
    static boolean searchmatrix(int[][] arr,int target){
        int n=arr.length;       //rows
        int m=arr[0].length;   //cols  ...given there exist atleast 1 row
        int start=0,end=n*m-1;
        while (start<=end){
            int mid=(start+end)/2;
            int midelement=arr[mid/m][mid%m];   //translating mid/index of element into dim of that element
            if(midelement==target) return true;
            if (midelement>target){
                end=mid-1;
            } else {
                start=mid+1;
            }
        }
        return false;
    }

    static boolean searchmatrix1(int[][] a,int target){
        int n=a.length;         //rows
        int m=a[0].length;      //cols
        int i=0,j=m-1;
//        can't use for loop since 2 times i++ and j--
//        for (i = 0; i <n; i++) {
//            for (j = m - 1; j >= 0; j--)
        while(i<n && j>=0) {
            if (a[i][j] == target) {
                return true;
            }
            if (a[i][j] < target) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }
    static int peakIndex(int[] b){
        int ans=0;
        int n = b.length;
        int start=0,end=n-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (b[mid]<b[mid+1]){
                ans=mid+1;
                start=mid+1;

            }else{
                end=mid-1;
            }
        }
        return ans;
    }
    static int peakelement(int[] c){
        int n =c.length;
        int start=0,end=n-1;
        while (start<=end){
            int mid=(start+end)/2;
            if ((mid==0 || c[mid]>c[mid-1])&& (mid==n-1 ||c[mid]>c[mid+1])){
                return mid;
            }
            if (c[mid]<c[mid+1]){      //uphill
                start=mid+1;
            }else {                    //downhill
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//       //leetcode-
        //right to left ascending and first element of each row is greater than last element in previous row
        int[][] arr={{1,2,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchmatrix(arr,200));
        //leetcode-
        //right to left anf top to bottom ascending order
        int[][] a={{2,4,6,8},{5,6,7,20},{12,14,17,30}};
        System.out.println(searchmatrix1(a,200));

        int[] b={2,4,10,11,7,3,1,0};   //mountain array at peak index all values towards right and left are all smaller
        System.out.println(peakIndex(b));

        int[] c={1,2,1,3,5,6,4};   //for a particular element processed element before it and after it should be smaller
        System.out.println(peakelement(c));

    }
}
