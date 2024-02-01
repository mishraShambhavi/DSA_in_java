//constructor,access modifiers,methods,package
import java.util.Scanner;

class Algebra{
    int a;
    int b;

    Algebra(int x, int y){
        System.out.println("im a constructor");
        a=x;
        b=y;
    }
    int sum() {  //sum is method of algebra class thats why we create its object
        int sum = a + b;
        return sum;
    }
    int sub() {
        int sub = a - b;
        return sub;
    }

    int mul(){
        int mul=a*b;
        return mul;
    }
    int div(){
        int div=a/b;
        return div;
    }

}

public class methods12{  //methods12 is a class
    public static void main(String[] args) {
        Algebra obj=new Algebra(5,7);
//        Scanner sc=new Scanner(System.in);
//        int x =sc.nextInt();
//        int y = sc.nextInt();
        System.out.println("sum of all 4 operations is for object 1");
        int ans =obj.sum()+obj.sub()+obj.div()+ obj.mul();
        System.out.println(ans);

        Algebra obj2 = new Algebra(4,3);
        System.out.println("sum of all 4 operations is for object 2");
        int ans2 =obj2.sum()+obj2.sub()+obj2.div()+ obj2.mul();
        System.out.println(ans2);


//        System.out.println(Math.sqrt(24));   //all these gives double ans-decimal
//        System.out.println(Math.sqrt(16));
//        System.out.println(Math.floor(5.3)); //just small integer
//        System.out.println(Math.ceil(5.8)); //just big integer
    }

}
//public class methods {

//    static void welcome(){   //static=non access modifier
//        //static lets us access welcome method without creating object
//        //otherwise we need to create object and do object.welcome()
//        System.out.println("hi we are learning methods you are welcomed");
//    }
//
//    public static void main(String[] args) {
//        welcome();
//        }


//}
