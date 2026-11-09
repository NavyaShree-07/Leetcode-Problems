class Solution:
    def matrixReshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        m = len(mat)
        n = len(mat[0])
        if m * n != r * c:
            return mat
        arr = []
        for i in mat:
            for j in i:
                arr.append(j)
        ans = []
        for i in range(r):
            ans.append(arr[i*c:(i+1)*c])
        return ans