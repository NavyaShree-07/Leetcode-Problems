class Solution:
    def longestOnes(self, nums, k):
        s=0
        e=0
        z=0
        max_len=0
        while e<len(nums):
            if nums[e]==0:
                z+=1
            while z>k:
                if nums[s]==0:
                    z-=1
                s+=1
            le=e-s+1
            if le>max_len:
                max_len=le
            e+=1
        return max_len