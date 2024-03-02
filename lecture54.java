import java.util.*;
public class lecture54 {
    static void pushatbottomrecurssion(Stack<Integer> stackname){
        if (stackname.isEmpty()){
            System.out.print(stackname.push(0)+" ");
            return;
        }
        int top=stackname.pop();
        pushatbottomrecurssion(stackname);
        System.out.print(top+" ");
        stackname.push(top);
    }
    static void Reversedisplayrecurssion(Stack<Integer> stackname){
        if (stackname.isEmpty())return;
        int top=stackname.pop();
        System.out.print(top+" ");       //display in reverse order
        Reversedisplayrecurssion(stackname);
        //System.out.print(top+" ");      //display in same order
        stackname.push(top);
    }
    static void pushatbottomrecurssion(Stack<Integer> stackname,int element){
        if (stackname.isEmpty()){
            stackname.push(element);
            return;
        }
        int top=stackname.pop();
        pushatbottomrecurssion(stackname,element);
//        System.out.print(top+" ");
        stackname.push(top);
    }
    static void reverseStack(Stack<Integer> stackname){
        if (stackname.size()==1)return;
        int top=stackname.pop();
        reverseStack(stackname);
        pushatbottomrecurssion(stackname,top);
    }




    public static void main(String[] args) {
        //manual creation of stack
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(23);
        st.push(3);
        st.push(36);
        st.push(31);    //last element hence also the first element to get out

        System.out.println(st.peek());    //31

        st.pop();               //will remove 31
        System.out.println(st);

        System.out.println("size of stack st is: "+st.size());  //..4

        System.out.println(st.isEmpty());

        while (st.size()>4){    //to access n=4-->36
            st.pop();
        }
        System.out.println(st.peek());    //36

//        //User defined creation of stack
//        Scanner sc=new Scanner(System.in);
//        Stack<Integer> St=new Stack<>();
//        System.out.println("enter the number of elements you want to insert");
//        int n=sc.nextInt();
//        System.out.println("enter elements");
//        for (int i=1;i<=n;i++){
//            int x=sc.nextInt();
//            St.push(x);
//        }
//        System.out.println(St);


        //copy stack st-
        //reverse st
        Stack<Integer> rt=new Stack<>();
        while (st.size()>0){
            rt.push(st.pop());
//            int x=st.peek();
//            rt.push(x);
//            st.pop();
        }
        System.out.println(rt);     // 36 3 23 1
        System.out.println(st);    //empty
        Stack<Integer> gt=new Stack<>();
        while (rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);    //[1, 23, 3, 36]

        //insert at bottom or any index  ...gt stack mai
        Stack<Integer> it=new Stack<>();
        while (gt.size()>2){       //for bottom >0
            it.push(gt.pop());
        }
        gt.push(50);
        while (it.size()>0){
            gt.push(it.pop());
        }
        System.out.println(gt);
        System.out.println(gt.peek());

        //copy/printing elements of stack using array
        Stack<Integer> at=new Stack<>();
        at.push(2);
        at.push(44);
        at.push(9);
        at.push(3);
//        int n=at.size();
//        int[] arr=new int[n];
//        //stack at-->to array transfer of elements
//        for (int i=n-1;i>=0;i--){
//            arr[i]=at.pop();
//            System.out.println(arr[i]+" ");   //2 44 9 0
//        }
//        //array arr to -->stack transfer
//        for (int i=0;i<=n-1;i++){
//            System.out.println(arr[i]);
//            at.push(arr[i]);
//        }
//        Reversedisplayrecurssion(at);
//        pushatbottomrecurssion(at,0);
        reverseStack(at);
        System.out.println(at);
        reverseStack(at);
        System.out.println(at);













    }
}
