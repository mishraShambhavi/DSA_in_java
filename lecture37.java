public class lecture37 {
    static void bubblesortincreasing(int[] arr,int n){

        for (int i=0;i<n-1;i++){
            boolean flag=false;   //flag-->has any swapping of adjacent elements occured
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                    flag=true;   //swapping has happened
                }
                if (flag==false){ //means array sorted
                    return;   // we don't need to iterate on next i we can stop and optimse our code

                }
            }
        }
        return;
    }
    static void bubblesortdecreasing(int[] arr,int n){

        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if (arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return;
    }
    public static void main(String[] args) {
        int[] arr={5,34,30,22,1,10};
        int n= arr.length;
    //  bubblesortincreasing(arr, arr.length);
        bubblesortdecreasing(arr, arr.length);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
