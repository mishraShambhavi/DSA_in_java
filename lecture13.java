//class,method,block scope - pass by value and reference
class Algebraa{
    //CLASS LEVEL VARIABLE SCOPE
    int a =10; //memeber variable-can be accessed throughout the class-class level scope
    int b=5;
    int add(int a ,int b){
        int add=a+b;
        return add;
    }

    //METHOD LEVEL VARIABLE SCOPE
    int sum(){
        int p=2;
        int q=5;
        int sum=p+q;
        return sum;
    }
//    int subb(){
//        int subb=p-q;   //p and q are red since these are initialised in add method
//        //p and q are method level variable hence cannot be accessed outside method
//        return subb;
//    }
    int sub(){
        int sub=a-b;
        return sub;
    }
    int mul(){
        return a*b;
    }
    int div(){
        return a/b;
    }

//    BLOCK LEVEL VARIABLE SCOPE

    void block(){
        int x=4;
        System.out.println(x);
      //  System.out.println(y); //cannot access y since its in the block

        for (int i=0;i<=5;i++)
        {
            System.out.println(i);
            int y =10;
            System.out.println(y);  //10 would be printed
        }
      //  System.out.println(y);  //cannot access y since its in the block
        for (int i=0;i<=2;i++)   // we can use i again since its scope has changed
        {
            System.out.println(i);
            int y =100;
            System.out.println(y);  //100 would be printed
        }
    }
}
public class lecture13 {

    public static void main(String[] args) {
        Algebraa obj1 =new Algebraa();
        obj1.block();
        int ans=obj1.add(2,2);
        System.out.println(ans);
//        int a =10;
//        int a = 11;   //same scope cant have two variables of same name
//        double a=12;

    }
}
