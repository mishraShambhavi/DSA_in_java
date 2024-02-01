public class lecture39 {

    static void Insertionsort(int[] arr,int n){
        for (int i=1;i<n;i++){
            for (int j=i;j>0;j--){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={4,20,5,31,10,89};
        Insertionsort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
