//loops,break,continue
import java.util.Scanner;

public class lecture7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("printing sum 1 to n");
//        int n = sc.nextInt();
        //WHILE LOOP
//        int num=1;
//        int sum=0;
//        while (num<=n){
//            //System.out.println(num);
//            sum= sum +num;
//
//            num=num+1;//increment operator or num++
//
//        }
//        System.out.println(sum);


        //FOR LOOP
//        int sum=0;
        //       int num;
//        for (num=10;num<=n;num++){  //write int num= 10; when above it is not initialised
//            sum=sum+num;
//            System.out.println(num);
//        }
//        System.out.println("sum is-"+sum);

//        System.out.println("reversing the numbers starting from n ..what is n?");
//        int n = sc.nextInt();
//        for (int num=n;num>=0;num--){  //write int num= 10; when above it is not initialised
//
//            System.out.println(num);

//            System.out.println("reversing the numbers starting from n by 2 ..what is n?");
//            int n = sc.nextInt();
//            for (int num=n;num>=0;num-=2){  //write int num= 10; when above it is not initialised
//
//                System.out.println(num);

//                System.out.println("start from 5 with incrementing by 10");
//                int n = sc.nextInt();
//                for (int num=5;num<=n;num+=10){  //num*=3 or anything
//
//                    System.out.println(num);//}


        //DO-WHILE
//        int num = 1; //but will not show error if num>10
//        do {
//            System.out.println(num);
//            num++;
//
//        } while (num <= 10);
//        System.out.println("sum stream of numbers");
//        int num=sc.nextInt();
//        int sum=0;
//        while(num!=-1){
//            sum=sum+num;
//            num= sc.nextInt();
//
//        }
//        System.out.println(sum);
//  BREAK
//        System.out.println("printing first number divisible by 5 and 7");
//        int num =1;
//        while(true){
//            if (num%5==0 && num%7==0){
//                System.out.println("found ans  "+num);
//                break;
//            }
//            num++;


        //CONTINUE
        System.out.println("print all values btw 1-50 except multiple of 3");
//            for (int num=1;num<=50;num++){
//                if(num%3==0){
//                    continue;
//
//                }else {
//                    System.out.println(num);
//                }

        int num = 1;
        while (num <= 51) {
            if (num % 3 == 0) {
                num++;
                continue;

            } else {

                System.out.println(num);
                num++;

            }
        }

    }
}