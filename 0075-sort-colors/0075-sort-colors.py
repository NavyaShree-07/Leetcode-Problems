class Solution:
    def sortColors(self, nums: list[int]) -> None:
        c0=nums.count(0)
        c1=nums.count(1)
        for i in range(len(nums)):
            if i < c0:
                nums[i]=0
            elif i<c0+c1:
                nums[i]=1
            else:
                nums[i]=2