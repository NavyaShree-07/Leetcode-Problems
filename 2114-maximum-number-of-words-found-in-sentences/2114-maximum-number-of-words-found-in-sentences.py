
class Solution:
    def mostWordsFound(self, sentences):
        mwords=0
        for i in sentences:
            words=len(i.split())
            if words>mwords:
                mwords=words
        return mwords