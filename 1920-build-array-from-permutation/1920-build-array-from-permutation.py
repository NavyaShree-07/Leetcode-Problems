class Solution:
    def buildArray(self, nums):
        arr=[]
        for i in range(len(nums)):
            arr.append(nums[nums[i]])
        return arr