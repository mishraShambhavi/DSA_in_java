import java.util.Scanner;

public class lecture34 {
    static String RemoveviaIteration(String a){
        String ans="";

        for (int i=0;i>=a.length();i++){
            if (a.charAt(i)!='a'){
                ans+=a.charAt(i);
            }
        }
        System.out.println(ans);
        return ans;

    }

    static String RemoveviaRecursion(String a, int idx) {
        //base case
        if (idx == a.length()) return "";

        //smaller prob
        String smallans = RemoveviaRecursion(a, idx + 1);

        //selfwork
        if (a.charAt(idx) == 'e') {
            return smallans;
        }else
            return a.charAt(idx) + smallans;


        //if the question is do this que via recursion but dont use index concept for iteration ...
        //we then use SUBSTRING concept
        //bigger problem mai just pass string
        //in smaller prob f(a.substring(beginIndex:1)
        //selfwork and base mai replace idx with 0
    }

    static String ReverseString(String a,int idx){
        //base case
        if (idx==a.length()) return "";
        //smaller problem/recursive work
        String smallans=ReverseString(a,idx+1);
        //slf work
        String ans= smallans+a.charAt(idx);
        return ans;
    }
    static void PalindromeString(String a,int idx){
        String ans=ReverseString(a,0);
        if (ans.equals(a)){     //if i use == operetor we dont get correct ans
            System.out.println("yes it is a palindrome string");
        }else
        { System.out.println("no not a palindrome string");
        }
    }

    static boolean PalindromewithoutReverse(String a,int l,int r){
        //base case
        if (l>=r) return true;
        //selfwork && recursive work
        return a.charAt(l)==a.charAt(r) && PalindromewithoutReverse(a,l+1,r-1);
    }

    
    public static void main(String[] args) {
        //STRINGS

//        Scanner sc= new Scanner(System.in);
//        System.out.println("what will be your string");
//        String s=sc.nextLine();
//        System.out.println(s);
//        char ch=s.charAt(1);
//        System.out.println(ch);
        //0 based indexing
        //length here is not aproperty rather a method
        //traversing in strings
//        for (int i=0;i<s.length();i++){
//            System.out.println(s.charAt(i));
//        }
//        System.out.println(s.substring(2,4));   //2 is inclusive and 4 is exclusive
//        //2 se 4-1 tak index elements print honge
//        //-1 invalid
//        //we can give only begin index only also (2)..2 se last tak will be printed

        String a="level";

        RemoveviaIteration(a);
        System.out.println(RemoveviaRecursion(a,0));
        System.out.println(ReverseString(a,0));
        PalindromeString(a,0);
        System.out.println(PalindromewithoutReverse(a,0,a.length()-1));


    }
}
