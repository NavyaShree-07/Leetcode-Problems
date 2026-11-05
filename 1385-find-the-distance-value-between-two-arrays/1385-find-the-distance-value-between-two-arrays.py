class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        count=0
        for i in arr1:
            if all(abs(i-j)>d for j in arr2):
                count+=1
        return count
