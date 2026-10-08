class Solution:
    def removeOuterParentheses(self, s: str) -> str:
        arr=[]
        c=0
        for ch in s:
            if ch=='(':
                c+=1
                if c>1:
                    arr.append(ch)
            else:
                c-=1
                if c>0:
                    arr.append(ch)
        return ''.join(arr)