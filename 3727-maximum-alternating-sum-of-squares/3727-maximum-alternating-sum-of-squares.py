
class Solution:
    def maxAlternatingSum(self, nums: List[int]) -> int:
        nums.sort(key=abs)
        n=len(nums)
        k=(n+1)//2
        s=0
        for i in range(n-k):
            s-=nums[i]**2
        for i in range(n-k,n):
            s+=nums[i]**2            
        return s
