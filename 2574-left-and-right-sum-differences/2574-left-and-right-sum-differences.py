class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:
        res=[]
        for i in range(len(nums)):
            l=sum(nums[:i])
            r=sum(nums[i+1:])
            res.append(abs(l-r))
        return res
