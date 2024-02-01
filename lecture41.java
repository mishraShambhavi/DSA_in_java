public class lecture41 {
    static void merge(int[] arr,int l,int mid,int r){
        //TC-->0(n)
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];   //left array of size n1
        int[] right=new int[n2];  //right array of size n2
        int i,j,k;
        for (i=0;i<n1;i++) left[i]=arr[l+i];     //filling left array(which is empty) by 1st half of main array
        //l matlab starting se copy karna hai
        for (j=0;j<n2;j++) right[j]=arr[mid+1+j];     //filling right array(which is empty) by 2nd half of main array
        //mid+1 matlab beech se copy start karna

        i=0;
        j=0;
        k=l;
        while (i<n1 && j<n2){
            if (left[i]<=right[j]){
                arr[k++]=left[i++];
            }else
                arr[k++] = right[j++];

        }
        while (i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }
    }
    static void mergesort(int[] arr,int l,int r){
        //base case
        if (l>=r) return; //single size
        int mid=(l+r)/2;
        //recursive work
        mergesort(arr,l,mid);  // will provide the single element arrays of 1st half
        mergesort(arr,mid+1,r);  // will provide the single element arrays of 2nd half
        //self work-->to merge the single element sorted array
        merge(arr,l,mid,r);
    }

    public static void main(String[] args) {
        int[] arr={22,1,5,33,7,85};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        int n= arr.length;
        mergesort(arr,0,n-1);
        System.out.println("array after sorting-");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
