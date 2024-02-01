//ARRAYLIST
import java.util.ArrayList;
import java.util.Collections;
public class lecture24 {

    static void reverseList(ArrayList<Integer> LIST){
        int i=0,j=LIST.size()-1;
        while (i<j){
            /*
             int temp=a
             a=b
             b=temp
             */
            Integer temp = Integer.valueOf(LIST.get(i));
            LIST.set(i, LIST.get(j));
            LIST.set(j,temp);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        //wrapper classes

            //Integer i=new Integer(3); - wont work
        //or
        Integer j =Integer.valueOf(4);
        System.out.println(j);
        Float f=Float.valueOf(7.89f);
        System.out.println(f);
        ArrayList<Integer> l1 = new ArrayList<>();
//        ArrayList<Boolean> l2=new ArrayList<>();
//        ArrayList<Float> L3= new ArrayList<>();

        // add an element - at the end
        l1.add(4);  //4
        l1.add(3);  //4 3
        l1.add(2);  //4 3 2
        l1.add(1);
        l1.add(5);
        l1.add(8);

        // add an element at some index
        l1.add(2,22);
        System.out.println(l1);

        // get an element at index i
        System.out.println(l1.get(2));

        // print the elements
        for (int i=0;i<l1.size();i++){
            System.out.print(l1.get(i)+" ");
        }
        System.out.println();
        //OR
        System.out.println(l1);

        // modifying an element at index i
        l1.set(4,66);
        System.out.println(l1);

        //removing element at index
        l1.remove(3);
        System.out.println(l1);

        //removing element e
        l1.remove(Integer.valueOf(3));
        System.out.println(l1);
        l1.remove(Integer.valueOf(98));
        System.out.println(l1);   //no error
        System.out.println(l1.remove(Integer.valueOf(7)));  //false or true


        //checking if an element exists
        System.out.println(l1.contains(22));


        //if you dont specify class , you can put anything inside l
        ArrayList l =new ArrayList();
        l.add(4);  //4
        l.add("hi");  //4 3
        l.add(2);  //4 3 2
        l.add("shambhavi");
        l.add(4.6f);
        l.add(true);
        System.out.println(l);

        //QUESTIONS
        //reverse a given arraylist
        ArrayList<Integer> L=new ArrayList<>();
        L.add(2);
        L.add(3);
        L.add(4);
        L.add(5);
        //below loop only prints but if we want to originally store in reversed form go to method
//        for (int i=L.size()-1;i>=0;i--){
//            System.out.print(L.get(i)+" ");
//        }
        System.out.println("original list"+ L);
        Collections.reverse(L);  //IN BUILT IN COLLECTIONS PACKAGE IMPOTED ABOVE
        //OR- USE METHOD :-
        //reverseList(L);
        System.out.println("reversed list"+L);

        // program to sort an arraylist of strings in descending order
        Collections.sort(L);
        System.out.println("Ascending order-"+L);
        Collections.sort(L,Collections.reverseOrder());
        System.out.println(L);
        Collections.reverse(L);
        System.out.println(L);// ORIGINAL LIST

        ArrayList<String> s=new ArrayList<>();
        s.add("welcome");
        s.add("to");
        s.add("another");
        s.add("lecture");
        s.add("of dsa");
        System.out.println("intro-"+s);
        Collections.sort(s);
        System.out.println("sorted-"+s);
        Collections.reverse(s);
        System.out.println(s);






    }
}
