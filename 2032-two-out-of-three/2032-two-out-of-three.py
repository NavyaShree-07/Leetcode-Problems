class Solution:
    def twoOutOfThree(self, nums1: List[int], nums2: List[int], nums3: List[int]) -> List[int]:
        ans = []
        for i in set(nums1 + nums2 + nums3):
            if (i in nums1) + (i in nums2) + (i in nums3) >= 2:
                ans.append(i)
        return ans