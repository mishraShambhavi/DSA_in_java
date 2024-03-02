public class lecture46 {
    static int findminindex(int[] arr) {
        int n = arr.length;
        int start = 0, end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + end;
            if (arr[mid] > arr[n - 1]) {
                start = mid + 1;
            } else if (arr[mid] <= arr[n - 1]) {
                ans = mid;
                end = mid - 1;
            }
        }
        return ans;
    }

    static int findtargetindex(int[] arr, int target) {
        int n = arr.length;
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < arr[end]) {    //sorted part of main array
                if (target > arr[mid] && target <= arr[end]) {    //>= ni krre kyu ki mid ka = case upar covered hai
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else              //agar right vala sorted ni hai toh left wala hoga forsho
            //means a[start] to a[mid-1] is sorted
            {
                if (target >= arr[start] && target < arr[mid]) {  //<= ni krre kyu ki mid ka = case upar covered hai
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int duparray(int[] a, int target){

    int n = a.length;
    int start = 0, end = a.length - 1;
        while(start <=end) {
        int mid = (start + end) / 2;
        if (a[mid] == target) {
            return mid;
        } else if(a[start]==a[mid] && a[mid]==a[end]) {   //just add this condition in previous code for this duplicate question
            start++;
            end--;
        }
        if (a[mid] <= a[end]) {    //sorted part of main array
            if (target > a[mid] && target <= a[end]) {    //>= ni krre kyu ki mid ka = case upar covered hai
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } else              //agar right vala sorted ni hai toh left wala hoga forsho
        //means a[start] to a[mid-1] is sorted
        {
            if (target >= a[start] && target < a[mid]) {  //<= ni krre kyu ki mid ka = case upar covered hai
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
    }
        return-1;
}


        public static void main (String[]args){
            //rotated sorted array min element index
            int[] arr = {4, 5, 1, 2, 3};  //ans-2
            System.out.println(findminindex(arr));
            System.out.println(findtargetindex(arr,2));
            int[] a={1,2,2,0,1,1,1,1};

            System.out.println(duparray(a,0));

        }
    }
