class Solution:
    def numberOfMatches(self, n: int) -> int:
        matches = 0
        
        while n > 1:
            if n % 2 == 0:  # If the number of teams is even
                matches += n // 2
                n = n // 2
            else:  # If the number of teams is odd
                matches += (n - 1) // 2
                n = (n - 1) // 2 + 1
        
        return matches
