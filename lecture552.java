import java.util.Stack;

public class lecture552 {
    public static class Minstack{
        Stack<Integer> st=new Stack<>();
        Stack<Integer> min=new Stack<>();
        void push(int val){
            if (st.size()==0) {
                st.push(val);
                min.push(val);
            }else{
                st.push(val);
                if (min.peek()<val) min.push(min.peek());
                else min.push(val);
            }
        }
        void pop(){
            st.pop();
            min.pop();
        }
        int peek(){
            return st.peek();
        }
        int getmin(){
            return min.peek();
        }

    }

    public static void main(String[] args) {
        Minstack ms=new Minstack();
        ms.push(3);
        ms.push(42);
        ms.push(22);
        ms.push(1);
        ms.push(62);
        System.out.println("before popping");
        System.out.println(ms.peek());
        System.out.println(ms.getmin());
        ms.pop();
        ms.pop();
        System.out.println("after popping");
        System.out.println(ms.peek());
        System.out.println(ms.getmin());

    }
}
