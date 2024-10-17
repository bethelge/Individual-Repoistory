class Solution:
    def findMiddleIndex(self, nums: List[int]) -> int:
        leftPartSum = 0
        rightPartSum = sum(nums)
        for i, num in enumerate(nums):
            rightPartSum -= num
            if leftPartSum == rightPartSum:
                return i
            leftPartSum += num
        return -1