public class lecture38 {
    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n -1; i++) {   //i represents the current index
            //finding min value index using j loop
            int min_index = i;  //initially i=0th index
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            //swap min element with current element i
                if (min_index != i) { //for i-->min element vo khud ni h ..0th element min ni h
                    int temp = arr[i];
                    arr[i] = arr[min_index];
                    arr[min_index] = temp;
                }


        }
    }

    public static void main(String[] args) {
        int[] arr = {99,44,66,3,2,1};
        selectionSort(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

