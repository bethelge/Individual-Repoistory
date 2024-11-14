from typing import List

class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        # Convert nums1 and nums2 to sets to remove duplicates and allow set operations
        set1 = set(nums1)
        set2 = set(nums2)
        
        # Find elements in set1 that are not in set2 and vice versa
        answer = [list(set1 - set2), list(set2 - set1)]
        
        return answer

        