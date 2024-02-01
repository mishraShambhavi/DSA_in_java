public class lecture36 {
    static int frogJump(int[] height,int n,int idx){   //n=size
        //base case
        if (idx==n-1) return 0;
        //recursive work
        int opt1=frogJump(height,n,idx+1) + Math.abs(height[idx]-height[idx+1]);
        if (idx==n-2) return opt1;  //base case since we only have opt1 available to jump on
        int opt2=frogJump(height,n,idx+2)+Math.abs(height[idx]-height[idx+2]);
        //self work
        return Math.min(opt1,opt2);

    }

    static void keypadCombination(String s,String[] kp,String currAns){ //s=253-->kp[2]
        if (s.length()==0){
            System.out.println(currAns+" ");
            return;
        }
        int currNum=s.charAt(0)-'0';     //2
        String currChoices=kp[currNum]; //abc

        for (int i=0;i<currChoices.length();i++){
            keypadCombination(s.substring(1),kp,currAns+ currChoices.charAt(i));
        }
    }



    public static void main(String[] args) {
        int[] height={10,2,10,4,8};
        System.out.println(frogJump(height,height.length,0));

        String s ="253";
        //mapping array of strings -->
        String[] kp={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //index       0  1   2     3      4    5     6     7      8      9
        //we got till 9 indices thats why we used 2 empty elements so to access what number 7
        //has we can use kp[7] easily

        keypadCombination(s,kp,"");
    }
}
