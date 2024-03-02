//strings
import java.util.*;
public class lecture49 {
    static boolean isPalindrome(String s){
      //  2 pointers approach
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if (s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        //Q-1
//        String s="abcd";
//        for (int i=0;i<=s.length()-1;i++) {
//            for (int j = i+1; j <= s.length();j++) {
//                System.out.println(s.substring(i,j));
//            }
//        }


//        //Q-2 in StringBuilder
//        Scanner sc=new Scanner(System.in);
//        StringBuilder sb=new StringBuilder(sc.nextLine());
//        for (int i=0;i<sb.length();i++){
//            //toggle
//            //check char is uppercase or lowercase
//            boolean flag=true;   //true-->uppercase (A starts from 65)
//            char ch = sb.charAt(i);
//            if (ch==' ') continue;   //otherwise - sn dsa-->SN@DSA
//            int asci=(int)ch;     //typecasting of ch to ascii if ch =A--> asci=65
//            if (asci>=97) flag=false;      //means value is lowercase and flag is changed to false
//            if (flag==true){               //means char is uppercase so change it to lowercase by adding 32--a
//                asci+=32;
//                char dh =(char)asci;       //typecasting asci into char-->a
//                sb.setCharAt(i,dh);        //replacing in original string
//            }else {
//                asci-=32;               //means flag-false-lowercase so change lowercase value to capital 97-32=65->A
//                char dh =(char)asci;       //typecasting asci into char-->a
//                sb.setCharAt(i,dh);
//            }
//        }
//        System.out.println(sb);

        //Q-2 in Strings
//        String str="CodIng";
//        for (int i=0;i<str.length();i++){
//            //toggle
//            //check char is uppercase or lowercase
//            boolean flag=true;   //true-->uppercase (A starts from 65)
//            char ch = str.charAt(i);
//            if (ch==' ') continue;   //otherwise - sn dsa-->SN@DSA
//            int asci=(int)ch;     //typecasting of ch to ascii if ch =A--> asci=65
//            if (asci>=97) flag=false;      //means value is lowercase and flag is changed to false
//            if (flag==true){               //means char is uppercase so change it to lowercase by adding 32--a
//                asci+=32;
//                char dh =(char)asci;       //typecasting asci into char-->a
//                str=str.substring(0,i)+dh+str.substring(i+1);       //replacing in original string
//            }else {
//                asci-=32;               //means flag-false-lowercase so change lowercase value to capital 97-32=65->A
//                char dh =(char)asci;       //typecasting asci into char-->a
//                str=str.substring(0,i)+dh+str.substring(i+1);
//            }
//        }
//        System.out.println(str);

        //Q-3
        //easy way to check palindrome string
        String str="a121a2";
//        StringBuilder gtr=new StringBuilder(str);
//        gtr.reverse();
//        String s= gtr+"";
//        if (str.equals(s)){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("not palindrome");
//        }
//
//        //2 pointers approach
//        int i=0;
//        int j=str.length()-1;
//        while(i<=j){
//            if (str.charAt(i)==str.charAt(j)){
//                i++;
//                j--;
//            }else{
//                System.out.println("no");
//                return;
//            }
//        }
//        System.out.println("yes");

//        //now acc-to question
//        String s="abba";
//        String s1="";
//        int count=0;
//        for (int i=0;i<=s.length()-1;i++) {
//            for (int j = i+1; j <= s.length();j++) {
//                 if (isPalindrome(s.substring(i, j))==true){
//                     System.out.print(s.substring(i,j)+" ");
//                     count++;
//                 }
//            }
//        }
//        System.out.println("\nno of PS-"+count);

//        //Q-4
//        String s="i am shambhavi you are pretty";
//        StringBuilder sb=new StringBuilder("");
//        String ans="";
//        for (int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if (ch!=' '){
//                sb.append(ch);
//            }else {
//                sb.reverse();
//                ans+=sb;
//                ans=ans+" ";
//                sb.delete(0,sb.length());
//            }
//        }
//        System.out.println(ans+sb.reverse());  //as our last word doesnt get added and it remains in sb


        //Q-5
        String s="aaaaabcccddd";
        String ans="" + s.charAt(0);    //ans=a
        int count=1;                  //ek char toh hai abhi ans mai
        for (int i=1;i<s.length();i++){
            char curr=s.charAt(i);
            char prev=s.charAt(i-1);
            if (curr==prev){
                count++;      //starts from 1
            }else{
                if (count>1) {
                    ans += count;
                    count = 1;      // initialising count for next symbol  i is at b and we will move forward
                    ans += curr;
                }//curr=b
            }
        }
        if (count>1) ans+=count;          //iss ke bina last element -d ke liye count ni aara tha as else condition does not happen as string gets over
        System.out.println(ans);


    }
}
