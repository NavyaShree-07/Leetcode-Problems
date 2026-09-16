class Solution:
    def findPeakElement(self, nums: list[int]) -> int:
        maximum=max(nums)
        return nums.index(maximum)