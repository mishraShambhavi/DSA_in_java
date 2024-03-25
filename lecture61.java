import java.util.HashMap;

public class lecture61 {
    static HashMap<Character,Integer> makefreqMap(String str){
        HashMap<Character,Integer> mp=new HashMap<>();
        for (int i=0;i<str.length();i++) {
            if (mp.containsKey(str.charAt(i)) == false) {
                mp.put(str.charAt(i),1);   //insert
            }else {
                int prevValue=mp.get(str.charAt(i));
                mp.put(str.charAt(i),prevValue+1);   //update
            }
        }
        return mp;
    }
    static boolean isAnagram(String s,String t){
        if (s.length()!=t.length()) return false;
        HashMap<Character,Integer> mp1=makefreqMap(s);
        HashMap<Character,Integer> mp2=makefreqMap(t);
        return mp1.equals(mp2);
    }
    static boolean isIsomorphic(String s,String t){
        //tc=n^2..if we use hash set it becomes n
        HashMap<Character,Character> mp=new HashMap<>();
        for (int i=0;i<s.length();i++) {
            if (mp.containsKey(s.charAt(i))) {
                if (t.charAt(i) != mp.get(s.charAt(i))) return false;
            } else if (mp.containsValue(t.charAt(i))) {  //contain value time complexity is linear
                return false;
            } else {
                mp.put(s.charAt(i), t.charAt(i));
            }
        }
        return true;
    }
    static int[] twoSum(int[] arr,int target){
        int n= arr.length;
        int[] ans={-1};
        HashMap<Integer,Integer> mp=new HashMap<>();
        for (int i=0;i<n;i++){
            int partner=target-arr[i];
            if (mp.containsKey(partner)){
                ans=new int[]{i,mp.get(partner)};
                return ans;
            }else {
                mp.put(arr[i], i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";
        System.out.println(isAnagram(s1,s2));

        String s3="ddch";
        String s4="xxjj";
        System.out.println(isIsomorphic(s3,s4));

        int[] arr={1,5,7,-1};
        int[] ans=twoSum(arr,6);
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }


    }
}
