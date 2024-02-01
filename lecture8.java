//questions
 import java.util.Scanner;

public class lecture8 {
    public static void main(String[] args) {
//        System.out.println("count digits in a number");
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int originaln =n;
//        int count=0;
//        while(n>0){
//            n=n/10;
//            count=count+1;
//        }
//        System.out.println("the number of digits in  " +originaln+"="+count);

//        System.out.println("give me a number ill add the digits and give u the answer");
//        int n =sc.nextInt();
//        int sum=0;
//        int a;
//        while(n>0){
//            a=n%10;
//            n=n/10;
//
//            sum=sum+a;
//        }
//        System.out.println(sum);

//        System.out.println("i will reverse the digits");
//        int n = sc.nextInt();
//        int ans=0;
//        int a;
//        while(n>0){
//            a=n%10;
//           ans=ans*10+ a;
//           n=n/10;
//        }
//        System.out.println(ans);

//        System.out.println("S=1-2+3-4....N ? WHAT IS N FOR WHICH U WANNA CALCULATE");
//        int n = sc.nextInt();
//        int ans=0;
//        for ( int i=1;i<=n;i++){
//            if(i%2==0) {
//                ans -= i;
//            }
//            else{
//                ans+=i;
//                }
//
//
//        }
//        System.out.println("your ans for this series is "+ans);

//        System.out.println("first n factorial");
//        int n = sc.nextInt();
//        int factorial=1;
//        for (int i=n;i>1;i--){
//            factorial*=i;
//
//        }
//        System.out.println("the factorial is"+factorial);

        System.out.println("a^b?");
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        int ans =1;
//        int ans= a^b;
        for (int i=1;i<=b;i++){
            ans*=a;

        }

        System.out.println(ans);

    }
}
