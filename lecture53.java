public class lecture53 {
    public static class Node {
        int data;
        Node next;
        Node prev;
        Node child;

        Node(int data) {
            this.data = data;
        }
    }

    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    static void display2(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    static void display3(Node random) {
        Node temp = random;
        //move this temp backwards to head
        while (temp.prev != null) {
            temp = temp.prev;
        }
        //now temp is at head
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();

    }

    //IMPLEMENTATION THROUGH DATA STRUCTURE
    public static class doublyll {
        Node head = null;
        Node tail = null;
        int size = 0;

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        void insertatBeginning(int data) {
            Node temp = new Node(data);
            temp.next = head;
            head.prev = temp;
            head = temp;
        }

        void insertatend(int data) {

            Node temp = new Node(data);
            Node p = head;
            if (head == null) {     //linked list khali hai
                head = temp;  //jo naya node temp banaya hai usse hi head bana lo
                head.prev = null;

            } else {
                while (p.next != null) {
                    p = p.next;
                }
                p.next = temp;
                temp.prev = p;
                p = temp;
            }
        }

        void insert(int idx, int data) {
            Node s = head;
            for (int i = 1; i <= idx - 1; i++) {
                s = s.next;
            }
            //s is at idx-1 position
            //r is at idx position
            Node r = s.next;
            Node t = new Node(data);
            // S T R
            s.next = t;
            t.prev = s;
            t.next = r;
            r.prev = t;

        }

        void deletehead() {
            head = head.next;
            head.prev = null;
        }

        void deleteatend() {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

        void deleteIndex(int idx) {
            Node temp = head;
            for (int i = 1; i < idx - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp.prev = temp;
        }
    }

    static Node flatten(Node head) {
        Node temp = head;
        while (temp != null) {
            Node t = temp.next;
            if (temp.child != null) {
                Node c = flatten(temp.child);
                temp.next = c;
                c.prev = temp;
                while (c.next != null) {
                    c = c.next;
                }
                c.next = t;
                if (t != null) t.prev = c;
            }
            temp.child = null;    //VVIMP
            temp = t;
        }
        return head;
    }





    public static void main(String[] args) {
        // 4 10 2 99 13
//        Node a= new Node(4);
//        Node b= new Node(10);
//        Node c= new Node(2);
//        Node d= new Node(99);
//        Node e= new Node(13);
//        a.prev=null;
//        a.next=b;
//        b.prev=a;
//        b.next=c;
//        c.prev=b;
//        c.next=d;
//        d.prev=c;
//        d.next=e;
//        e.prev=d;
//        e.next=null;
//        display(a);
//        display2(e);
//        display2(d);


        doublyll ll=new doublyll();
        ll.insertatend(1);
        ll.insertatend(2);
        ll.insertatend(3);
        ll.insertatend(4);
        ll.insertatend(5);
        ll.insertatend(7);
        ll.insertatend(8);
        //ll.display();
        ll.insertatBeginning(0);
        //ll.display();
        ll.insert(6,6);
        //ll.display();
        ll.deletehead();
        //ll.display();
        ll.deleteatend();
        ll.display();
        ll.deleteIndex(3);
        ll.display();





    }
}
