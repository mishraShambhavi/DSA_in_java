import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class lecture58 {
    public static class StackUsingQueue{
        Queue<Integer> q=new LinkedList<>();

        void push(int val){
           q.add(val);
        }
        int pop(){
            int x=0;
            for (int i=0;i<q.size()-1;i++) {
                q.add(q.remove());
            }
                x=q.peek();
                q.remove();

            return x;
        }
        int peek(){
            int x=0;
            for (int i=0;i<=q.size()-1;i++){
                q.add(q.remove());
                x=q.peek();
                q.add(q.remove());
            }
            return x;
        }
        void display(){
        Queue<Integer> q1=new LinkedList<>();
        while(q.size()>0){
            System.out.print(q.element()+" ");
            q1.add(q.remove());
        }
        while(q1.size()>0){
            q.add(q1.remove());
        }

        }
    }
    public static class QueueUsingStack{
        Stack<Integer> st=new Stack<>();
        Stack<Integer> rt=new Stack<>();
        void push(int data){
            st.push(data);
        }
        int peek(){
            while (st.size()>0) {
                rt.push(st.pop());
            }
            int x=rt.peek();
            while (rt.size()>0) {
                st.push(rt.pop());
            }
            return x;
        }
        int pop(){
            while (st.size()>0) {
                rt.push(st.pop());
            }
            int x=rt.pop();
            while (rt.size()>0) {
                st.push(rt.pop());
            }
            return x;
        }
        void display(){
            while (st.size()>0){
                System.out.println(st);
                return;
            }
        }

    }
    static void reverse(Queue q,int k){
        Stack<Integer> st=new Stack<>();
        for (int i=0;i<k;i++){
            int x=(int)q.remove();
            st.push(x);
        }
        while (st.size()>0){
            q.add(st.pop());
        }
        for (int i=0;i<q.size()-k;i++){
            int x=(int)q.peek();
            q.remove();
            q.add(x);

        }
        System.out.println(q);
    }
    static void firstNegative(int[] arr, int k){
        Queue<Integer> q=new LinkedList<>();
        int[] res=new int[arr.length-k+1];
        for (int i=0;i<arr.length;i++){  //adding negative element indices
            if (arr[i]<0) {
                q.add(i);
            }
        }
        for (int i=0;i< arr.length-k+1;i++){
            if (q.size()>0 && q.peek()<i) q.remove();

            if(q.size()>0 &&q.peek()<=i+k-1){
                res[i]=arr[q.peek()];
            }else if(q.size()==0) res[i]=0;
            else res[i]=0;
        }
        for (int i=0;i< res.length;i++){
            System.out.println(res[i]+" ");
        }
    }

    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();

        //QUESTION 1
//        q.add(45);
//        q.add(33);
//        q.add(65);
//        q.add(12);
//        System.out.println(q);
        //normal reverse
//        Stack<Integer> st=new Stack<>();
//        while(q.size()>0){
//            int x=(int)q.remove();
//            st.push(x);
//        }
//        while (st.size()>0){
//            q.add(st.pop());
//        }
//        System.out.println(q);
//        reverse(q,3);   //1 2 3 4-->2 1 3 4

        //QUESTION 2
//        StackUsingQueue q=new StackUsingQueue();
//        q.push(12);
//        q.push(23);
//        q.push(45);
//        q.display();
//        System.out.println();
//        System.out.println(q.peek());  //45
//        q.pop();
//        q.display();  //12 23

        //QUESTION 3
//        QueueUsingStack st=new QueueUsingStack();
//        st.push(22);
//        st.push(98);
//        st.push(87);
//        st.push(41);
//        st.display();
//        System.out.println(st.peek());
//        st.pop();
//        st.display();

        //QUESTION 4
//        int[] arr={12,-1,-7,8,-15,30,16,28};
//        int k=3;
//        firstNegative(arr,k);
//
        //QUESTION 5
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        System.out.println(q); //1 2 3 4 5 6 7 8
        Stack<Integer> st=new Stack<>();
        int s=q.size()/2;
        for (int i=1;i<=s;i++){
            st.push(q.remove());
        }   //5 6 7 8
        while (st.size()>0){
            q.add(st.pop());
        } //5 6 7 8 4 3 2 1
        for (int i=1;i<=s;i++){
            st.push(q.remove());
        }//4 3 2 1
        while (st.size()>0) {
            q.add(st.pop());
            q.add(q.remove());
        }
        while(q.size()>0){
            st.push(q.remove());
        }
        while (st.size()>0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
