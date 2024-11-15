from typing import List

class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        # Calculate the wealth of each customer and return the maximum
        return max(sum(account) for account in accounts)
