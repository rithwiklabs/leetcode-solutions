class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n=len(nums)
        t_sum=(n*(n+1))//2
        val=sum(nums)
        return t_sum-val
        