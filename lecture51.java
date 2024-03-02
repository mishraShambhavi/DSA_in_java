public class lecture51 {
    public static class Node{
        int data;   //value
        Node next;  //address of next node
        Node(int data){               //constructor
            this.data=data;
        }
    }

    //IMPLEMENTATION data structure
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        int size=0;

        void insertAtEnd(int data) {
            Node temp = new Node(data);

            if (head == null) {     //linked list khali hai
                head = temp;//jo naya node temp banaya hai usse hi head bana lo

            } else {               //agar already existing ll hai usmai last mai insert krna hai
                tail.next = temp;

            }
            size++;
            tail = temp;
        }
        void display(){           //head is local variable for this function
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        void insertAtBegin(int data){
            Node temp = new Node(data);
            if (head==null){
                insertAtEnd(data);
            }else{
                temp.next=head;     //temp ke next mai head ka address dalo and head ko temp banao
                head=temp;
            }
            size++;
        }

        void insert(int idx,int data){
            Node t=new Node(data);
            Node temp=head;
            if (idx<0){
                System.out.println("wrong input");
            }
            if (idx==0){
                insertAtBegin(data);
                return;
            }
            if (idx==size){
                insertAtEnd(data);
                return;
            }
            for (int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        int getElement(int idx){
            Node temp=head;
            for (int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        void deleteAt(int idx){
            Node temp=head;
            for (int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if (idx==size-1)tail=temp;       //deleteAt end
            if (idx==0)head=head.next;      //deleteAt beginning
            size--;
        }

    }



        static void display(Node temp) {
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

        static void displayR(Node head) {
            if (head == null) return;
            System.out.println(head.data);
            displayR(head.next);
        }

        static void displayReverse(Node head) {
            if (head == null) return;
            displayR(head.next);
            System.out.println(head.data);

        }

        static int length(Node a) {
            int count = 0;
            while (a != null) {
                count++;
                a = a.next;
            }
            return count;
        }

        public static void main(String[] args) {
            //1-simple manual implementation of singly linked list

//        Node x= new Node();        ..declaration
//        System.out.println(x.data);  //default value is 1;
//        System.out.println(x.next);  //default null
            //5 10 3 2...(list)
            //creation of nodes for above list in memory at different locations
            //initially all these nodes are pointing towards null (in the next part of node)
//        Node a= new Node(5);
//        Node b= new Node(10);
//        Node c= new Node(3);
//        Node d= new Node(2);
//        System.out.println(a);     //address-@5f184fc6
//        System.out.println(b);     //@3feba861
//        a.next=b;                  //linking a to b
//        //5-->10 3 2
//       System.out.println(a.next); //@3feba861--contains the address of b
//       // now since 'a' is linked with 'b' as it stores the address of b in its next we can access data of b without using b
//        // System.out.println(a.next.data);
//        //connecting all elements of the list
//        b.next=c;
//        c.next=d;
//        // hence 5-->10-->3-->2 becomes a linked list
//
//        //2-Display of LL
//        System.out.println(a.data);
//        System.out.println(a.next.data);
//        System.out.println(a.next.next.data);
//        System.out.println(a.next.next.next.data);
//
//        Node temp=a;
//        while (temp!=null){
//            System.out.println(temp.data+" ");
//            temp=temp.next;
//        }
//        display(a);       //temp abhi a ko point krega
//        displayR(a);      //recursive
//        displayReverse(a);
//        System.out.println(length(a));  //4

            //3-IMPLEMENTATION OF LL
            linkedlist ll=new linkedlist();
            ll.insertAtEnd(1);                  //creation of ll
            ll.insertAtEnd(2);
            ll.insertAtEnd(3);
            ll.insertAtEnd(4);
            ll.insertAtEnd(5);
            ll.display();
            System.out.println("size is-"+ll.size);
//            ll.insertAtEnd(6);                        //1 2 3 4 5 6
//            System.out.println("size is-"+ll.size);   //6
            ll.insertAtBegin(0);   //0 1 2 3 4 5
            ll.display();
            ll.insert(2,16);  //0 1 16 2 3 4 5
            ll.display();
            ll.insert(7,6);    //index is = size so we do insert at end case in our function
            ll.display();     //0 1 16 2 3 4 5 6
            System.out.println(ll.tail.data);
            ll.insert(0,100);   //0 100 1 16 2 3 4 5 6 5 which is wrong
            ll.display();    //100 0 1 16 2 3 4 5 6
            System.out.println(ll.getElement(3));  //3rd index=16

            ll.deleteAt(0);
            ll.display();
            System.out.println(ll.tail.data);





        }

}
