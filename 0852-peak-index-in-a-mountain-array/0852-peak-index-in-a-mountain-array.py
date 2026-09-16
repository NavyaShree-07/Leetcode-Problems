class Solution:
    def peakIndexInMountainArray(self, arr: List[int]) -> int:
        maxi=max(arr)
        return arr.index(maxi)