import java.util.*;
public class lecture55 {
       static boolean isbalanced(String str){
        Stack<Character> st=new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if (ch=='('){
                st.push(ch);
            }else {          //ch==')'
                if (st.isEmpty()) return false;
                if (st.peek()=='(')st.pop();
            }
        }
        if (st.size()>0)return false;
        else return true;
       }
    static int minbracketsremoval(String str){
        Stack<Character> st=new Stack<>();
        for (int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if (ch=='('){
                st.push(ch);
            }else {          //ch==')'
                if (st.isEmpty()){
                    st.push(ch);
                }
                if (st.peek()=='(')st.pop();
            }
        }
        int min=st.size();
        return min;
       }
       static boolean isvalid(String str){
           Stack<Character> st=new Stack<>();
           for (int i=0;i<str.length();i++){
               char ch=str.charAt(i);
               if (ch == '(') {
                   st.push(ch);
               }
               if (ch=='{'){
                   st.push(ch);
               }
               if (ch=='['){
                   st.push(ch);
               }
               if (ch==')'){
                   if (st.isEmpty()) return false;
                   if (st.peek()=='('){
                       st.pop();
                   }else return false;
               }
               if (ch==']'){
                   if (st.isEmpty()) return false;
                   if (st.peek()=='['){
                       st.pop();
                   }else return false;
               }

               if (ch=='}'){
                   if (st.isEmpty()) return false;
                   if (st.peek()=='{'){
                       st.pop();
                   }else return false;
               }
           }
           if (st.size()>0) return false;
           else return true;
       }
       static int[] remove(int[] array){
           Stack<Integer> st=new Stack<>();

           for (int i=0;i<array.length;i++) {
               if (st.size() == 0 || st.peek()!=array[i])
                   st.push(array[i]);
               else if (st.peek()==array[i]){
                   if (i== array.length-1 ||array[i]!=array[i+1]) st.pop();
                   if (array[i]==array[i+1]);   //skip
               }
           }
           int[] arr=new int[st.size()];
           for (int i=arr.length-1;i>=0;i--){
               arr[i]=st.pop();
           }
           return arr;
       }
       static int[] nextgreator(int[] arr){
           Stack<Integer> st=new Stack<>();
           int[] res=new int[arr.length];
           for (int i=0;i< res.length;i++) {
               res[res.length - 1] = -1;  //last element
           }
           for (int i=0;i< arr.length;i++) {
               st.push(arr[arr.length-1]);
           }
           for (int i=arr.length-2;i>=0;i--){
               while(st.size()>0 && st.peek()<arr[i]){
                   st.pop();
               }
               if (st.size()==0) res[i]=-1;
               else res[i]=st.peek();
               st.push(arr[i]);
           }
           return res;
       }
       static int largestRectangle(int[] heights){
           Stack<Integer> st=new Stack<>();
           int[] nse=new int[heights.length];
           int[] pse=new int[heights.length];
           int n=heights.length;
           //NSE
           st.push(n-1);  //array ke last element ke index ko stack mai insert
           nse[n-1]=n;
           for (int i=n-2;i>=0;i--){
               while (st.size()>0 && heights[st.peek()]>=heights[i]){
                   st.pop();
               }
               if (st.size()==0) nse[i]=n;
               else nse[i]=st.peek();
               st.push(i);
           }
           while(st.size()>0) st.pop();    //emptying the stack
           //PSE
           st.push(0);
           pse[0]=-1;
           for (int i=1;i<=n-1;i++){
               while (st.size()>0 && heights[st.peek()]>=heights[i]){
                   st.pop();
               }
               if (st.size()==0) pse[i]=-1;
               else pse[i]=st.peek();
               st.push(i);
           }
           //MAX AREA
           int max=-1;
           for (int i=0;i<=n-1;i++){
               int area=heights[i]*(nse[i]-pse[i]-1);
               max=Math.max(max,area);
           }
           return max;
       }

      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//Q1    BALANCED BRACKETS
        //String str=sc.nextLine();
        //System.out.println(isbalanced(str));

//2     MIN NUMBER OF BRACKET REMOVAL TO MAKE BALANCED
        //  System.out.println(minbracketsremoval(str));

//Q3    VALID BRACKETS {,[,(
        //  System.out.println(isvalid(str));

//q4    REMOVE CONSECUTIVE SUBSEQUENCES
//          int[] arr1={1,2,2,3,4,4,4,5,7,7,7,2};
//          int[] res=remove(arr1);
//          for (int i=0;i<res.length;i++){
//              System.out.println(res[i]+" ");
//          }

//Q5    NEXT GREATER ELEMENT
          int[] arr2={1, 2, 4, 3, 5, 8, 7};
//          int[] output=new int[arr2.length];
//          for (int i=0;i<arr2.length;i++){
//              output[i]=-1;      //otherwise by default its 0
//              for (int j=i+1;j<arr2.length;j++){
//                  if (arr2[j]>arr2[i]){
//                      output[i]=arr2[j];
//                      break;   //inner loop will break and i would increase for next value
//                  }
//              }
//          }
//          for (int i=0;i<output.length;i++){
//              System.out.println(output[i]+" ");
//          }

//          int[] res=nextgreator(arr2);
//          for (int i=0;i<res.length;i++){
//              System.out.println(res[i]+" ");
//          }

          int[] heights={2,1,5,6,2,3};
          System.out.println(largestRectangle(heights));   //12 as ans
      }
}
