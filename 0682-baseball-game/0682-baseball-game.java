class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int i;
        for(i=0;i<operations.length;i++)
        {
            String curr= operations[i];
            char f_ch=curr.charAt(0);
            if(f_ch=='C')
            {
                stack.pop();
            }
            else if(f_ch=='D')
            {
                int prev=stack.peek();
                stack.push(prev*2);
            }
            else if(f_ch=='+'&&curr.length()==1){
                int v1=stack.pop();
                int v2=stack.pop();
                int sum=v1+v2;
                stack.push(v2);
                stack.push(v1);
                stack.push(sum);
            }
            else{
                int val=Integer.parseInt(curr);
                stack.push(val);
            }
        }
        int res=0;
        while(stack.isEmpty()==false)
        {
            res=res+stack.pop();
        }
        return res;
    }
}
