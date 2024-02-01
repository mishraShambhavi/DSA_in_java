//arrays basics
class Arrays{




    void multiDArrays(){   //method
        int[][] twoD = new int[2][3];
        int[][] twod={{21,8,4},{22,7,3}};  //represents above array only
        //MANUAL PRINT
        System.out.println(twod[0][1]);   //8
        System.out.println(twod[1][2]);   //3

        System.out.println(twod.length);   //2
        System.out.println(twoD.length);   //2
        //TRAVERSE
        for (int i =0;i<2;i++){            //<2 is because index starts from 0
            //2 or twod.length
            for (int j=0;j<3;j++) //3 or twod[i].length
            System.out.println(twod[i][j]);

        }




    }
    void singleDArrays() {  //demo arrays is a method

        int ages[];
        ages = new int[5];
        float weights[] = new float[3];
        String names[] = {"rahul", "raj", "shambhavi"};
        ages[0] = 12;
        ages[1] = 14;
        ages[2] = 2;
        ages[3] = 72;
        ages[4] = 52;
        // ages[6]=67;  //error-out of bounds
        //ages[-3]=67;  //same error
        //MANUAL PRINTING
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);
        //System.out.println(ages[7]);
        System.out.println(ages);
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

        //TRAVERSING

        for (int i = 0; i < 5; i++) {    //5 or ages.length
            System.out.println(ages[i]);
        }
        int i = 0;
        //or
        while (i < 5) {
            System.out.println(ages[i]);
            i++;
        }
    }

       void sumofArray(){
            int [] arr={1,2,3,4,5,6,7,8,9};
            //sum of arr - sum of array method
            int sum = 0;
            for (int a = 0; a < arr.length; a++) {
                sum =sum+ arr[a];

            }
           System.out.println("sumof arr is-");
           System.out.println(sum);





    }

       void maxValue(){
        int [] maxof ={10,17,56,90,11,18};   //ans=90
        int ans=0;
        for (int i=0;i<maxof.length;i++){
            if (maxof[i]>ans){
                ans=maxof[i];
            }

        }
           System.out.println(ans);

//        int ans=0;
////        int i=0;
//        int temp= 0;
//        for ( int i=0;i<maxof.length;i++){
//
//                    if(maxof[i+1]>maxof[i]){
//
//                        temp = maxof[i+1];
//
//                   }
//                    else{
//                        temp=maxof[i];
////            }
//        }
//           System.out.println(temp);
    }

    void elementx(){
        int [] arr={1,5,3,3};
        int x=1;
//        int ans=0;
//        for (int i =0;i<arr.length;i++){
//            if (arr[i]==x){
//                ans=i;
//                System.out.println(ans);
//                break;
//            }else {
//                ans=-1;
//                System.out.println(ans);
//            }
//        }
        //LINEAR SEARCH
        int ans=-1;
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == x) {
                ans = i;
                break;


            }
        }System.out.println(ans);
        }



}
public class lecture14 {
    public static void main(String[] args) {
        Arrays obj = new Arrays();
      // obj.singleDArrays();
      //  obj.multiDArrays();
        // obj.sumofArray();
        //obj.maxValue();
        obj.elementx();


    }
}
