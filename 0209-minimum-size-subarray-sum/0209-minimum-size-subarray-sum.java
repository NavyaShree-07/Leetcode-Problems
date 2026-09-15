class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int st=0;
        int end=0;
        int sums=nums[0];
        int res_len=Integer.MAX_VALUE;
        while (true) {
            if (sums<target) {
                end++;
                if (end==nums.length)
                    break;
                sums=sums+nums[end];
            }
            else {
                int len=end-st+1;
                if (len<res_len)
                    res_len=len;
                sums=sums-nums[st];
                st++;
            }
        }
        if (res_len==Integer.MAX_VALUE)
            return 0;
        return res_len;
    }
}