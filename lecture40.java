public class lecture40 {
    static void moveZeros(int arr[],int n){
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-1;j++){
                if (arr[j]==0 && arr[j+1]!=0){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
    static void lexicography(String [] s,int n) {
        for (int i = 0; i < n - 1; i++) {   //i represents the current index
            //finding min value index using j loop
            int min_index = i;  //initially i=0th index
            for (int j = i + 1; j < n; j++) {
                if (s[j].compareTo(s[min_index])<0){
                    min_index = j;
                }
            }
            //swap min element with current element i
            if (min_index != i) { //for i-->min element vo khud ni h ..0th element min ni h
                String temp = s[i];
                s[i] = s[min_index];
                s[min_index] = temp;
            }
        }
    }



    public static void main(String[] args) {
        int[] arr={1,0,3,0,2,0,6};
        moveZeros(arr, arr.length);
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        String[] s={"papaya","apple","watermwlon"};
        lexicography(s,s.length);
        for (int i=0;i< s.length;i++){
            System.out.print(s[i]+" ");
        }
    }
}
