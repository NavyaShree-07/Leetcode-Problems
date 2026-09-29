class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack= new Stack<>();
        int ind;
        for(ind=0;ind<tokens.length;ind++){
            String curr=tokens[ind];
            char first_ch=curr.charAt(0);
            if(curr.length()==1&&first_ch=='+'){
                int val1=stack.pop();
                int val2=stack.pop();
                int res=val2+val1;
                stack.push(res);
            }
            else if(curr.length()==1&&first_ch=='-'){
                int val1=stack.pop();
                int val2=stack.pop();
                int res=val2-val1;
                stack.push(res);
            }
            else if(curr.length()==1&&first_ch=='*'){
                int val1=stack.pop();
                int val2=stack.pop();
                int res=val2*val1;
                stack.push(res);
            }
            else if(curr.length()==1&&first_ch=='/'){
                int val1=stack.pop();
                int val2=stack.pop();
                int res=val2/val1;
                stack.push(res);
            }
            else{
                stack.push(Integer.parseInt(curr));
            }
        }
        return stack.pop();
    }
}
