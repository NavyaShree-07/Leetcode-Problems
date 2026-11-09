class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        a = []
        for i in set(arr):
            a.append(arr.count(i))
        return len(a) == len(set(a))