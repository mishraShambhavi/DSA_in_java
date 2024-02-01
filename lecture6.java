//if-else, switch,conditional
import java.util.Scanner;

public class lecture6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("choose any number ranging from 1 - 10^6");
//        int a=sc.nextInt();
//        if(a%2==0){
//            System.out.println("its even");
//        }
//        else{
//            System.out.println("its odd");
//        }
//
//        System.out.println("lets check in which age group you belong to-");
//        System.out.println("enter age");
//        int age = sc.nextInt();
//
//        if (age<12) {
//            System.out.println("you should play you are still a child");
//        } else if (age>=12 && age<=18) {
//            System.out.println("adolescent get a holdn of your hormones");
//        }
//        else {
//            System.out.println("adults should take responsibility");
//        }
        //TERNARY CONDITIONAL
//        String ans;
//        ans= (a%2==0) ?"its even":"its odd";
//        System.out.println(ans);
//
//        System.out.println("i want a number that is even and divisible by 3");
//        int pro = sc.nextInt();
//        if(pro%2==0  && pro%3==0){
//            System.out.println("yes it is a valid number adhering to the argument");
//        }
//        else{
//            System.out.println("oops try again");
//        }

//        if(pro%5==0 ||  pro%3==0){
//            System.out.println("yes it is a valid number adhering to the argument");
//        }
//        else{
//            System.out.println("oops try again");
//        }

        //SWITCH CASE
        System.out.println("enter day based on number");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("not applicable");

        }

//    }
    }
}
