class Solution:
    def maxArea(self, height: List[int]) -> int:
        l=0
        r=len(height)-1
        maxarea=0
        while l<r:
            w=r-l
            h=min(height[l],height[r])
            a=w*h
            maxarea=max(maxarea,a)
            if height[l]<height[r]:
                l+=1
            else:
                r-=1

        return maxarea