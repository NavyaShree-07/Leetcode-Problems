class Solution:
    def minStartValue(self, nums: List[int]) -> int:
        sums=mini=0
        for i in nums:
            sums=sums+i
            mini=min(mini,sums)
        return 1-mini
