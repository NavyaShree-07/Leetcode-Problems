class Solution:
    def countCharacters(self, words: List[str], chars: str) -> int:
        count = 0
        for word in words:
            temp = list(chars)
            for c in word:
                if c in temp:
                    temp.remove(c)
                else:
                    break
            else:
                count += len(word)
        return count
