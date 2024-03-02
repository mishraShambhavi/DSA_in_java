import java.util.Stack;

public class lecture56 {
    public static void main(String[] args) {
        //infix
//        String str = "9-(5+3)*4/6";
//        Stack<Integer> val = new Stack<>();
//        Stack<Integer> op = new Stack<>();
//        for (int i = 0; i < str.length();i++){
//            char ch=str.charAt(i);
//            //now we want to know if the char ch is num or operator
//            int asci=(int)ch;     //'0'-->48 and '9'-->57
//            if (asci>=48 && asci<=57)val.push(asci-48); //num
//            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push((int)ch);  //operator
//            else if (ch==')') {
//                while (op.peek()!='('){
//                    int v2=val.pop();
//                    int v1=val.pop();
//                    if (op.peek()=='-') val.push(v1-v2);
//                    if (op.peek()=='+') val.push(v1+v2);
//                    if (op.peek()=='/') val.push(v1/v2);
//                    if (op.peek()=='*') val.push(v1*v2);
//                    op.pop();
//                }
//                op.pop();
//
//            } else{
//                if (ch=='+' || ch=='-'){
//                    //work
//                    int v2=val.pop();
//                    int v1=val.pop();
//                    if (op.peek()=='-') val.push(v1-v2);
//                    if (op.peek()=='+') val.push(v1+v2);
//                    if (op.peek()=='/') val.push(v1/v2);
//                    if (op.peek()=='*') val.push(v1*v2);
//                    op.pop();
//                    op.push((int)ch);
//                }
//                if (ch=='*' || ch=='/'){
//                    if (op.peek()=='*' || op.peek()=='/'){
//                        //work
//                        int v2=val.pop();
//                        int v1=val.pop();
//                        if (op.peek()=='*') val.push(v1*v2);
//                        if (op.peek()=='/') val.push(v1/v2);
//                        op.pop();
//                        op.push((int)ch);
//                    }else op.push((int)ch); //if peek pe -.+ hai so push ch
//                }
//            }
//        }
//        while (val.size()>1){
//            int v2=val.pop();
//            int v1=val.pop();
//            if (op.peek()=='-') val.push(v1-v2);
//            if (op.peek()=='+') val.push(v1+v2);
//            if (op.peek()=='/') val.push(v1/v2);
//            if (op.peek()=='*') val.push(v1*v2);
//            op.pop();
//        }
//        System.out.println(val.peek());
//
//

        //INFIX TO PREFIX
//        String infix = "9-(5+3)*4/6";
//        Stack<String> val = new Stack<>();
//        Stack<Character> op = new Stack<>();
//        for (int i = 0; i < infix.length();i++){
//            char ch=infix.charAt(i);
//            //now we want to know if the char ch is num or operator
//            int asci=(int)ch;     //'0'-->48 and '9'-->57
//            if (asci>=48 && asci<=57){
//                String s=""+ch;
//                val.push(s);
//            }
//            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);  //operator
//            else if (ch==')') {
//                //work
//                while (op.peek()!='('){
//                    String v2=val.pop();
//                    String v1=val.pop();
//                    String o = ""+op.pop();
//                    String t=o+v1+v2;
//                    val.push(t);
//                }
//                op.pop();
//
//            } else{
//                if (ch=='+' || ch=='-'){
//                    //work
//                    String v2=val.pop();
//                    String v1=val.pop();
//                    String o = ""+op.pop();
//                    String t=o+v1+v2;
//                    val.push(t);
//                    op.push(ch);
//                }
//                if (ch=='*' || ch=='/'){
//                    if (op.peek()=='*' || op.peek()=='/'){
//                        //work
//                        String v2=val.pop();
//                        String v1=val.pop();
//                        String o = ""+op.pop();
//                        String t=o+v1+v2;
//                        val.push(t);
//                        op.push(ch);
//                    }else op.push(ch); //if peek pe -.+ hai so push ch
//                }
//            }
//        }
//        while (val.size()>1){
//            String v2=val.pop();
//            String v1=val.pop();
//            String o = ""+op.pop();
//            String t=o+v1+v2;
//            val.push(t);
//        }
//        System.out.println(val.peek());



        //INFIX TO POSTFIX
//        String infix = "9-(5+3)*4/6";
//        Stack<String> val = new Stack<>();
//        Stack<Character> op = new Stack<>();
//        for (int i = 0; i < infix.length();i++){
//            char ch=infix.charAt(i);
//            //now we want to know if the char ch is num or operator
//            int asci=(int)ch;     //'0'-->48 and '9'-->57
//            if (asci>=48 && asci<=57){  //num
//                //ch is seen as a string
//                String s=""+ch;
//                val.push(s);
//            }
//            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);  //operator
//            else if (ch==')') {
//                //work
//                while (op.peek()!='('){
//                    String v2=val.pop();
//                    String v1=val.pop();
//                    String o = ""+op.pop();
//                    String t=v1+v2+o;;
//                    val.push(t);
//                }
//                op.pop();
//
//            } else{
//                if (ch=='+' || ch=='-'){
//                    //work
//                    String v2=val.pop();
//                    String v1=val.pop();
//                    String o = ""+op.pop();
//                    String t=v1+v2+o;;
//                    val.push(t);
//                    op.push(ch);
//                }
//                if (ch=='*' || ch=='/'){
//                    if (op.peek()=='*' || op.peek()=='/'){
//                        //work
//                        String v2=val.pop();
//                        String v1=val.pop();
//                        String o = ""+op.pop();
//                        String t=v1+v2+o;;
//                        val.push(t);
//                        op.push(ch);
//                    }else op.push(ch); //if peek pe -.+ hai so push ch
//                }
//            }
//        }
//        while (val.size()>1){
//            String v2=val.pop();
//            String v1=val.pop();
//            String o = ""+op.pop();
//            String t=v1+v2+o;
//            val.push(t);
//        }
//        System.out.println(val.peek());

        //POSTFIX EVALUATION
//        String str="953+4*6/-";
//        Stack<Integer> val=new Stack<>();
//        for (int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            int asci=(int)ch;
//            if (asci>=48 && asci<=57) val.push(asci-48);
//            else{
//                int v2=val.pop();
//                int v1=val.pop();
//                if (ch=='-')val.push(v1-v2);
//                if (ch=='+')val.push(v1+v2);
//                if (ch=='/')val.push(v1/v2);
//                if (ch=='*')val.push(v1*v2);
//            }
//        }
//        System.out.println(val.peek());

        //PREFIX EVALUATION
//        String str="-9/*+5346";
//        Stack<Integer> val=new Stack<>();
//        for (int i=str.length()-1;i>=0;i--){
//            char ch=str.charAt(i);
//            int asci=(int)ch;
//            if (asci>=48 && asci<=57) val.push(asci-48);
//            else{
//                int v1=val.pop();
//                int v2=val.pop();
//                if (ch=='-')val.push(v1-v2);
//                if (ch=='+')val.push(v1+v2);
//                if (ch=='/')val.push(v1/v2);
//                if (ch=='*')val.push(v1*v2);
//            }
//        }
//        System.out.println(val.peek());

        //PREFIX TO POSTFIX
//        String str="-9/*+5346";
//        Stack<String> val=new Stack<>();
//        for (int i=str.length()-1;i>=0;i--) {
//            char ch = str.charAt(i);
//            int asci = (int) ch;
//            if (asci >= 48 && asci <= 57) {
//                String s = "" + ch;
//                val.push(s);
//            } else {
//                String v1 = val.pop();
//                String v2 = val.pop();
//                String o = "" + ch;
//                String t = v1 + v2 + o;
//                val.push(t);
//            }
//        }
//        System.out.println(val.peek());

        //POSTFIX TO PREFIX
//        String str="953+4*6/-";
//        Stack<String> val=new Stack<>();
//        for (int i=0;i<str.length();i++) {
//            char ch = str.charAt(i);
//            int asci = (int) ch;
//            if (asci >= 48 && asci <= 57) {
//                String s = "" + ch;
//                val.push(s);
//            } else {
//                String v1 = val.pop();
//                String v2 = val.pop();
//                String o = "" + ch;
//                String t = o+v2 + v1 ;
//                val.push(t);
//            }
//        }
//        System.out.println(val.peek());

        //POSTFIX TO INFIX
//        String str="953+4*6/-";
//        Stack<String> val=new Stack<>();
//        for (int i=0;i<str.length();i++) {
//            char ch = str.charAt(i);
//            int asci = (int) ch;
//            if (asci >= 48 && asci <= 57) {
//                String s = "" + ch;
//                val.push(s);
//            } else {
//                String v1 = val.pop();
//                String v2 = val.pop();
//                String o = "" + ch;
//                String t = (v2+o+v1) ;
//                val.push(t);
//            }
//        }
//        System.out.println(val.peek());

        //PREFIX TO INFIX
//        String str="-9/*+5346";
//        Stack<String> val=new Stack<>();
//        for (int i=str.length()-1;i>=0;i--) {
//            char ch = str.charAt(i);
//            int asci = (int) ch;
//            if (asci >= 48 && asci <= 57) {
//                String s = "" + ch;
//                val.push(s);
//            } else {
//                String v1 = val.pop();
//                String v2 = val.pop();
//                String o = "" + ch;
//                String t = ("("+v1+o+v2+")") ;
//                val.push(t);
//            }
//        }
//        System.out.println(val.peek());

        //CELEBRITY PROBLEM
//        int[][] M={{0,1,0},{0,0,0},{0,1,0}};
//        Stack<Integer> st=new Stack<>();
//        for (int i=0;i<M.length;i++){
//            st.push(i);
//        }
//        while (st.size()>1){
//            int v1=st.pop();
//            int v2 =st.pop();
//            if (M[v1][v2]==0)st.push(v1);
//            else if (M[v2][v1]==0)st.push(v2);
//        }
//        if (st.size()==0) System.out.println("not found");
//        //now only contidition left is size==1
//        int potential=st.pop();
//        for (int j=0;j<M.length;j++){
//            if (M[potential][j]==1) return;
//        }
//        for (int i=0;i<M.length;i++){
//            if (i==potential) continue;
//            if (M[i][potential]==0)return;
//        }
//        System.out.println(potential);

        //SLIDING WINDOW PROBLEM
        //approach 1 T(n^2)
//        int k=3;
//        int[] que={1,2,-1,-3,5,3,6,7};
//        int n= que.length;
//        int[] ans=new int[n-k+1];
//        int z=0;   //z iterates over ans array
//        for (int i=0;i<n-k+1;i++){
//            int max=Integer.MIN_VALUE;
//            for (int j=i;j<i+k;j++){
//                max=Math.max(max,que[j]);
//            }
//            ans[z]=max;
//            z++;
//        }
//        for (int i=0;i<ans.length;i++){
//            System.out.print(ans[i]+" ");
//        }

        //approach 2 T(n)
        int k=3;
        int[] que={1,2,-1,-3,5,3,6,7};
        int n= que.length;
        int[] ans=new int[n-k+1];
        int z=0;
        Stack<Integer> st=new Stack<>();
        int[] nge=new int[n];
        st.push(n-1);  //push last element index
        nge[n-1]=n;
        for (int i=que.length-2;i>=0;i--){
            while(st.size()>0 && que[st.peek()]<que[i]){
                st.pop();
            }
            if (st.size()==0) nge[i]=n;
            else nge[i]=st.peek();
            st.push(i);
        }
        int j=0;
        for (int i=0;i<n-k+1;i++){
            if (j>=i+k) j=i;
            int max=que[j];
            while (j<i+k){
                max=que[j];
                j=nge[j];
            }
            ans[z++]=max;
        }
        for (int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
