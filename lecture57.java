import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class lecture57 {
    public static class queueArray {
        int f = -1;   //front
        int r = -1;  //rear
        int[] arr = new int[4];
        int size = 0;

        void add(int val) {
            if (r == arr.length - 1) {
                System.out.println("queue full");
                return;
            }
            if (f == -1) {
                arr[0] = val;
                r = 0;
                f = 0;
            } else {
                arr[r + 1] = val;
                r++;
            }
            size++;
        }

        int remove() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }

        int peek() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            int x = arr[f];
            return x;
        }

        void display() {
            if (size == 0) {
                System.out.println("queue is empty");
            } else {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class queueLL{
        Node head=null;
        Node tail=null;
        void add(int val){
            Node temp =new Node(val);
            if (head==null){
                head=tail=temp;
            }else {
                tail.next=temp;
                tail=temp;
            }
        }
        void delete(){
            if (head==null) {
                System.out.println("oops ll empty");
            }
            head=head.next;
        }
        int peek(){
            if (head==null){
                System.out.println("oops ll empty");
                return -1;
            }
            return head.data;
        }
        void display(){
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

    }
    public static class CircularqueueArray {
        int f = -1;   //front
        int r = -1;  //rear
        int[] arr = new int[4];
        int size = 0;

        void add(int val) {
            if (size==arr.length){
                System.out.println("array is full");
            }else if (r == arr.length - 1) {
                arr[0] = val;
                r = 0;
            }else if (f == -1) {  //size==0
                arr[0] = val;
                r = 0;
                f = 0;
            } else if(r< arr.length-1) {
                arr[r + 1] = val;
                r++;
            }
            size++;
        }
        int remove() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }else if (f== arr.length-1){
                int x =arr[f];
                f=0;
                size--;
                return x;
            }else {
                int x = arr[f];
                f++;
                size--;
                return x;
            }
        }
        int peek() {
            if (size == 0) {
                System.out.println("queue is empty");
                return -1;
            }
            int x = arr[f];
            return x;
        }

        void display() {
            if (size == 0) {
                System.out.println("queue is empty");
            } else if(f<=r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }
            }
            else if(r<f){
                for (int i = f; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i]+" ");
                }

            }
        }
    }


        public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();
//        //add,remove,peek,size
//        q.add(1);
//        q.add(2);
//        q.add(3);
//        q.add(4);
//        q.add(5);
//        System.out.println(q);
//        System.out.println(q.size());
//        q.remove();
//        System.out.println(q);
//        q.poll();
//        System.out.println(q.element());
//        System.out.println(q.peek());


            //PRINTING A QUEUE
//        Queue<Integer> q1=new LinkedList<>();
//        while(q.size()>0){
//            System.out.print(q.element());
//            q1.add(q.remove());
//        }
//        while(q1.size()>0){
//            q.add(q1.remove());
//        }
//        System.out.print(q1);

            //implementation by array
//            queueArray q = new queueArray();
//            q.add(1);
//            q.add(23);
//            q.add(34);
//            q.add(45);
//            q.display();
//            q.remove();
//            q.display();
//            System.out.println(q.peek());
//            q.add(7);
//            System.out.println(q.size);

            //implementation by LL
//            queueLL q=new queueLL();
//            q.add(1);
//            q.add(2);
//            q.add(3);
//            q.display();
//            System.out.println(q.peek());
//            q.delete();
//            q.display();

            //implementation by circular queue array
//            CircularqueueArray q=new CircularqueueArray();
//            q.add(1);
//            q.add(2);
//            q.add(3);
//            q.add(4);
//            q.display();
//            System.out.println(q.peek());
//            q.remove();
//            q.add(5);
//            q.display();

            //DEQUE
            Deque<Integer> dq=new LinkedList<>();
            //add, remove,peek
            dq.addLast(23);
            dq.addLast(7);
            dq.addLast(93);
            dq.addLast(28);
            dq.addFirst(5);
            dq.add(90);   //last se
            System.out.println(dq);
            dq.removeLast();
            dq.removeFirst();
            System.out.println(dq);
            dq.remove();   //default aage se
            System.out.println(dq);
            System.out.println(dq.getFirst()); //peek

        }
    }

