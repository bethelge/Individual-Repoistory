class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        total = 0
        n = len(nums)
        for i in range (n):
            for j in range(i+1, n):
                if nums[i] == nums[j] :
                     total += 1
        return total
       
