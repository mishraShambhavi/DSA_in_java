//GCD
public class lecture31 {

    static void GCDbruteForce(int x,int y){
        int gcd=1;
        for (int i=x;i>=1;i--) {
            for (int j = y; j >= 1; j--) {
                if (x % i == 0 && y % j == 0 &&i == j) {
                    gcd = i;
                    System.out.println(gcd);
                    return; // remove it to find all divisors
                }
            }
        }
    }
    static int gcdLONGdivision(int x, int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        System.out.println(y);
        return y;
    }
    static int GCDrecursion(int x, int y){
        if (y==0){
            return x;
        }
        return GCDrecursion(y,x%y);

    }
    public static void main(String[] args) {
        GCDbruteForce(15,5);
        gcdLONGdivision(24,30);
        System.out.println(GCDrecursion(24,15));

    }
}
