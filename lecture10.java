//binary and decimal number system
import java.util.Scanner;

public class lecture10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //binary to decimal
        int binary_num= sc.nextInt();
        int ans=0; //converted decimal number
        int pw=1; //2^0=1
        while (binary_num>0){
            int unit_digit=binary_num%10;
            ans+= unit_digit * pw;
            binary_num/=10;
            pw*=2;


        }
        System.out.println(ans);

        //decimal to binary
        int decimal_num= sc.nextInt();
        int ans2=0; //binary number
        int pwr=1;  //power of 10
        while (decimal_num>0){
            int parity = decimal_num%2;
            ans2+=(parity*pwr);
            pwr*=10;
            decimal_num/=2;
        }
        System.out.println(ans2);




    }
}
