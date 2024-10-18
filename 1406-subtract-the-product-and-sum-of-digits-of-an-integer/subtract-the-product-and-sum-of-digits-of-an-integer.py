class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        digits = [int(d) for d in str(n)]
        product = 1
        sum = 0
        for digit in digits:
            product *= digit
            sum += digit
        result = product - sum
        return result