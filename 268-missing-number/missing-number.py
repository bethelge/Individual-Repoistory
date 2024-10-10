class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        allXOR = 0
        for i in range(len(nums) + 1): 
            allXOR ^= i
        for num in nums:
            allXOR ^= num
        
        return allXOR
    
solution = Solution()
num =[3,0,1]
print(solution.missingNumber(num))  