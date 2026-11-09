class Solution:
    def deleteGreatestValue(self, grid: List[List[int]]) -> int:
        for i in grid:
            i.sort()
        ans = 0
        for i in range(len(grid[0])):
            ans += max(row.pop() for row in grid)
        return ans