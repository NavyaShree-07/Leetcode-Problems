class Solution:
    def sortSentence(self, s: str) -> str:
        words = s.split()
        ans = [""] * len(words)
        for i in words:
            pos = int(i[-1]) - 1
            ans[pos] = i[:-1]
        return " ".join(ans)