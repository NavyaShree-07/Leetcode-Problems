
class Solution:
    def maximumWealth(self, accounts):
        money=0
        for i in accounts:
            t=sum(i)
            if t>money:
                money=t
        return money
