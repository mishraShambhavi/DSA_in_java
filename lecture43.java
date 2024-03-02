import java.util.ArrayList;
import java.util.Collections;

public class lecture43 {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    static int Findmax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i< arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;

    }
    static void countsort(int[] arr){
        //find max element of the array
        int max=Findmax(arr);
        int[] freq=new int[max+1];   //if the max is 5 then size-->6 as indexing starts from 0
        for (int i=0;i< arr.length;i++){
            freq[arr[i]]++;
            //ex-freq[arr[0]]= freq[4]++ = means in frequency array at 4th index there was initially 0 value but due to ++ we increment 0 by value 1
        }
        //we will now overwrite the output in arr array
        int k=0;  //pointer for arr array
        for (int i =0;i< freq.length;i++){ //index
            for (int j=0;j<freq[i];j++){
                arr[k]=i;
                k++;
            }
        }


    }
    static void stableCountsort(int[] arr){
        int n= arr.length;
        int[] output=new int[n];
        //find max element of the array
        int max=Findmax(arr);
        int[] freq=new int[max+1];   //if the max is 5 then size-->6 as indexing starts from 0
        for (int i=0;i< arr.length;i++){
            freq[arr[i]]++;
            //ex-freq[arr[0]]= freq[4]++ = means in frequency array at 4th index there was initially 0 value but due to ++ we increment 0 by value 1
        }
        //making a prefix array by changing the freq array
        for (int i=1;i< freq.length;i++){
            freq[i]+=freq[i-1];   //freq[i]=freq[i]+freq[i-1];
        }
        //find the index of each element in the original array and put it in output array
        for (int i=n-1;i>=0;i--){
            int idx=freq[arr[i]]-1;
            output[idx]=arr[i];
            freq[arr[i]]--;
        }
        //copy all eements of output in arr
        for (int i=0;i<n;i++){
            arr[i]=output[i];      //n is size of both arrays
        }

    }
    static void CountsortForRadixsort(int[] arr,int place){
        int n= arr.length;
        int[] output=new int[n];
        //we don't need to find max and create freq array of size max
        int[] freq=new int[10];   //we only deal with digits[0-9=10 size]
        for (int i=0;i< arr.length;i++){
            freq[(arr[i]/place)%10]++;
        }
        //making a prefix array by changing the freq array
        for (int i=1;i< freq.length;i++){
            freq[i]+=freq[i-1];   //freq[i]=freq[i]+freq[i-1];
        }
        //find the index of each element in the original array and put it in output array
        for (int i=n-1;i>=0;i--){
            int idx=freq[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            freq[(arr[i]/place)%10]--;
        }
        //copy all eements of output in arr
        for (int i=0;i<n;i++){
            arr[i]=output[i];      //n is size of both arrays
        }

    }
    static void Radixsort(int[] arr){
        int max=Findmax(arr);
        //apply count sort to sort elements based on place value
        for (int place=1;max/place>0;place*=10){
            CountsortForRadixsort(arr,place);
        }
    }
    static void Bucketsort(float[] f){
        int n =f.length;
        //buckets    ..2d structure of array and each entry of array is an arraylist
        ArrayList<Float>[] buckets=new ArrayList[n];
    //  int [] a = new int[n]
    //create empty buckets
    for (int i =0;i<n;i++){
        buckets[i]=new ArrayList<Float>();
    }
    //add elements in the buckets
        for (int i=0;i<n;i++){
            int bucketindex=(int) f[i]*n;
            buckets[bucketindex].add(f[i]);
        }
    //sort each bucket
        for (int i=0;i< buckets.length;i++){
            Collections.sort(buckets[i]);
        }
    //merge all buckets
        int index=0;
        for (int i=0;i< buckets.length;i++){
            ArrayList<Float> currBucket= buckets[i];
            for (int j=0;j<currBucket.size();j++){
                f[index++]=currBucket.get(j);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={11,8,6,8,3,99,34};
        countsort(arr);
        printArray(arr);

        stableCountsort(arr);
        printArray(arr);

        Radixsort(arr);
        printArray(arr);
        float[] f={0.57f,0.93f,0.8f,0.1f};
        Bucketsort(f);
        for (int i = 0; i < f.length; i++) {
            System.out.print(f[i]+" ");
        }


    }
}
