import java.util.Scanner;

public class frequencyQuestion {
    static int[] makeFrequencyArray(int[] arr){
        int [] freq = new int[100005];   //10^5 size in question we took 5 more space for safety
        for(int i =0;i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter "+n+" elements");
        for (int i =0;i< n ;i++){
            arr[i]= sc.nextInt();
        }
        int [] freq = makeFrequencyArray(arr);
        System.out.println("enter number of queries");
        int query = sc.nextInt();

        while (query>0){
            System.out.println("enter number to be searched");
            int x= sc.nextInt();
            if (freq[x]>0){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }
            query--;
        }





    }

}


