//RECURSION
public class lecture29 {

    static int sumOfdigits(int n){
        //base case
        if (n==0 || n==1 || n==2 || n==3 || n==4 ||n==5 ||n==6 ||n==7 ||n==8 ||n==9 ){ //or-||
            return n;  //or make a for loop from 0 to 9
        }
        //subproblem and addition is selfwork
        return sumOfdigits(n/10)+ n%10;
    }
    static int countOfdigits(int n){
        //base case
        if (n==0 || n==1 || n==2 || n==3 || n==4 ||n==5 ||n==6 ||n==7 ||n==8 ||n==9 ){ //or-||
            return 1;  //or make a for loop from 0 to 9
        }
        //subproblem and addition is selfwork
        return countOfdigits(n/10)+ 1;
    }

    static int exponential(int p ,int q){
        if (q==0){
            return 1;
        }
        return exponential(p,q-1)*p;
    }

    public static void main(String[] args) {
        System.out.println(sumOfdigits(123456789));
        System.out.println(countOfdigits(5678));
        System.out.println(exponential(2,3));

    }
}
