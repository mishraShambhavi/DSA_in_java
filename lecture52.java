public class lecture52 {
     public static class Node{
        int data;
        Node next;
        Node random;
        Node(int data){               //constructor
            this.data=data;
            this.next=null;         //for question 19
            this.random=null;
        }
     }
     static void display(Node temp){
        while (temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
     }
     static int size(Node a){    //a is head
        Node temp=a;
        int count=0;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;

     }
     static void deleteNode(Node node){
        node.data=node.next.data;
        node.next=node.next.next;
        //exception-last node cannot be deleted by giving the node itself as a parameter
     }
     static Node nthLastnode(Node head,int n){    //head=a (passed in main)
        //USE EITHER 1ST OR 2ND APPROACH

        //1st Approach -TWO TRAVERSALS
//        Node temp=head;
//        int m=size(head);         //1st traversal
//        int l=m-n+1;
//        //lth node from start = nth node from end
                                    //2nd traversal
//        for (int i=1;i<=l-1;i++){     // l is the node but we want to iterate till l-1 index
//            temp=temp.next;
//        }
//        return temp;

        //2nd Approach -ONE TRAVERSAL
        Node slow=head;
        Node fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;

     }
     static Node deleteNthnodeFromLast(Node head,int n){
        Node fast=head;
        Node slow=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        if (fast==null){      //means n=size and fast and reached on null since 0 based indexing
            head=head.next;
            return head;
        }
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
     }
     static Node FindIntersection(Node head1,Node head2){
        Node temp1=head1;
        Node temp2=head2;
        int m=size(head1);   //or temp1
        int n=size(head2);
        if (m>n) {
            int l = m - n;
            for (int i = 1; i <= l; i++) {
                temp1 = temp1.next;
            }
        }else {
            int l = n-m;
            for (int i = 1; i <= l; i++) {
                temp2 = temp2.next;
            }
        }
        while (temp1!=temp2){
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;       //or temp2
     }
     static Node FindMiddleNode(Node head){
         Node fast=head;
         Node slow=head;
         while ( fast.next!=null && fast.next.next!=null){   //odd len case && even len case-->left middle if even len
             //( fast.next!=null && fast.next.next!=null)    odd len case && even len case-->right middle if even len
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow;
     }
     static Node DeleteMiddlenode(Node head){
         Node fast=head;
         Node slow=head;
         if (head.next==null) return null;        //single element LL
         while (fast.next.next!=null && fast.next.next.next!=null){   //even len case && odd len case- RIGHT middle case
          // (fast.next.next.next!=null && fast.next.next.next!.next=null) odd len && even len- if left middle deletion
             slow=slow.next;
             fast=fast.next.next;
         }
         slow.next=slow.next.next;
         return head;
     }
     static boolean Cycledetection(Node head){
         Node slow=head;
         Node fast =head;
         if (head==null) return false;
         if (head.next==null) return false;
         while (fast!=null){
             //if (slow==null) return false;
             slow=slow.next;
             if (fast.next==null) return false;         //MUST PUT CASE
             fast=fast.next.next;
             if (fast==slow) return true;
         }
         return false;
     }
     static Node CyclenodeReturn(Node head) {
         Node fast = head;
         Node slow = head;
         while (fast!=null){
             slow =slow.next;
             fast=fast.next.next;
             if (fast==slow)break;
         }
         Node temp=head;
         while (temp!=slow){
             slow=slow.next;
             temp=temp.next;
         }
         return slow;
     }
     static Node Merge(Node head1,Node head2){
         Node temp1=head1;
         Node temp2=head2;
         Node head3=new Node(100);
         Node temp3=head3;
         if (head1==null) return head2;
         if (head2==null) return head1;
         while(temp1!=null && temp2!=null) {
             if (temp1.data > temp2.data) {
                 Node a= new Node(temp2.data);
                 temp3.next=a;
                // temp3=a;
                 temp2 = temp2.next;
             } else {
                 Node a= new Node(temp1.data);
                 temp3.next =a;
                // temp3=a;    same as temp3 = temp3.next;
                 temp1 = temp1.next;
             }
             temp3 = temp3.next;
         }
         if (temp1==null){
             temp3.next=temp2;
         }else{
             temp3.next=temp1;
         }
         return head3.next;
     }
     static Node MergeWithoutExtraSPace (Node head1,Node head2){
         Node h1=head1;
         Node t1=h1;
         Node h2=head2;
         Node t2=h2;
         Node h=new Node(100);
         Node t=h;
         while (t1!=null && t2!=null){
             if (t1.data>t2.data){
                 t.next=t2;
                 t=t2;
                 t2=t2.next;
             }else{
                 t.next=t1;
                 t=t1;
                 t1=t1.next;
             }
         }
         if (t1==null){
             t.next=t2;
         }
         if (t2==null){
             t.next=t1;
         }
         return h.next;
     }
     static Node splitll(Node head){

         //VISIT THIS QUESTION AGAIN WRONG ANSWER

         Node temp=head;
         Node o=new Node(-1);
         Node tempo=o;
         Node e=new Node(0);
         Node tempe=e;
         while (temp!=null) {
             if (temp.data % 2 == 0) {
                 Node even = new Node(temp.data);
                 tempe.next = even;
                 temp = temp.next;
             } else {
                 Node odd = new Node(temp.data);
                 tempo.next = odd;
                 temp = temp.next;
             }
         }
         tempo.next=e.next;
         return o.next;

     }
     static Node duplicate(Node head){
         Node temp=head;
         while (temp!=null && temp.next!=null){
             if (temp.next.data==temp.data){
                 temp.next=temp.next.next;
             }
             if (temp.next==null) return head;
             if (temp.next.data!=temp.data){
                 temp=temp.next;
             }
         }
         return head;
     }
     static Node revereseLL(Node head){
         //base case
         if (head.next==null) return head;
         //recursion
         Node newhead=revereseLL(head.next);
         //self work
         head.next.next=head;
         head.next=null;
         return newhead;
     }
     static Node reverseIterative(Node head){
         Node curr=head;
         Node prev=null;
         Node agla=null;
         while (curr!=null){    //OR AGLA!=null
             agla=curr.next;
             curr.next=prev;
             prev=curr;
             curr=agla;
         }
         return prev;
     }
     static boolean palindromeLL(Node head){
         //step 1-find left middle of LL
         Node slow=head;
         Node fast=head;
         while (fast.next!=null && fast.next.next!=null){
             fast=fast.next.next;
             slow=slow.next;          //wherever slow would point at last would be the middle element
         }
         //step 2-reverse the ll after slow
         Node temp=reverseIterative(slow.next);
         slow.next=temp;
         //step 3- compare
         Node p1=head;
         Node p2=slow.next;
         while (p2!=null){
             if (p1.data!=p2.data) return false;
             p1=p1.next;
             p2=p2.next;
         }

         return true;
     }
     static int Twinsum(Node head){
         Node slow=head;
         Node fast=head;
         while (fast.next!=null && fast.next.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
         Node temp=reverseIterative(slow.next);
         slow.next=temp;
         Node p1=head;
         Node p2=slow.next;
         int max=0;
         while (p2!=null){
             int sum=p1.data+ p2.data;
             if (max<sum)      //don't put indentation{} after if
                 max = sum;
                 p1 = p1.next;
                 p2 = p2.next;
         }
         return max;
     }
     static Node OddEvenIndices(Node head){
         Node temp=head;
         Node o=new Node(0);
         Node tempo=o;
         Node e=new Node(0);
         Node tempe=e;
         while (temp!=null){
             tempo.next=temp;
             temp=temp.next;
             tempo=tempo.next;

             tempe.next=temp;
             if (temp==null) break;
             temp=temp.next;
             tempe=tempe.next;
         }
         o=o.next;
         e=e.next;
         tempo.next=e;
         return o;
     }
     static Node copyRandomList(Node head){
         // 7 13 11 10 1
         // n  7 1  11 7
         Node head2=new Node(0);
         Node temp2=head2;
         Node temp1=head;

         //step 1-creating deep copy  7 13 11 10 1
         while (temp1!=null){
             Node t = new Node(temp1.data);
             temp2.next=t;
             temp2=t;
         }
         head2=head2.next;
         temp2=head2;
         temp1=head;

         //step 2- alternatic connections
         Node temp=new Node(-1);
         while (temp1!=null){
             temp.next=temp1;
             temp1=temp1.next;
             temp=temp.next;

             temp.next=temp2;
             temp2=temp2.next;
             temp=temp.next;
         }
         temp2=head2;
         temp1=head;

         //step 3-assign random pointers
         while (temp1!=null){
             if (temp1.random==null) temp2.random=null;
             temp2.random= temp1.random.next;
             temp1=temp2.next;
             temp2=temp1.next;
         }
         temp2=head2;
         temp1=head;

         //step 4- seperating ll
         while (temp1!=null){
             temp1.next=temp2.next;
             temp1=temp1.next;
             if (temp1==null)break;
             temp2.next=temp1.next;
             if (temp2.next==null) break;
             temp2=temp2.next;
         }
         return head2;
     }




     public static void main(String[] args) {
//        Node a=new Node(16);
//        Node b=new Node(2);
//        Node c=new Node(35);
//        Node d=new Node(69);
//        Node e=new Node(18);
//        a.next=b;
//        b.next=c;
//        c.next=d;
//        d.next=e;
//Q1
//        deleteNode(c);   //deleting node c by giving c as the parameter
//        display(a);
//        deleteNode(e);         /this line will show error since our delete code is not for last node
//        display(a);
 //       System.out.println("size-"+size(a));   // initially 5 after deleting c 4

//Q2
       //16 2 35 69 18
//       Node n = nthLastnode(a,4);     //node b
//       System.out.println(n.data);       //2

//Q3    //16 2 35 69 18
        //change return type of function to void for below 2 lines to work
//        deleteNthnodeFromLast(a,3);   //16 2 69 18
//        display(a);

        //if n is passed as 5 then it means 1st node from start in that case head-'a' needs to be modified
        //therefore in the function return type is Node rather than void
//        a=deleteNthnodeFromLast(a,5);  //2 35 69 18
//        display(a);
//Q4
//        Node x=new Node(100);
//        Node y=new Node(13);
//        Node z=new Node(4);
//        Node j=new Node(5);
//        Node k=new Node(12);
//        Node l=new Node(10);
//        Node g=new Node(90);
//        Node h=new Node(9);
//        x.next=y;
//        y.next=z;
//        z.next=j;
//        j.next=k;
//        k.next=l;
//        //intersecting ll
//        g.next=h;
//        h.next=j;
//
//        Node I=FindIntersection(x,g);    //x is head of 1st ll and g is head of 2nd ll
//        System.out.println(I.data);

//Q5
//        Node x=new Node(100);
//        Node y=new Node(13);
//        Node z=new Node(4);
//        Node j=new Node(5);
//        Node k=new Node(12);
//        Node l=new Node(10);
//        x.next=y;
//        y.next=z;
//        z.next=j;
//        j.next=k;
//        k.next=l;
//        l.next=j;        //...for que 7 cycle case will give TRUE

//        Node m =FindMiddleNode(x);
//        System.out.println(m.data);
//
////Q6
//        Node D=DeleteMiddlenode(x);
//        display(D);
//Q7
//         System.out.println(Cycledetection(x));

//Q8
//         Node C= CyclenodeReturn(x);
//         System.out.println(C.data);     //5

//Q9     done in notebook
//Q10
//         Node a=new Node(100);  //a-->b
//         Node b=new Node(13);
//         Node c=new Node(4);    //c-->d
//         Node d=new Node(5);
//         b.next=a;    //since linked list should be sorted
//         c.next=d;
//         Node m =Merge(b,c);      //a-->b-->c-->d m is the pointer pointing at head of new ll this will help us to display the new LL
//         display(m);

//Q11
//         Node a=new Node(10);  //a-->b
//         Node b=new Node(13);
//         Node c=new Node(4);    //c-->d
//         Node d=new Node(5);
//         a.next=b;
//         c.next=d;
//         Node m =MergeWithoutExtraSPace(a,c);      //a-->b-->c-->d m is the pointer pointing at head of new ll this will help us to display the new LL
//         display(m);

//Q12
//        Node x=new Node(1);
//        Node y=new Node(130);
//        Node z=new Node(5);
//        Node j=new Node(72);
//        Node k=new Node(12);
//        Node l=new Node(13);
//        Node g=new Node(93);
//        Node h=new Node(9);
//        x.next=y;
//        y.next=z;
//        z.next=j;
//        j.next=k;
//        k.next=l;
//        l.next=g;
//        g.next=h;
//        Node s=splitll(x);
//        display(s);

//Q13
//         Node x=new Node(1);
//         Node y=new Node(1);
//         Node z=new Node(2);
//         Node j=new Node(2);
//         Node k=new Node(2);
//         Node l=new Node(3);
//         Node g=new Node(3);
//         Node h=new Node(4);
//         x.next=y;
//         y.next=z;
//         z.next=j;
//         j.next=k;
//         k.next=l;
//         l.next=g;
//         g.next=h;
//         Node D=duplicate(x);
//         display(x);

//Q14
//         Node a=new Node(10);  //a-->b
//         Node b=new Node(13);
//         Node c=new Node(4);    //c-->d
//         Node d=new Node(5);
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         Node r=revereseLL(a);
//         display(r);


//Q15

//         Node a=new Node(16);  //a-->b
//         Node b=new Node(15);
//         Node c=new Node(14);    //c-->d
//         Node d=new Node(13);
//         a.next=b;
//         b.next=c;
//         c.next=d;
//
//         Node I=reverseIterative(a);
//         display(I);

//Q16
//         Node a=new Node(1);  //a-->b
//         Node b=new Node(2);
//         Node c=new Node(2);    //c-->d
//         Node d=new Node(1);
//         a.next=b;
//         b.next=c;
//         c.next=d;
         //System.out.println(palindromeLL(a));

//Q17
//         Node a=new Node(4);  //a-->b
//         Node b=new Node(2);
//         Node c=new Node(9);    //c-->d
//         Node d=new Node(56);
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         System.out.println(Twinsum(a));

//Q18
        Node x=new Node(1);
        Node y=new Node(130);
        Node z=new Node(5);
        Node j=new Node(72);
        Node k=new Node(12);
        Node l=new Node(13);
        Node g=new Node(93);
        Node h=new Node(9);
        x.next=y;
        y.next=z;
        z.next=j;
        j.next=k;
        k.next=l;
        l.next=g;
        g.next=h;
        Node s=OddEvenIndices(x);
        display(x);                      //1 5 12 93 130 72 13 9

//Q19
         Node a=new Node(7);  //a-->b
         Node b=new Node(13);
         Node c=new Node(11);    //c-->d
         Node d=new Node(10);
         Node e=new Node(1);
         a.next=b;
         b.next=c;
         c.next=d;
         d.next=e;







     }
}
