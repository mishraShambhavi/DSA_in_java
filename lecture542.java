
public class lecture542 {
    public static class Node{
        int data;   //value
        Node next;  //address of next node
        Node(int data){               //constructor
            this.data=data;
        }
    }
    //user defined data structure stack through ll
    public static class StackLL{
        Node head=null;
        int size=0;
        void push(int x){
            Node temp=new Node(x);
            if (head==null){
                head=temp;
                size++;
            }else {
                temp.next = head;
                head = temp;
                size++;
            }
        }
        Node peek(){
            //if (head==null) return -1;
            System.out.println("peek is "+head.data);
            return head;
        }
        Node pop(){
            Node temp=head;
            System.out.println("element deleted is "+temp.data+" stack after popping:-");
            head=head.next;
            size--;
            return head;

        }

        //BELOW IS DISPLAY REVERSE
        Node display(){
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
            return head;
        }
        void displayrec(Node h){
            if (h==null)return;
            displayrec(h.next);
            System.out.print(h.data+" ");
        }
        void displayseedha(){
            displayrec(head);
            System.out.println();
        }
        int Size(){
            return size;
        }
    }
    //user defined data structure stack through array
    public static class StackArray{
        int[] arr=new int[7];
        int idx=0;
        void push(int x){
            if (isFull()){
                System.out.println("stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek(){
            if (idx==0) {
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx - 1];

        }
        int pop(){
            if (idx==0){
                System.out.println("stack is empty!");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;

        }
        void display(){      //0 se lekar idx-1 element tak display karenge
            for (int i=0;i<=idx-1;i++){
                System.out.println(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if (idx==0)return true;
            else {
                return false;
            }
        }
        boolean isFull(){
           if (idx== arr.length)return true;
           else return false;
        }
        int capacity(){
            return arr.length;
        }
    }

    public static void main(String[] args) {
//        StackArray st=new StackArray();   //since the class name is stack so we can use its all functions
//        st.push(4);
//        st.push(5);
//        st.push(2);
//        st.push(7);
//        st.push(3);
//        st.push(9);
//        st.display();  //4 5 2 7 3 9
//        System.out.println(st.size());   //6
//        st.pop();   //9
//        st.display();  //4 5 2 7 3
//        System.out.println(st.isEmpty());
//        System.out.println(st.isFull());
//        st.push(8);
//        st.push(10);
//        st.push(11);
//        st.display();

        StackLL rt=new StackLL();
        rt.push(52);
        rt.push(60);
        rt.push(78);
        rt.push(34);
        rt.display();
        rt.peek();
        rt.pop();
        rt.display();
        System.out.println(rt.Size());
        rt.displayseedha();



    }

}
