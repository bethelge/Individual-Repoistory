from typing import List

class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        result = []
        for i in range(0, len(nums), 2):  # Iterate in steps of 2
            freq = nums[i]     # freq is at index i
            val = nums[i + 1]  # val is at index i + 1
            result.extend([val] * freq)  # Add 'freq' occurrences of 'val'
        return result
