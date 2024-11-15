class Solution:
    def balancedStringSplit(self, s: str) -> int:
        balance = 0
        count = 0
        
        for char in s:
            # Adjust balance based on the character
            if char == 'R':
                balance += 1
            elif char == 'L':
                balance -= 1
            
            # Increment count whenever balance becomes zero
            if balance == 0:
                count += 1
        
        return count
