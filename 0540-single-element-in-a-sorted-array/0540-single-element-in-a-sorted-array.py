class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        for i in range(len[nums]):
            if nums[i]!=nums[i+1] or nums[i]!=nums[i-1]:
                return nums[i]


class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        l=0
        r=len(nums) - 1
        while l<r:
            mid=(l+r)//2
            if mid%2==1:
                mid=mid-1
            if nums[mid]==nums[mid+1]:
                l=mid+2
            else:
                r=mid
        return nums[l]