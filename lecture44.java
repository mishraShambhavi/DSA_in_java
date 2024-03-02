public class lecture44 {
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
    static void que1(int[] arr){
        int x=-1;
        int y=-1;
        //handling 1 element size array..corner/edge case
        if (arr.length<=1){
            return;
        }
        for (int i=1;i< arr.length;i++){   //only one loop running n times TC-->0(n)
            if (arr[i-1]>arr[i]){
                if (x==-1){   //handling 1st distortion
                    x=i-1;
                    y=i;      //assuming 2 element case
                }else y=i;
            }
        }
        //swapping
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    static void que2(int[] arr2){  //linear as we are going at each element only once
        int i=0,j= arr2.length-1;
        while(i<j){
            while(arr2[i]<0)i++;
            while(arr2[j]>=0)j--;

            if (i<j) {         //checking again cond so that we dont cross i and j and again swap them
                int temp = arr2[i];
                arr2[i] = arr2[j];
                arr2[j] = temp;
                i++;
                j--;
            }
        }
    }
    static void que3(int[] arr3){
        //TC-->n+n=2n since 2 passes
        int count_0=0;
        int count_1=0;
        int count_2=0;
        //1st PASS TO COUNT 0,1,2 ....Tc-->0(n)
        for (int i =0;i< arr3.length;i++){
            if (arr3[i]==0){
                count_0++;
            }
            else if(arr3[i]==1)
                count_1++;
            else if (arr3[i]==2){
                count_2++;
            }
        }
        //2nd PASS TO OVERWRITE arr3....Tc-->0(n)
        int k=0;
        while(count_0>0){
            arr3[k]=0;
            k++;
            count_0--;
        }
        while(count_1>0){
            arr3[k]=1;
            k++;
            count_1--;
        }
        while(count_2>0){
            arr3[k]=2;
            k++;
            count_2--;
        }
    }
    static void swap(int[] arr3,int i,int j){
        int temp = arr3[i];
        arr3[i] = arr3[j];
        arr3[j] = temp;
    }
    static void que3SecondApproach(int[] arr3){
        //to sort in linear time and 1 pass and constant space by using 3 pointers
        int lo=0,mid=0,hi= arr3.length-1;

        //exploring unknown region
        while(mid<=hi){
            if (arr3[mid]==0){
                swap(arr3,mid,lo);
                mid++;
                lo++;
            }else if(arr3[mid]==1){
                mid++;
            }else {
                swap(arr3,mid,hi);
                hi--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,6,4,5,3,7};    //3 swapped with 6 in an increasing sorted array
        que1(arr);
        printArray(arr);

        int[] arr2={3,7,-12,-11,2,-30,67,-1};
        que2(arr2);
        printArray(arr2);

        int[] arr3={0,1,1,2,1,2,1,0};
        que3(arr3);
        printArray(arr3);
        //or
        que3SecondApproach(arr3);
        printArray(arr3);

    }
}
