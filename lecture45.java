public class lecture45 {
    static boolean binarysearch(int[] arr,int target){
        int n = arr.length;
        int start=0,end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==target){
//                System.out.println("yes element present at");
//                System.out.println("index-"+mid);
                return true;
            }else if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            }
        }
//      System.out.println("false");
        return false;
    }
    static boolean recBS(int[] arr,int st,int end,int target){
        //base case
        if (st>end) return false;

        int mid=(st+end)/2;
        if (target==arr[mid]) return true;
        else if(target<arr[mid]) {
            return recBS(arr,st,mid-1,target);
        }else
            return recBS(arr, mid+1, end, target);
    }
    static int firstocc(int[] a,int x){
        int n=a.length;
        int st=0,end=n-1;
        int fo=-1;
        while (st<=end){
            int mid=(st+end)/2;
            if (a[mid]==x){
                fo=mid;
                end=mid-1;     //for last occrence question replace this line with-->st=mid+1;
            } else if(x<a[mid]) {
                end=mid-1;
            }else {
                st = mid + 1;
            }
        }
        return fo;
    }
    static int sqroot(int n){
        //linear search
        int y=0;
        while (y*y<=n){
            y++;
        }
        return y-1; //y-1 since after 4*4<=24..y++ ..y=5...
                   // and while loop breaks for y=5 but we dont want to return y=5 so we minus 1
    }
    static int sqroot2(int x){
        //binary search

        int start=0,end= x;
        int ans=-1;
        while(start<=end) {
            int mid = (start + end) / 2;
            int val = mid * mid;
            if (val == x) {
                return mid;
            } else if (x > val) {
                start = mid + 1;
                ans = mid;
            } else if (x < val) {
                end = mid - 1;
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        int target=0;
        while(target!=10){
            System.out.printf("%d exists in array :%b \n",target,binarysearch(arr,target));
            System.out.printf("%d exists in array :%b \n",target,recBS(arr,0,arr.length-1,target));
            System.out.println();
            target++;
        }

        int[] a={1,2,2,3,4,5,5,5,6,7,8,};  //sorted increasing
        //int x=3;
       // System.out.println(firstocc(a,x));

        int n=24;
        System.out.println(sqroot(n));
        int x=24;
        System.out.println(sqroot2(x));
    }
}
