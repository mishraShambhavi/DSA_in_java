//RECURSION
public class lecture30 {

    static void multiples(int n,int k){ //5 ,4
        if (k==1){
            System.out.println(n); //5
            return ;
        }
        multiples(n,k-1); // 5,10,15
        System.out.println(n*k); //20
    }
    static int Series(int n){
        if(n==0){
            return 0;
        }
        int x=Series(n-1);
        int ans=0;
        if (n%2==0){
            ans=x-n;
        }
        if (n%2!=0){
            ans=x+n;
        }
        System.out.println(ans);
        return ans;

    }

    public static void main(String[] args) {
        //multiples(24,5);
        Series(3);

    }
}
