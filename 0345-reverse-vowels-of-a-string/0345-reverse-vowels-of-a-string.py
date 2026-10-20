class Solution:
    def reverseVowels(self, s: str) -> str:
        vow="aeiouAEIOU"
        v=[c for c in s if c in vow]
        a=""
        for c in s:
            if c in vow:
                a+=v.pop()
            else:
                a+=c
        return a
