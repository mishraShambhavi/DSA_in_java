//scanner class input taking
import java.util.Scanner;
public class lecture4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter 1st number");
        int num1= sc.nextInt();
        System.out.println("please enter 2st number");
        int num2= sc.nextInt();
        System.out.println("please enter 3st number");
        int num3= sc.nextInt();
        System.out.println("please enter 4st number");
        int num4= sc.nextInt();
        int solution = num1+num2-num3*num4;
        System.out.println("your solution is-");
        System.out.println(solution);


        System.out.println("enter name");
        String name= sc.nextLine();
        System.out.println("hi " +name); // this takes only first word as input


        System.out.println("whats your advice for today?");
        String sentence = sc.nextLine(); // both 20-25 should be next() or nextLine()
        System.out.println(sentence  + name +"  ,thats a wonderful advice to remember");



        System.out.println("enter string for which you want to derive 3rd character");
        char ch =sc.next().charAt(3);
        System.out.println("3rd character is-:"+ch);
    }
}
